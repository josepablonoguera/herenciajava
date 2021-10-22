/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclases;

/**
 *
 * @author pablo
 */
public interface NewInterface {

    /**
     * @param apellido the apellido to set
     */
    void setApellido(String apellido);

    /**
     * @param cedula the cedula to set
     */
    void setCedula(String cedula);

    /**
     * @param direccion the direccion to set
     */
    void setDireccion(String direccion);

    /**
     * @param horario the horario to set
     */
    void setHorario(String horario);

    /**
     * @param nombre the nombre to set
     */
    void setNombre(String nombre);

    /**
     * @param telefono the telefono to set
     */
    void setTelefono(String telefono);

    String toString();
    
}
