package com.tarea.dao;

import java.util.List;

import com.tarea.model.Tareas;

public interface TareasDao {
	
	public void add(Tareas tarea);
	public void edit(Tareas tarea);
	public void delete(int idtarea);
	public Tareas getTareas(int idtarea);
	public List getAllTareas();
	

}
