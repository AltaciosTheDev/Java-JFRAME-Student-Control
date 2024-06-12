/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceutec.clasesemana7repaso;

/**
 *
 * @author enzoa
 */
public class Alumno {
    String nombre;
    int cuenta;
    int acumulado;
    int examen;

    public Alumno(String nombre, int cuenta, int acumulado, int examen) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.acumulado = acumulado;
        this.examen = examen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }
    
    public int calcularNotaFinal(){
        return acumulado + examen;
    }
}
