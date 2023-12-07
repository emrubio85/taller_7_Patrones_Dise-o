/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parrafo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ProductoBuilder {
    private String id;
    private String nombre;
    private String marca;
    private String modelo;
    private double peso;
    private double precio;
    private List<String> nuevasCaracteristicas; 

    public ProductoBuilder(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.nuevasCaracteristicas = new ArrayList<>();
    }

    public ProductoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProductoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProductoBuilder peso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder agregarCaracteristica(String caracteristica) {
        this.nuevasCaracteristicas.add(caracteristica);
        return this;
    }

    public Producto build() {
        // Devolver el Producto genérico
        Producto producto = new ProductoComun(this);

        // Aplicar decoradores según sea necesario
        if (!nuevasCaracteristicas.isEmpty()) {
            producto = new ProductoDecorator(producto, nuevasCaracteristicas);
        }

        return producto;
    }

    // Clase interna ProductoGenérico
    private static class ProductoComun implements Producto {
        private String id;
        private String nombre;
        private String marca;
        private String modelo;
        private double peso;
        private double precio;

        private ProductoComun(ProductoBuilder builder) {
            this.id = builder.id;
            this.nombre = builder.nombre;
            this.marca = builder.marca;
            this.modelo = builder.modelo;
            this.peso = builder.peso;
            this.precio = builder.precio;
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Producto Comun: " + nombre + ", Marca: " + marca + ", Precio: $" + precio);
        }
    }
}
