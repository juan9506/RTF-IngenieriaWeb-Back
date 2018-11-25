package co.udea.iw.dao.impl;

import co.udea.iw.dto.Cliente;
import co.udea.iw.dto.Personal;
import co.udea.iw.dto.Solicitud;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.udea.iw.dao.ClienteDAO;
import co.udea.iw.exception.Exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 * 
 * @author Juan Esteban Andrade - Luis Marin
 * Implementacion del DAO de clientes
 *
 */
@Service("clienteService")
public class ClienteImpl extends HibernateDaoSupport implements ClienteDAO {

	/**
	 * Implementacion del m�todo de generar solicitud por el cliente
	 */
	@Transactional
	@Override
	public void generarSolicitud(int id, String titulo, String descripcion, Date fecha_solucion, Personal responsable, String complejidad, Cliente cliente) throws Exception {
		Solicitud solicitud = new Solicitud(id, titulo, descripcion, new Date(), fecha_solucion, responsable, cliente, complejidad);
		Session session = null;
		try {
			session = getSession();
			session.save(solicitud);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			throw new Exception(e);
		}finally {
			session.close();
		}
	}

	@Transactional
	@Override
	public void crearCliente(Cliente cliente) throws Exception{
		Session sesion = null;
		try {
			sesion = getSession();
			sesion.save(cliente);
			sesion.getTransaction().commit();
		}catch(HibernateException e) {
			throw new Exception(e);
		}
		finally {
			sesion.close();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked") 
	public List<Cliente> listarClientes() throws Exception {
		List<Cliente> clientes = null;
		Session session = null;
		try {
			session = getSession();
			clientes =  session.createCriteria(Cliente.class).list();
		}finally {
			session.close();
		}
		return clientes;
	}
	
}
