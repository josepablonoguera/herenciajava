/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshijas;

import java.util.Date;
import superclases.Persona;

/**
 *
 * @author pablo
 */
public class Estudiante extends Persona{

    private String carnet;
    private String carrera;
    private Date annoIngreso;

    public Estudiante(String carnet, String carrera, Date annoIngreso, String cedula, String nombre, String apellido, String direccion, String telefono, String horario) {
        super(cedula, nombre, apellido, direccion, telefono, horario);
        this.carnet = carnet;
        this.carrera = carrera;
        this.annoIngreso = annoIngreso;
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the annoIngreso
     */
    public Date getAnnoIngreso() {
        return annoIngreso;
    }

    /**
     * @param annoIngreso the annoIngreso to set
     */
    public void setAnnoIngreso(Date annoIngreso) {
        this.annoIngreso = annoIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarnet: " + this.carnet + "\nCarrera: " + this.carrera;
    }

}
