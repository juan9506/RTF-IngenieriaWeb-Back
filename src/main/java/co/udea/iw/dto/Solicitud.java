package co.udea.iw.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Clase DTO que define el modelo de la tabla Solicitud en la base de datos
 * @author Juan Esteban Andrade - Luis Marin
 *
 */
public class Solicitud implements Serializable{

	private int id;
	private String titulo;
	private String descripcion;
	private Date fecha_creacion;
	private Date fecha_solucion;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsable", referencedColumnName = "id")
	private Personal responsable;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente", referencedColumnName = "id")
	private Cliente cliente;
	private String complejidad;
	private String respuesta;
	
	public Solicitud(int id, String titulo, String descripcion, Date fecha_creacion, Date fecha_solucion,
			Personal responsable, Cliente cliente, String complejidad) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha_creacion = fecha_creacion;
		this.fecha_solucion = fecha_solucion;
		this.responsable = responsable;
		this.cliente = cliente;
		this.complejidad = complejidad;
		this.respuesta = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_solucion() {
		return fecha_solucion;
	}

	public void setFecha_solucion(Date fecha_solucion) {
		this.fecha_solucion = fecha_solucion;
	}

	public Personal getResponsable() {
		return responsable;
	}

	public void setResponsable(Personal responsable) {
		this.responsable = responsable;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(String complejidad) {
		this.complejidad = complejidad;
	}
	
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public String getRespuesta() {
		return this.respuesta;
	}
}
