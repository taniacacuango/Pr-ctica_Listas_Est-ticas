/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// vista/MainGestorPersonas.java
package vista;

import modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPersonas {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Capturando datos de la persona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            personas.add(new Persona(nombre, apellido, genero, edad));
        }

        System.out.println("\nNombres y géneros de las personas capturadas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Género: " + persona.getGenero());
        }

        double sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        double promedioEdades = sumaEdades / personas.size();
        System.out.println("Promedio de edades: " + promedioEdades);

        int contadorMasculino = 0;
        int contadorFemenino = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("masculino")) {
                contadorMasculino++;
            } else if (persona.getGenero().equalsIgnoreCase("femenino")) {
                contadorFemenino++;
            }
        }
        System.out.println("Cantidad de personas masculinas: " + contadorMasculino);
        System.out.println("Cantidad de personas femeninas: " + contadorFemenino);
    }
}
