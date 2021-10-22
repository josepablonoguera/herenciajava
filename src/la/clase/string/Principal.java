/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.clase.string;

/**
 *
 * @author pablo
 */
public class Principal {

    String frase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String frase = "anita lava la tina";
         
        String [] partes = frase.split(",");
        
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i].trim().toUpperCase());
        }
        
        

        
    }

}
