package co.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.udea.iw.dao.PersonalDAO;
import co.udea.iw.dto.Cliente;
import co.udea.iw.dto.Personal;
import co.udea.iw.dto.Solicitud;
import co.udea.iw.exception.Exception;

/**
 * Implementacion de los metodos de la clase PersonaDAO
 * @author Juan Esteban Andrade - Luis Marin
 *
 */
public class PersonalImpl extends HibernateDaoSupport implements PersonalDAO {

	/**
	 * Implementaci�n del metodo que lista todas las solicitudes de la base de datos
	 */
	@Override
	public List<Solicitud> listarSolicitudes() throws Exception {
		List<Solicitud> solicitudes = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Solicitud.class);
			solicitudes = criteria.list();
		}catch(HibernateException e) {
			throw new Exception(e.getMessage());
		}finally {
			session.close();
		}
		return solicitudes;
	}

	/**
	 * Implementacion del metodo que registra la respuesta a una solicitud
	 * @return la respuesta dada
	 */
	@Override
	public String responderSolicitud(int idSolicitud, String respuesta) throws Exception {
		Session session = null;
		try {
			session = getSession();
			Solicitud solicitud = (Solicitud)session.get(Solicitud.class,idSolicitud);
			session.update(solicitud);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			throw new Exception(e);
		}finally {
			session.close();
		}
		return respuesta;
	}

	/**
	 * Implementacion del metodo que lista todos los miembros del personal
	 * @return Lista de empleados activos
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Personal> listarPersonal() throws Exception {
		List<Personal> empleados = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Personal.class);
			empleados = criteria.list();
		}catch(HibernateException e) {
			throw new Exception(e.getMessage());
		}finally {
			session.close();
		}
		return empleados;
	}
}
