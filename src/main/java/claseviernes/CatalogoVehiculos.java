/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseviernes;

/**
 *
 * @author tomas
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;

    //El constructor recibe el tamaño del catalogo e inicializa
    //la estructura de datos con vehiculos aleatorios.
    public CatalogoVehiculos(int tamanio) {
        this.numeroVehiculos = tamanio;
        tamanio = Math.abs(tamanio);//incializa el Nº de vehiculos del catalogo al tamaño que le estoy diciendo
        this.listaVehiculos = new Vehiculo[tamanio];

        //Una vez creada la estructura de datos le doy valor a cada
        //elemento
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }

    }

    public void mostrarCatalogo() {
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }

    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public int buscarVehiculo(Vehiculo v) {
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            if (v.equals(this.listaVehiculos[i])) {
                return i;
            }
        }
        //Como no encuetra ese bastidor duevuelve -1
        return -1;
    }

    public void borrarVehiculo(Vehiculo v) {
        int posicionVehiculoArray = buscarVehiculo(v);
        if(posicionVehiculoArray >= 0){
            this.listaVehiculos[posicionVehiculoArray] = null;
        }

    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    

}
