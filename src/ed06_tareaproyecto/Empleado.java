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
public class Empleado {
  
    /**
     * 
     */
    private String dni;
    
    /**
     * 
     */
    private String nombre;
    
    /**
     * 
     */
    private String direccion;
    
    /**
     * 
     */
    private String cargo;
    
    /**
     * 
     */
    private int numHijos;
    
    /**
     * Sueldo base del empleado
     */
    private double sueldoBase;
    
    /**
     * 
     * @param dni
     * @param nombre
     * @param direccion
     * @param cargo
     * @param numHijos
     * @param sueldoBase 
     */
    public Empleado (final String dni, final String nombre, final String direccion,
            final String cargo, final int numHijos, final double sueldoBase){
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cargo = cargo;
        this.numHijos = numHijos;
        this.sueldoBase = sueldoBase;
    } // Fin del constructor public Empleado (String dni, String nombre, ...


    // Métodos de la Clase
    /**
     * @return the dni
     */
    public final String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(final String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public final String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public final String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(final String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cargo
     */
    public final String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(final String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numHijos
     */
    public final int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(final int numHijos) {
        this.numHijos = numHijos;
    }

    /**
     * @return the sueldoBase
     */
    public final double getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase the sueldoBase to set
     */
    public void setSueldoBase(final double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    /**
     * 
     * @return 
     */
    public double calculaSueldo(){
        double total = this.sueldoBase;
        
        switch (this.cargo) {
            case "ENCARGADO":
                total += 300;
                break;
            
            case "DIRECTOR":
                total += 1000;
                break;
                
            default:
                break;
        } // Fin del swith
        
        // operador condicional sustituyendo al if
        total += (this.numHijos >= 3) ? this.numHijos * 50 : 0;
        
        return total;
    } // Fin del public double calculaSueldo()

    /**
     * 
     */
    protected void imprimirEmp() {
        
        String dniMessage;
        String nombreMessage;
        String cargoMessage;
        String numHijosMessage;
        String sueldoMessage;
        
        dniMessage = "DNI: " + this.dni;
        nombreMessage = "Nombre: " + this.nombre;
        cargoMessage = "Cargo: " + this.cargo;
        numHijosMessage = "Número de hijos: " + this.numHijos;
        sueldoMessage = "Sueldo: " + this.calculaSueldo();
               
        System.out.println(dniMessage);
        System.out.println(nombreMessage);
        System.out.println(cargoMessage);
        System.out.println(numHijosMessage);
        System.out.println(sueldoMessage);  
    } // Fin del protected void imprimirEmp()  

    
} // Fin del public class Empleado













