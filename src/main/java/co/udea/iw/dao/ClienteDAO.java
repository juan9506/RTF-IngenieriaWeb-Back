package co.udea.iw.dao;
import java.util.Date;
import java.util.List;

import co.udea.iw.exception.Exception;
import co.udea.iw.dto.Cliente;
import co.udea.iw.dto.Personal;

/**
 * 
 * @author Juan Esteban Andrade - Luis Marin
 * Clase para definir el modelo de los datos obtenidos de la tabla cliente
 *
 */
public interface ClienteDAO {

	/**
	 * Metodo para generar una solicitud creada por el cliente
	 * @param id
	 * @param titulo
	 * @param descripcion
	 * @param fecha_solucion
	 * @param responsable
	 * @param complejidad
	 * @param cliente
	 * @throws Exception
	 */
	public void generarSolicitud(int id, String titulo, String descripcion, Date fecha_solucion,  Personal responsable, String complejidad, Cliente cliente) throws Exception;
	public void crearCliente(Cliente cliente) throws Exception;
	public List<Cliente> listarClientes() throws Exception;
}
