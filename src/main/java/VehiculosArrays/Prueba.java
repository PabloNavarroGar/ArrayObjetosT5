/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VehiculosArrays;

/**
 *
 * @author samue
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         CatalogoVehiculos cv = new CatalogoVehiculos(10);
        CatalogoCliente cc = new CatalogoCliente(10);
         
        
        System.out.println(cv);
        
        System.out.println(cc);
        Cliente c = cc.buscarCliente("3");
       
       
        System.out.println("Metodo de buscarCliente");
        System.out.println(c);
        System.out.println("-------------------");
        System.out.println("Metodo de buscarVehiculo");
        System.out.println(cv.buscarVehiculo("4"));
    }
    
}
