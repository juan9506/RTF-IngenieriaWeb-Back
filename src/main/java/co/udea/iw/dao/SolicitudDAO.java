package co.udea.iw.dao;

import co.udea.iw.dto.Solicitud;
import java.util.List;
/**
 * 
 * @author Juan Esteban Andrade - Luis Marin
 *Clase para definir el modelo de los datos obtenidos de la tabla solicitud
 */
public interface SolicitudDAO {
	/**
	 * Metodo para obtener Todas las solicitudes de la base de datos
	 * @return Lista de solicitudes en la base de datos
	 * @throws Exception
	 */
	public List<Solicitud> getSolicitudes() throws Exception;
}
