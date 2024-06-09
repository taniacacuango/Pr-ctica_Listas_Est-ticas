/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Coche {
    private String propietario;
    private String matricula;
    private String marca;
    private boolean reparado;

    public Coche(String propietario, String matricula, String marca) {
        this.propietario = propietario;
        this.matricula = matricula;
        this.marca = marca;
        this.reparado = false;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    @Override
    public String toString() {
        return "Coche [propietario=" + propietario + ", matricula=" + matricula + ", marca=" + marca + ", reparado=" + reparado + "]";
    }
}
