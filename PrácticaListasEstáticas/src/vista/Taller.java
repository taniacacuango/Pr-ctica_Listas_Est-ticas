/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Coche;

public class Taller {
    private static final List<Coche> coches = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Entrada nueva reparación");
            System.out.println("2. Salida de coche reparado");
            System.out.println("3. Listado de vehículos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> entradaNuevaReparacion(scanner);
                case 2 -> salidaCocheReparado(scanner);
                case 3 -> listadoVehiculos();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void entradaNuevaReparacion(Scanner scanner) {
        System.out.print("Propietario: ");
        String propietario = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        Coche coche = new Coche(propietario, matricula, marca);
        coches.add(coche);
        System.out.println("Coche registrado con éxito.");
    }

    private static void salidaCocheReparado(Scanner scanner) {
        System.out.print("Nombre del propietario: ");
        String propietario = scanner.nextLine();
        for (Coche coche : coches) {
            if (coche.getPropietario().equals(propietario)) {
                coche.setReparado(true);
                System.out.println("Coche de " + propietario + " marcado como reparado.");
                return;
            }
        }
        System.out.println("Coche no encontrado.");
    }

    private static void listadoVehiculos() {
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}
