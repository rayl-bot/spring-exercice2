package spring.project.exercice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.project.exercice.dto.Empleado;
import spring.project.exercice.dao.IEmpleadoDao;

@Service
public class EmpleadoServiceImpl implements IEmpleadosService{
    
    @Autowired
    IEmpleadoDao iEmpleadoDao;

    @Override
    public List<Empleado> listarEmpleados(){
        return iEmpleadoDao.findAll();
    } //Listar All 
	
    @Override
	public Empleado guardarEmpleado(Empleado empleado){
        return iEmpleadoDao.save(empleado);
    }	//Guarda un cliente CREATE
	
    @Override
	public Empleado empleadoXID(Long id){
        return iEmpleadoDao.findById(id).get();
    } //Leer datos de un cliente READ
	
    @Override
	public List<Empleado> listarEmpleadoNombre(String nombre){
        return iEmpleadoDao.findByNombre(nombre);
    }//Listar Clientes por campo nombre
	
    @Override
	public Empleado actualizarEmpleado(Empleado cliente){
        return iEmpleadoDao.save(cliente);
    } //Actualiza datos del cliente UPDATE
	
    @Override
	public void eliminarEmpleado(Long id){
        iEmpleadoDao.deleteById(id);
    }// Elimina el cliente DELETE
}
