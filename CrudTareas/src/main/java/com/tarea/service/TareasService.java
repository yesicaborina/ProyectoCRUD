package com.tarea.service;

import java.util.List;

import com.tarea.model.Tareas;

public interface TareasService {
	public void add(Tareas tarea);
	public void edit(Tareas tarea);
	public void delete(int idtarea);
	public Tareas getTareas(int idtarea);
	public List getAllTareas();

}
