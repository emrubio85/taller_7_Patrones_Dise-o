/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parrafo1;

import java.util.List;

/**
 *
 * @author crist
 */
public class CelularDecorator extends ProductoDecorator{
    private int Id;
    private String marca;
    private String Modelo;
    private String Nombre;
    private int Peso;
    private int Precio;

    public CelularDecorator(int Id, String marca, String Modelo, String Nombre, int Peso, int Precio, Producto productoBase, List<String> nuevasCaracteristicas) {
        super(productoBase, nuevasCaracteristicas);
        this.Id = Id;
        this.marca = marca;
        this.Modelo = Modelo;
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Precio = Precio;
    }
    
    
    
    public void mostrarInfo() {
        productoBase.mostrarInfo();
        System.out.println("Características Celular: " + nuevasCaracteristicas);
    }
}

