
package com.mycompany.tareasemana3;


public class TareaSemana3 {

    public static void main(String[] args) {
        
        /*Elabore un documento PDF que contenga la definición de las clases,
        arrays y/o matrices necesarias en C# o Java para manejar el registro de 
        un estudiante que posea los siguientes datos (id, nombres, apellidos, 
        dirección y tres teléfonos ). */
        
        String [] telefonos ={"0997654289", "098739933775", "0982255364"};
        
        Estudiante estudiantes=new Estudiante(1, "Gabriela", "Caluguillin", "Cocotog", telefonos);
        estudiantes.mostrarDatos();
    }
}
