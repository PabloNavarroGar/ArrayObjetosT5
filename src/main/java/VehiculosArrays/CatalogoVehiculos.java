/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosArrays;

import java.util.Arrays;

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
        tamanio = Math.abs(tamanio);//incializa el Nº de vehiculos del catalogo al tamaño que le estoy diciendo y que sea positivo
        this.listaVehiculos = new Vehiculo[tamanio]; //Se crear el arrya y toma el tamaño que se le da en el parametro y se mete en el array

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

    //Numero de vehiculos que hay en el catalogo, NO EL TAMAÑO DEL ARRAY
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    //Es una busqueda secuencial , va desde 0 hasta el ultimo
    private int buscarVehiculo(Vehiculo v ) {
        //se le para el objeto como parametro
        if (v != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] != null && v.equals(this.listaVehiculos[i])) {
                    return i;
                }
            }
        }
        //Como no encuentra ese cliente devuelve -1
        return -1;
    }

    public Vehiculo buscarVehiculo(String bastidor) {
      
         Vehiculo aux = new Vehiculo();

        aux.setBastidor(bastidor);//Fuerzo a que el cliente tenga el bastidor que busco
        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;
    }

    public boolean borrarVehiculo(Vehiculo v) {
        //LLamo al metodo de buscar enlazandolo con una variable
        int posicionVehiculoArray = buscarVehiculo(v);
        //Si la posicion es mayor o iguala 0, pone el vehiculo en 0
        if (posicionVehiculoArray >= 0) {
            this.listaVehiculos[posicionVehiculoArray] = null;
            this.numeroVehiculos--;
            return true;
        }

        return false;

    }

    //añadir un vehiculo
    public void anadirVehiculo(Vehiculo v) {
        //Si hay hueco, se inserta en el hueco
        //Si el numero de vehiculos en menor a la lista de vehiculos
        //Hay hueco
        if (this.numeroVehiculos < this.listaVehiculos.length) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null) {
                    this.listaVehiculos[i] = v;
                }
                this.numeroVehiculos++;
                System.out.println("Guardando Vehichulo en posicion " + i);
                break;
            }
        } else {
            //si esta lleno
            //Arrays.copu of T es dato generico, se le pone ++ porque se añade 1 mas en el nuevo array
            //this.listaVehiculos= Arrays.copyOf(listaVehiculos, ++numeroVehiculos*2);
            //Se le pone un *2 al final, que quiere decir que el nuevo Array tiene el doble de tamaño que la orignal,(eficiencia)
            //Para evitar confusiones le sumo, ya el ++ a continuacion y luego pongo el metodo y me olvido
            this.numeroVehiculos++;//Aqui ya valdria 11
            this.listaVehiculos = Arrays.copyOf(listaVehiculos, numeroVehiculos);
            this.listaVehiculos[this.numeroVehiculos - 1] = v;//En la posicion 10 le guardo el vehiculo
        }

    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    } //Con el metodo to String esto deja de ser util

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el array y luego le metmeos la listo
        for (Vehiculo v : listaVehiculos) {

            if (v != null) { //Lanzar una expecion
                //Hacemos un tostring del objeto 'v' 
                tmp += v.toString() + "\n";
            }
        }
        return tmp;
    }

    
}
