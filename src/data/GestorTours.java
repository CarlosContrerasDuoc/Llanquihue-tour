/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class GestorTours {
    public List<Tour> cargarDesdeArchivo(String rutaArchivo) {
        List<Tour> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                
        // Separación de campos por punto y coma (;)
        String[] partes = linea.split(";");

        if (partes.length == 3) {
          String nombre = partes[0].trim();
          String destino = partes[1].trim();
          int precio = Integer.parseInt(partes[2].trim());

          // Creación del objeto y adición a la lista dinámica
          Tour tour = new Tour (nombre, destino, precio);
          lista.add(tour);

        }

      }
      System.out.println("--> Exito: Se cargaron " + lista.size() + " tours desde el archivo.");
    } catch (IOException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    } catch (NumberFormatException e) {
      System.err.println("Error al parsear el precio: " + e.getMessage());
    }
    return lista;
    }
}