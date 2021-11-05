/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

/**
 *
 * @author pablo
 */
public  class Elector{
     
     private String cedula;
     private String codigoElectoral;
     private String relleno;
     private String fechaCaducidad;
     private String juntaVotacion;
     private String nombre;
     private String primerApellido1;
     private String segundoApellido1;

    public Elector(String cedula, String codigoElectoral, String relleno, String fechaCaducidad, String juntaVotacion, String nombre, String primerApellido1, String segundoApellido1) {
        this.cedula = cedula;
        this.codigoElectoral = codigoElectoral;
        this.relleno = relleno;
        this.fechaCaducidad = fechaCaducidad;
        this.juntaVotacion = juntaVotacion;
        this.nombre = nombre;
        this.primerApellido1 = primerApellido1;
        this.segundoApellido1 = segundoApellido1;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the codigoElectoral
     */
    public String getCodigoElectoral() {
        return codigoElectoral;
    }

    /**
     * @param codigoElectoral the codigoElectoral to set
     */
    public void setCodigoElectoral(String codigoElectoral) {
        this.codigoElectoral = codigoElectoral;
    }

    /**
     * @return the relleno
     */
    public String getRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the juntaVotacion
     */
    public String getJuntaVotacion() {
        return juntaVotacion;
    }

    /**
     * @param juntaVotacion the juntaVotacion to set
     */
    public void setJuntaVotacion(String juntaVotacion) {
        this.juntaVotacion = juntaVotacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido1
     */
    public String getPrimerApellido1() {
        return primerApellido1;
    }

    /**
     * @param primerApellido1 the primerApellido1 to set
     */
    public void setPrimerApellido1(String primerApellido1) {
        this.primerApellido1 = primerApellido1;
    }

    /**
     * @return the segundoApellido1
     */
    public String getSegundoApellido1() {
        return segundoApellido1;
    }

    /**
     * @param segundoApellido1 the segundoApellido1 to set
     */
    public void setSegundoApellido1(String segundoApellido1) {
        this.segundoApellido1 = segundoApellido1;
    }
    

         
 @Override
    public String toString() {
        return this.nombre.trim() 
                +" "+this.primerApellido1.trim()
                + " "+ this.segundoApellido1.trim();
    }

}
