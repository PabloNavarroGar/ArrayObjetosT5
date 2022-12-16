/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VehiculosArrays;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class RentaCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Los metodos de introducir por teclado el cliente,Vehiculo y alquiler estan en la clase de la Empresa.
        //Variables
        String opcion = "";
        //Creo 2 catalogos, para poder añadir vehiculos
        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoCliente cc = new CatalogoCliente(5);
        CatalogoAlquiler ca = new CatalogoAlquiler(5);

        //Creo la empresa
        Empresa RentaCarEstepona = new Empresa("RentaCarEstepona", cc, cv, ca);
        do {

            opcion = pedirNumeroOpcion();

            switch (opcion) {
                case "1":
                    Cliente auxCli = RentaCarEstepona.introducirTecladoCliente();

                    System.out.println("-------------------");

                    System.out.println(auxCli);
                    break;
                case "2":

                    Vehiculo auxVe = RentaCarEstepona.introducirTecladoVehiculo();
                    System.out.println("-------------------");
                    System.out.println(auxVe);
                    break;
                case "3":

                    Alquiler auxAl = RentaCarEstepona.introducirTecladoAlquiler();
                    System.out.println("-------------------");

                    System.out.println(auxAl);
                    break;
                case "4":

                    //Se imprime el catalogo de Clientes
                    System.out.println(cc);
                    break;

                case "5":

                    //Se imprime el catalogo de Clientes
                    System.out.println(cv);
                    break;

                case "6":

                    //Se imprime el catalogo de Clientes
                    System.out.println(ca);
                    break;
            }

        } while (!opcion.equalsIgnoreCase("7"));

    }

    public static String mostrarMenuCodigos() {
        String texto = """
                       RentarCar Estepona
                       ------------------------------
                       Escriba por el numero la opcion que quiere realizar
                       __________________________________________________
                       
                           ¿Que quiere hacer?
                       __________________________________________________                    
                       ----------------------------------------
                         [1]Dar de alta un cliente(registar)
                       ----------------------------------------
                         [2]Dar de alta un Vehiculo(registar)
                       ----------------------------------------
                         [3]Relizar Alquiler(Introduccion de datos) 
                       ----------------------------------------                     
                         [4]Ver Catalogo de Clientes.
                       ----------------------------------------                
                         [5]Ver Catalogo de Vehiculos.
                       ----------------------------------------
                         [6]Ver Catalogo de Alquileres.
                        ---------------------------------------
                         [7]Salir del programa.
                        ---------------------------------------
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }

    public static String pedirNumeroOpcion() {
        String codigo;
        do {
            codigo = mostrarMenuCodigos();
        } while (!esCodigoProductoValido(codigo));
        return codigo;
    }

    public static boolean esCodigoProductoValido(String codigo) {

        return (codigo.equalsIgnoreCase("1") || codigo.equalsIgnoreCase("2") || codigo.equalsIgnoreCase("3")
                || codigo.equalsIgnoreCase("4") || codigo.equalsIgnoreCase("5") || codigo.equalsIgnoreCase("6")
                || codigo.equalsIgnoreCase("7"));
    }
}
