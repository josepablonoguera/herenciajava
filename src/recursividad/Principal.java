/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author pablo
 */
public class Principal {

  

    public static void main(String[] args) {

        
        int vector[]= {1,2,3,4,5};
        
        int resultado = suma(vector, vector.length-1);
        
        System.out.println("resultado = " + resultado);

        
//        boolean esP = esPar(8);
//
//        
//
//        if (esP) {
//
//            System.out.println("Es par");
//
//        }else{
//
//            System.out.println("No es par");
//
//        }



    }



    private static boolean esPar(int n) {

        if (n == 0) {

            return true;

        }        

        return imPar(n-1);

    }

    

     private static boolean imPar(int n) {

        if (n == 0) {

            return false;

        }        

        return esPar(n-1);

    }

    private static int suma(int[] vector, int inicio) {
        
       
        if(inicio ==0){
            return vector[inicio];
        }
        
        return vector[inicio] + suma(vector, inicio - 1);
     }


    
}
