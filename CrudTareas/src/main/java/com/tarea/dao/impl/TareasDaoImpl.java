package com.tarea.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tarea.dao.TareasDao;
import com.tarea.model.Tareas;

@Repository

public class TareasDaoImpl implements TareasDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Tareas tarea) {
		session.getCurrentSession().save(tarea);

	}

	@Override
	public void edit(Tareas tarea) {
		session.getCurrentSession().update(tarea);

	}

	@Override
	public void delete(int idtarea) {
		session.getCurrentSession().delete(getTareas(idtarea));

	}

	@Override
	public Tareas getTareas(int idtarea) {
		return (Tareas)session.getCurrentSession().get(Tareas.class, idtarea);
		
	}

	@Override
	public List getAllTareas() {
		
		return session.getCurrentSession().createQuery("from Tareas").list();
	}

}
