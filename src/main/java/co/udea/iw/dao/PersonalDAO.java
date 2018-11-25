package co.udea.iw.dao;

import java.util.List;

import co.udea.iw.dto.Personal;
import co.udea.iw.dto.Solicitud;
import co.udea.iw.exception.Exception;
/**
 * 
 * @author Juan Esteban Andrade - Luis Marin
 * Clase para definir el modelo de los datos obtenidos de la tabla persona
 *
 */
public interface PersonalDAO {
	/**
	 * Metodo para obtener las solicitudes activas en la base de datos
	 * @return Lista de solicitudes de la base de datos
	 * @throws Exception
	 */
	public List<Solicitud> listarSolicitudes() throws Exception;
	
	/**
	 * Metodo para registrar la respuesta a una solicitud
	 * @param idSolicitud id de la solicitud a responder
	 * @param respuesta respuesta del gerente o responsable de esta solicitud
	 * @return la respuesta dada
	 * @throws Exception
	 */
	public String responderSolicitud(int idSolicitud, String respuesta) throws Exception;
	
	/**
	 * Metodo para obtener todos los miembros del personal, calificados para dar respuesta a las solicitudes
	 * @return Lista de empleados
	 * @throws Exception
	 */
	public List<Personal> listarPersonal() throws Exception;
}
