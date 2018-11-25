
package co.udea.iw.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import co.udea.iw.dao.ClienteDAO;
import co.udea.iw.dao.PersonalDAO;
import co.udea.iw.dao.SolicitudDAO;
import co.udea.iw.dto.Cliente;
import co.udea.iw.dto.Personal;
import co.udea.iw.dto.Solicitud;
import co.udea.iw.exception.Exception;
import javax.ws.rs.core.MediaType;

@Component
@Path("/servicios")
@Scope("request")
public class MyResource {

	@Autowired 
	ClienteDAO clienteService;
	
	@Autowired
	PersonalDAO personalDao;
	
	@Autowired
	SolicitudDAO solicitudDao;
	
    @GET 
    @Path("/crearCliente/{id}/{nombre}/{email}")
    @Produces("text/plain")
    public String crearCliente(@QueryParam("nombre") String nombre, @QueryParam("email") String email, @QueryParam("id") int id) {
        Cliente cliente = new Cliente(id, nombre, email);
        try {
        	clienteService.crearCliente(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "El Cliente " + nombre + " fue agregado correctamente";
    }
    
    @POST
    @Path("/generarSolicitud/{id}/{titulo}/{descripcion}/{complejidad}/{cliente}")
    @Produces("text/plain")
    public String generarSolicitud(@QueryParam("id") int id, @QueryParam("titulo") String titulo, @QueryParam("descripcion") String descripcion
    		, @QueryParam("complejidad") String complejidad, @QueryParam("cliente") String cliente) {
    	return "La solicitud numero " + id + " ha sido generada";
    }

    @GET
    @Path("/listarClientes")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Cliente> listarClientes() {
    	try {
			return clienteService.listarClientes();
		} catch (Exception e) {
			new Exception(e);
		}
		return null;
    }

    @GET
    @Path("/listarSolicitudes")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Solicitud> listarSolicitudes() {
    	try {
			return personalDao.listarSolicitudes();
		} catch (Exception e) {
			new Exception(e);
		}
		return null;
    }

    @GET
    @Path("/listarPersonal")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Personal> listarPersonal() {
    	try {
			return personalDao.listarPersonal();
		} catch (Exception e) {
			new Exception(e);
		}
		return null;
    }
    
    @GET
    @Path("/getSolicitudes")
    @Produces("text/plain")
    public String getsolicitudes() {
    	try {
			solicitudDao.getSolicitudes();
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "Correcto";
    }
}
