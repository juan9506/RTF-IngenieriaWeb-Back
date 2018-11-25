package co.udea.iw.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.udea.iw.dao.ClienteDAO;
import co.udea.iw.exception.Exception;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="/configuracion.xml")
public class ClienteImplTest {

	@Autowired 
	ClienteDAO clienteDao;
	
	@Test
	public void testListarClientes() {
		try {
			clienteDao.listarClientes();
			assertTrue(true);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
