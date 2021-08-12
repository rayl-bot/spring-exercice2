package spring.project.exercice.service;

import java.util.List;

import spring.project.exercice.dto.Empleado;

public interface IEmpleadosService {
    //Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un cliente CREATE
	
	public Empleado empleadoXID(Long id); //Leer datos de un cliente READ
	
	public List<Empleado> listarEmpleadoNombre(String nombre);//Listar Clientes por campo nombre
	
	public Empleado actualizarEmpleado(Empleado cliente); //Actualiza datos del cliente UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el cliente DELETE
}
