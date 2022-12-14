/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosArrays;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author samue
 */
public class Empresa {

    private String nombre;

    private CatalogoCliente catalogoDeClientes;
    private CatalogoVehiculos catalogoDeVehiculos;
    private CatalogoAlquiler catalogoDeAlquileres;

    public Empresa(String nombre, CatalogoCliente catalogoDeClientes, CatalogoVehiculos catalogoDeVehiculos, CatalogoAlquiler catalogoDeAlquileres) {
        this.nombre = nombre;
        this.catalogoDeClientes = catalogoDeClientes;
        this.catalogoDeVehiculos = catalogoDeVehiculos;
        this.catalogoDeAlquileres = catalogoDeAlquileres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogoCliente getCatalogoDeClientes() {
        return catalogoDeClientes;
    }

    public void setCatalogoDeClientes(CatalogoCliente catalogoDeClientes) {
        this.catalogoDeClientes = catalogoDeClientes;
    }

    public CatalogoVehiculos getCatalogoDeVehiculos() {
        return catalogoDeVehiculos;
    }

    public void setCatalogoDeVehiculos(CatalogoVehiculos catalogoDeVehiculos) {
        this.catalogoDeVehiculos = catalogoDeVehiculos;
    }

    public CatalogoAlquiler getCatalogoDeAlquileres() {
        return catalogoDeAlquileres;
    }

    public void setCatalogoDeAlquileres(CatalogoAlquiler catalogoDeAlquileres) {
        this.catalogoDeAlquileres = catalogoDeAlquileres;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", catalogoDeClientes=" + catalogoDeClientes + ", catalogoDeVehiculos=" + catalogoDeVehiculos + ", catalogoDeAlquileres=" + catalogoDeAlquileres + '}';
    }

    // registrar cliente metodo
    public void registarCliente(Cliente c) {

        this.catalogoDeClientes.anadirCliente(c);

    }
    
    
    public void registarVehiculo(Vehiculo v){
        
        this.catalogoDeVehiculos.anadirVehiculo(v);
        
    }
    
    
    public void buscarCliente(String nif){
        
        
        this.catalogoDeClientes.buscarCliente(nif);
        
    }
    
    public void buscarVehiculo(String bastidor){
        
        
        this.catalogoDeVehiculos.buscarVehiculo(bastidor);
    }

}
