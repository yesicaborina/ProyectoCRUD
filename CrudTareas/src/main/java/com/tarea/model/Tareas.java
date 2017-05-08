package com.tarea.model;





import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Tareas {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_tareas;
	@Column
	private String descripcion;
	@Column
	private String asignado;
	@Column
	private Date fecha_Inicio;
	@Column
	private Date fecha_fin;
	
	public Tareas(){}
	
	public Tareas(int idtarea, String descripcion, String asignado,
			Date fechaInicio, Date fechafin) {
		super();
		this.id_tareas = idtarea;
		this.descripcion = descripcion;
		this.asignado = asignado;
		this.fecha_Inicio = fechaInicio;
		this.fecha_fin = fechafin;
	}
	
	
	public int getId_tareas() {
		return id_tareas;
	}

	public void setId_tareas(int id_tareas) {
		this.id_tareas = id_tareas;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAsignado() {
		return asignado;
	}
	public void setAsignado(String asignado) {
		this.asignado = asignado;
	}

	public Date getFecha_Inicio() {
		return fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
	



}
