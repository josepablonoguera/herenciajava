/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pablo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        System.out.println("Ingrese x=");
         double x=0;
        try {
             x = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
            System.out.println("Fallo al escribir el dato x");
        }catch (NumberFormatException exFE){
            System.out.println("Solo se pueden ingresar números");
        }
        System.out.println("Ingrese y=");
         double y=0;
        try {
             y = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
            System.out.println("Fallo al escribir el dato y");
        }catch (NumberFormatException exFE){
            System.out.println("Solo se pueden ingresar números");
        }
        catch (Exception exFE){
            System.out.println("error en numero");
        }
        double resultado = division(x,y);
        System.out.println(resultado);
    }

    private static double division(double x, double y) {
        double division = 0.0;
        try {
            division = x / y;
        } catch (Exception e) {
            System.out.println("No puede dividir por cero: "+ e);
        }
        return division;
    }
    
}
