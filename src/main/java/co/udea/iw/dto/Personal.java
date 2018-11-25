package co.udea.iw.dto;

import java.io.Serializable;

/**
 * Clase DTO que define el modelo de la tabla Personal en la base de datos
 * @author Juan Esteban Andrade - Luis Marin
 *
 */
public class Personal implements Serializable{

	private int id;
	private String nombres;
	private String rol;
	
	public Personal(int id, String nombres, String rol) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
