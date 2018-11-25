package co.udea.iw.dto;

import java.io.Serializable;
/**
 * Clase DTO que define el modelo de la tabla Cliente en la base de datos
 * @author Juan Esteban Andrade - Luis Marin
 *
 */
public class Cliente implements Serializable{

	private int id;
	private String nombres;
	private String email;
	
	public Cliente(int id, String nombres, String email) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
