/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosArrays;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Objects;

import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author samue
 */
public class Empresa {

    private String cif;
    private String nombre;

    private CatalogoCliente catalogoDeClientes;
    private CatalogoVehiculos catalogoDeVehiculos;
    private CatalogoAlquiler catalogoDeAlquileres;

    public Empresa(String nombre, String cif, CatalogoCliente catalogoDeClientes, CatalogoVehiculos catalogoDeVehiculos, CatalogoAlquiler catalogoDeAlquileres) {
        this.nombre = nombre;
        this.cif = RandomStringUtils.random(5);
        this.catalogoDeClientes = catalogoDeClientes;
        this.catalogoDeVehiculos = catalogoDeVehiculos;
        this.catalogoDeAlquileres = catalogoDeAlquileres;
    }

    public Empresa() {
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

    // registrar cliente metodo, le metemos en parametro iun objeto auxilizar,
    //y llamamos al metodo de añadir cliente del catalogo clientes, con el objetco, auxiliar
    public void registarCliente(Cliente aux) {
        //Cliente aux = new Cliente();
        this.catalogoDeClientes.anadirCliente(aux);

    }

    //misma descripcion 
    public void registarVehiculo(Vehiculo aux) {
        //Vehiculo aux = new Vehiculo();
        this.catalogoDeVehiculos.anadirVehiculo(aux);

    }

    public Cliente buscarCliente(String nif) {

        return this.catalogoDeClientes.buscarCliente(nif);

    }

    public Vehiculo buscarVehiculo(String bastidor) {

        return this.catalogoDeVehiculos.buscarVehiculo(bastidor);

    }

    //RegistrarAlquiler(fecha,numeroDias)
    public boolean registarAlquiler(String nif, String bastidor, LocalDate fechaInicio, int numeroDias) {
        //Creo 2 objetos auxiliares, de vehiculo y cliente
        //Llamando a los catalogos junto con sus metodos
     Cliente auxCli = this.catalogoDeClientes.buscarCliente(nif);
     Vehiculo auxVe = this.catalogoDeVehiculos.buscarVehiculo(bastidor);
        //Condiciones dde que si los auxiliares, son difretentes de null, y la disponibilidad 
        //esta en true
     if(auxCli !=null && auxVe != null && auxVe.isDisponible()==true){
         
         //se le añade un alquilery DENTRO del metodo, se le mete un alquiler con el constructor
         
         this.catalogoDeAlquileres.anadirAlquiler(new Alquiler(auxCli, auxVe, fechaInicio, numeroDias));
         auxVe.setDisponible(false);
         return true;        
         
         
     }
         return false;
         
     
    }
    //Recibir Vehiculo
    
    public void recibirVehiculo(Alquiler a){
        
        if(this.catalogoDeAlquileres.buscarAlquiler(a.getAlquierID())!=null){
            
            a.getVehiculo().setDisponible(true);
        }
        
    }
}
