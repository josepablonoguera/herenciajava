/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshijas;

import superclases.Persona;

/**
 *
 * @author pablo
 */
public class Profesor extends Persona{
    
    private String curso;
    private String gradoAcademico;


    
    public Profesor(String cedula, String nombre, String apellido, String direccion, String telefono, String horario) {
        super(cedula, nombre, apellido, direccion, telefono, horario);
    }

    
     
    public Profesor(String curso, String gradoAcademico, String cedula, String nombre, String apellido, String direccion, String telefono, String horario) {
        super(cedula, nombre, apellido, direccion, telefono, horario);
        this.curso = curso;
        this.gradoAcademico = gradoAcademico;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the gradoAcademico
     */
    public String getGradoAcademico() {
        return gradoAcademico;
    }

    /**
     * @param gradoAcademico the gradoAcademico to set
     */
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + this.curso + "\nGrado Académico: " + this.gradoAcademico;
    }
    
    
    
}
