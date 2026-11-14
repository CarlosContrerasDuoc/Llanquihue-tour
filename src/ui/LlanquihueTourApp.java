/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import data.GestorTours;
import model.Tour;
import java.util.List;


/**
 *
 * @author carlo
 */
public class LlanquihueTourApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("   LLANQUIHUE TOUR - SISTEMA DE GESTION DE TOURS          ");
        System.out.println("============================================================\n");

        GestorTours gestor = new GestorTours();

        String rutaArchivo = "src/resources/Tours.txt";
        
        
        
        // 1. Cargar datos desde archivo
        List<Tour> tour = gestor.cargarDesdeArchivo(rutaArchivo);

        // 2. Recorrido completo de la colección
        System.out.println("\n--- LISTA COMPLETA DE TOURS ---");

        for (Tour t : tour) {

            System.out.println(t.toString());

        }
        
        // 3. Filtrado por condición.

        String filtroDestino = "Puerto Varas";

        System.out.println("\n--- TOURS FILTRADOS (TIPO: '" + filtroDestino.toUpperCase() + "') ---");

        for (Tour t : tour) {

            if (t.getDestino().equalsIgnoreCase(filtroDestino)) {

                System.out.println(t.toString());

            }

        }



        System.out.println("\n=================================================================");

        System.out.println("Ejecucion finalizada correctamente.");
    }
    
}
