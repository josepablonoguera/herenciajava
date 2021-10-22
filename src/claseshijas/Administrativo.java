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
public class Administrativo extends Persona  {

    private String puesto;

    public Administrativo(String puesto, String cedula, String nombre, String apellido, String direccion, String telefono, String horario) {
        super(cedula, nombre, apellido, direccion, telefono, horario);
        this.puesto = puesto;
    }

    

    @Override
    public String toString() {
        return super.toString()+"\nPuesto: "+this.getPuesto();
    }

    @Override
    public void setApellido(String apellido) {
       
        super.setApellido(apellido);
        System.out.println("Apellido en Interface"+ apellido);

    }

    @Override
    public void setCedula(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDireccion(String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void setHorario(String horario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
    System.out.println("Nombre en Interface"+ nombre);
    }

    @Override
    public void setTelefono(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
