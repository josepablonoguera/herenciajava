/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapolimorfismo;

import claseshijas.Administrativo;
import claseshijas.Estudiante;
import claseshijas.Profesor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import superclases.Persona;

/**
 *
 * @author pablo
 */
public class Principal {

    static Persona registro[];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese la cantidad de personas a registrar: ");
        String cantidad = br.readLine();
        int c = Integer.parseInt(cantidad);
        registro = new Persona[c];

        for (int i = 0; i < registro.length; i++) {
            registro[i] = crearPersona();
        }

    
        System.out.println("");
        System.out.println("-****************Personas***************-");
        for (int i = 0; i < registro.length; i++) {
            if (registro[i] instanceof Estudiante) {
                Estudiante estudiante = (Estudiante)registro[i]; 
                System.out.println(estudiante.getCarnet());
            }
             if (registro[i] instanceof Profesor) {
                Profesor profesor = (Profesor)registro[i]; 
                System.out.println(profesor.getCurso());
            }
              if (registro[i] instanceof Administrativo) {
                Administrativo administrativo = (Administrativo)registro[i]; 
                System.out.println(administrativo.getPuesto());
            }

        }
       

    }

    public static Persona crearPersona() throws IOException {

        System.out.println("Bienvenido al sistema de registro de personas");
        System.out.println("1. Crear Estudiante ");
        System.out.println("2. Crear Profesor");
        System.out.println("3. Crear Administrativo");
        int opc = 0;
        try {
            opc = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
        } catch (NumberFormatException numberFormatException) {
        }

        switch (opc) {
            case 1: {
                System.out.println("Cedula: ");
                String cedula = br.readLine();
                System.out.println("Nombre: ");
                String nombre = br.readLine();
                System.out.println("Apellido: ");
                String apellido = br.readLine();
                System.out.println("Dirección: ");
                String direccion = br.readLine();
                System.out.println("Teléfono: ");
                String telefono = br.readLine();
                System.out.println("Horario: ");
                String horario = br.readLine();
                System.out.println("Carnet: ");
                String carnet = br.readLine();
                System.out.println("Carrera: ");
                String carrera = br.readLine();
                Estudiante nuevo = new Estudiante(carnet, carrera, null, 
                        cedula, nombre, apellido, direccion, telefono, horario);
                return nuevo;
                //break;
            }
            case 2: {
                    System.out.println("Cedula: ");
                String cedula = br.readLine();
                System.out.println("Nombre: ");
                String nombre = br.readLine();
                System.out.println("Apellido: ");
                String apellido = br.readLine();
                System.out.println("Dirección: ");
                String direccion = br.readLine();
                System.out.println("Teléfono: ");
                String telefono = br.readLine();
                System.out.println("Horario: ");
                String horario = br.readLine();
                   System.out.println("Curso: ");
                String curso = br.readLine();
                System.out.println("Grado Académico: ");
                String gradoAcademico = br.readLine();
                Profesor nuevo = new Profesor(curso, gradoAcademico, 
                        cedula, nombre, apellido, direccion, telefono, horario);
                return nuevo;
               
            }
            case 3: {
                    System.out.println("Cedula: ");
                String cedula = br.readLine();
                System.out.println("Nombre: ");
                String nombre = br.readLine();
                System.out.println("Apellido: ");
                String apellido = br.readLine();
                System.out.println("Dirección: ");
                String direccion = br.readLine();
                System.out.println("Teléfono: ");
                String telefono = br.readLine();
                System.out.println("Horario: ");
                String horario = br.readLine();
                   System.out.println("Puesto: ");
                String puesto = br.readLine();
               
                Administrativo admin = new Administrativo(puesto, cedula, nombre,
                        apellido, direccion, telefono, horario);
                admin.setApellido("Vasquez");
                admin.setNombre("Juan");
                
                return admin;
               
            }
            default:
                System.out.println("Ingrese una opción correcta");
                break;

        }

       

        return null;

    }

}
