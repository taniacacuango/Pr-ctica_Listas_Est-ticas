/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.listaNúmeros;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la vista y el modelo
        listaNúmeros listaNumeros = new listaNúmeros();
        Scanner scanner = new Scanner(System.in);

        // Obtener el divisor del usuario
        int divisor = obtenerDivisor(scanner);

        // Generar la lista de números divisibles
        listaNumeros.generarListaDivisibles(divisor);

        // Mostrar la lista de números divisibles
        mostrarLista(listaNumeros.getListaDivisibles());
    }

    private static int obtenerDivisor(Scanner scanner) {
        int divisor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print("Introduce un número entre 2 y 7 para encontrar sus divisibles: ");
            if (scanner.hasNextInt()) {
                divisor = scanner.nextInt();
                if (divisor >= 2 && divisor <= 7) {
                    valido = true;
                } else {
                    System.out.println("El número debe estar entre 2 y 7. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Limpiar la entrada no válida
            }
        }
        return divisor;
    }

    private static void mostrarLista(List<Integer> lista) {
        System.out.println("Lista de números divisibles:");
        System.out.println(lista);
    }
}
