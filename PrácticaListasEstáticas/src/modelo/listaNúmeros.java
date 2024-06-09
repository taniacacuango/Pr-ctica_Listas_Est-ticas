/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.util.ArrayList;
import java.util.List;

public class listaNúmeros {
    private List<Integer> listaCompleta;
    private List<Integer> listaDivisibles;

    public listaNúmeros() {
        listaCompleta = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listaCompleta.add(i);
        }
        listaDivisibles = new ArrayList<>();
    }

    public void generarListaDivisibles(int divisor) {
        if (divisor < 2 || divisor > 7) {
            throw new IllegalArgumentException("El divisor debe estar entre 2 y 7");
        }
        listaDivisibles.clear();
        for (int num : listaCompleta) {
            if (num % divisor == 0) {
                listaDivisibles.add(num);
            }
        }
    }

    public List<Integer> getListaDivisibles() {
        return listaDivisibles;
    }
}
