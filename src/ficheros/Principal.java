/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pablo
 */
public class Principal {

    static Elector padron[];
    static File archivo;

    public static void main(String[] args) {
        JFileChooser fileopen = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("txt files", "txt");
        fileopen.addChoosableFileFilter(filter);

        int ret = fileopen.showDialog(null, "Abrir TXT");

        if (ret == JFileChooser.APPROVE_OPTION) {
            archivo = fileopen.getSelectedFile();
            System.out.println(archivo);
        }
        int tamanno = getCantidad(archivo);
        padron = new Elector[tamanno];
        archivo = new File(archivo.getAbsolutePath());
        System.out.println("Tamaño del archivo: " + archivo.length());
        try {
            Scanner lector = new Scanner(archivo);
            int i = 0;
            while (lector.hasNextLine()) {
                String[] partes = lector.nextLine().split(",");
                Elector nuevo = new Elector(
                        partes[0],
                        partes[1],
                        partes[2],
                        partes[3],
                        partes[4],
                        partes[5],
                        partes[6],
                        partes[7]);
                padron[i] = nuevo;
                i++;
            }

            lector.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        for (int i = 0; i < padron.length; i++) {
            System.out.println(padron[i].toString());
        }
        buscarElector();

    }

    private static boolean buscarElector() {

        System.out.println("Ingrese la cédula a buscar: ");
        Scanner rl = new Scanner(System.in);
        String ced = rl.nextLine();
        
        for (int i = 0; i < padron.length; i++) {            
            if (padron[i].getCedula().equals(ced)) {
                System.out.println("Si existe el elector:  "+padron[i].toString() );
                try {
                    FileWriter fwriter = new FileWriter("encontrados.txt");
                    fwriter.write(padron[i].toString());
                    fwriter.close();
                } catch (IOException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
                
                return true;
            }
        }
        System.out.println("NO se encontro el elector");
        return false;
    }

    private static int getCantidad(File archivo) {
        int tam = 0;
        try {
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                lector.nextLine();
                tam++;
            }

            lector.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        System.out.println("Tam: " + tam);
        return tam;

    }

}
