package com.tarea.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tarea.model.Tareas;
import com.tarea.service.TareasService;

@Controller
public class TareasController {
	@Autowired
	private TareasService tareaService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Tareas tarea = new Tareas();
		map.put("tarea", tarea);
		map.put("tareaList", tareaService.getAllTareas());
		
		return "tarea";
		
	}
	
	@RequestMapping(value="/tarea.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Tareas tarea, BindingResult result, @RequestParam String action, Map<String, Object> map){ 
		Tareas tareaResult = new Tareas();
		switch(action.toLowerCase()){
			case "agregar":
				tareaService.add(tarea);
				tareaResult = tarea;
				break;
			case "modificar":
				tareaService.edit(tarea);
				tareaResult = tarea;
				break;
			case "borrar":
				tareaService.delete(tarea.getId_tareas());
				tareaResult = new Tareas();
				break;
			case "buscar":
				Tareas searchedtarea = tareaService.getTareas(tarea.getId_tareas());
				tareaResult = searchedtarea != null ? searchedtarea : new Tareas();
				break;
		}
		map.put("tarea", tareaResult);
		map.put("tareaList", tareaService.getAllTareas());
		return "tarea";
	}

}
