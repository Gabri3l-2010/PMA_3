
package org.gabrielchiu.com;

public class Estudiante {
    private String nombre;
    private int carnet;

    public Estudiante(String nombre, int carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " - Carnet: " + carnet);
    }
}