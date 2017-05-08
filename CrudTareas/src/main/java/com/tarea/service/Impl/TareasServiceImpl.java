package com.tarea.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tarea.dao.TareasDao;
import com.tarea.model.Tareas;
import com.tarea.service.TareasService;

@Service
public class TareasServiceImpl implements TareasService {
	@Autowired
	private TareasDao tareaDao;
	
	@Transactional
	public void add(Tareas tarea) {
		tareaDao.add(tarea);
	}

	@Transactional
	public void edit(Tareas tarea) {
		tareaDao.edit(tarea);
	}

	@Transactional
	public void delete(int idtarea) {
		tareaDao.delete(idtarea);
	}

	@Transactional
	public Tareas getTareas(int idtarea) {
		return tareaDao.getTareas(idtarea);
	}

	@Transactional
	public List getAllTareas() {
		// TODO Auto-generated method stub
		return tareaDao.getAllTareas();
	}

}
