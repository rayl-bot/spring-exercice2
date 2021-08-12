package spring.project.exercice.dto;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")//hace referencia a la tabla de empleados
public class Empleado {
    
    //Atributos de la entidad empleados
    @Id
    private Long id;
    @Column(name="name")
    private String nombre;
    @Column(name="sueldo")
    private int sueldo;

    public Empleado(){

    }

    public Empleado(Long id, String nombre, int sueldo){
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }

    public int getSueldo(){
        return this.sueldo;
    }

    //Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [id=" + this.id + ", nombre=" + this.nombre + ", apellido=" + this.sueldo + "]";
	}
    
}
