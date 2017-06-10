/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06 (Sergio Sanjuán García)
 */
public final class Main {

    /**
     * Este constructor es privado y no se puede invocar
     */
    private Main() {
    } // Fin del constructor private Main()
    
    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
    
        final Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes", "C/del Pez,6", "EMPLEADO", 3, 1200);

        empleado1.imprimirEmp();
        
        System.out.println("\nCódigo añadido para comprobar funcionamiento del Repositorio en GitHub");
        
    } // Fin del public static void main(String[] args)
    
} // Fin del public class Main



