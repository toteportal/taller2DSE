package modelo.entidad;
// Generated 22-oct-2022 18:44:20 by Hibernate Tools 4.3.1



/**
 * Medicos generated by hbm2java
 */
public class Medicos  implements java.io.Serializable {


     private String nombre;
     private String apellido;
     private String especialidad;
     private int experiencia;
     private int edad;
     private int operaciones;

    public Medicos() {
    }

    public Medicos(String nombre, String apellido, String especialidad, int experiencia, int edad, int operaciones) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.especialidad = especialidad;
       this.experiencia = experiencia;
       this.edad = edad;
       this.operaciones = operaciones;
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getExperiencia() {
        return this.experiencia;
    }
    
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getOperaciones() {
        return this.operaciones;
    }
    
    public void setOperaciones(int operaciones) {
        this.operaciones = operaciones;
    }




}


