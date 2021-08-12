package spring.project.exercice.dao;

import java.util.List;

import spring.project.exercice.dto.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoDao extends JpaRepository<Empleado, Long>{
    public List<Empleado> findByNombre(String nombre);
}
