/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parrafo1;

import java.util.List;

/**
 *
 * @author usuario
 */
class ProductoDecorator implements Producto {
    private Producto productoBase;
    private List<String> nuevasCaracteristicas;

    public ProductoDecorator(Producto productoBase, List<String> nuevasCaracteristicas) {
        this.productoBase = productoBase;
        this.nuevasCaracteristicas = nuevasCaracteristicas;
    }

    @Override
    public void mostrarInfo() {
        productoBase.mostrarInfo();
        System.out.println("Nuevas Características: " + nuevasCaracteristicas);
    }
}

