package co.udea.iw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.udea.iw.dao.SolicitudDAO;
import co.udea.iw.dto.Solicitud;

/**
 * Implementacion de los metodos de la clase SolicitudDAO
 * @author Juan Esteban Andrade - Luis Marin
 *
 */
public class SolicitudImpl extends HibernateDaoSupport implements SolicitudDAO {

	/**
	 * Implementacion del metodo que lista todas las solicitudes
	 * @return una lista de las solicitudes obtenidas
	 */
	@Override
	public List<Solicitud> getSolicitudes() throws Exception {
		System.out.println("Prueba");
		return null;
	}

}
