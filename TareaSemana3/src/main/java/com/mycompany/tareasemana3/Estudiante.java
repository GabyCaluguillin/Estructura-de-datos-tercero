
package com.mycompany.tareasemana3;

public class Estudiante {
    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String[] telefonos;
    
    //constructor
    public Estudiante(int id, String nombre, String apellido, String direccion, String[] telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }
    //metodos
    public void mostrarDatos(){
        
        System.out.println("id:"+id);
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellidos:"+apellido);
        System.out.println("Direccion:"+direccion);
        
        for(int i=0;i<3;i++){
            System.out.println("Telefono "+(i+1)+":"+telefonos[i]);
        
        
        }
         
    }
    
}