/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseviernes;

/**
 *
 * @author tomas
 */
public class EjemploVehiculoEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo x = Modelo.SEAT_CUPRA;
        System.out.println(" ");
        Modelo aleatorio = Modelo.getAleatorio();
        System.out.println(Modelo.getAleatorio());
        System.out.println("color" + Color.getAleatorio());
        //Vehiculo v = new Vehiculo();
        //System.out.println(v);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-----------CATALOGO DE VEHICULOS-----------------");
        //CATALOGO DE VEHICULOS
        CatalogoVehiculos catalogo = new CatalogoVehiculos(15);
        catalogo.mostrarCatalogo();
        Vehiculo [] array = catalogo.getListaVehiculos();
        array[0].setBastidor("123A");
        catalogo .mostrarCatalogo();
        Vehiculo v = new Vehiculo();
        v.setBastidor("123A");
        System.out.println(v);
        
        System.out.println(" ");
        int posisiconVehiculoArray = catalogo.buscarVehiculo(v);
        System.out.println("Posición " + posisiconVehiculoArray);
        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
        System.out.println("------------------ DESPUES DE BORRAR ------------------");
        catalogo .mostrarCatalogo();
                
    }

}
