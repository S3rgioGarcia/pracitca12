
package Dispositivo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Carga_Masiva {
    public void leer_carga_Masiva(){
        Scanner teclado=new Scanner(System.in);
                int opcion;
    
        do {
            Carga_Masiva accediendo = new  Carga_Masiva();
            System.out.println("!! Bienvnido a Carga Masibo de archivos !!");
            System.out.println(" Eliga una de las opciones ");
            System.out.println(" 1. si desea leer Acciones");
            System.out.println(" 2. si desea leer Acciones externas");
            System.out.println(" 3. si desea leer Notificacones ");
            System.out.println(" 4. si desea leer dispotivos");
            System.out.println(" 4. si desea leer administracion");
            opcion= teclado.nextInt();
            
            
                 switch (opcion){
         case 1:
              accediendo.leer_Acciones();
             break;
         case 2:
             accediendo.acciones_externas();
             break;
         case 3:
             accediendo.leer_notificacion();
             break;
         case 4:
             accediendo.leer_dispositivos();
             break;
         case 5:
             accediendo.leer_administracion();
             break;
                     

     }
         }while (opcion != 6);

    }
    
    public void leer_Acciones(){ 
    try {
        FileReader entrada=new FileReader("C:/Users/Sergio García/Desktop/acciones.csv");
        
        int c=entrada.read();
        
        while(c != -1){
        
            c=entrada.read();
            
            char letra=(char )c;
            
            System.out.print(letra );
    }
        System.out.println(" \n");
       
    } catch (IOException  e) {
        System.out.println(" No se ha encontrado el archivo");   
    } //catch
}

public void acciones_externas(){ 
    try {
        FileReader entrada=new FileReader("C:/Users/Sergio García/Desktop/acciones_externas.csv");
        
        int c=entrada.read();
        
        while(c != -1){
        
            c=entrada.read();
            
            char letra=(char )c;
            
            System.out.print(letra );
    }
        System.out.println(" \n");
       
    } catch (IOException  e) {
        System.out.println(" No se ha encontrado el archivo");   
    } //catch
}

public void leer_notificacion(){ 
    try {
        FileReader entrada=new FileReader("C:/Users/Sergio García/Desktop/notificacion.csv");
        
        int c=entrada.read();
        
        while(c != -1){
        
            c=entrada.read();
            
            char letra=(char )c;
            
            System.out.print(letra );
    }
        System.out.println(" \n");
       
    } catch (IOException  e) {
        System.out.println(" No se ha encontrado el archivo");   
    } //catch
}

public void leer_dispositivos(){ 
    try {
        FileReader entrada=new FileReader("C:/Users/Sergio García/Desktop/dispositivos.csv");
        
        int c=entrada.read();
        
        while(c != -1){
        
            c=entrada.read();
            
            char letra=(char )c;
            
            System.out.print(letra );
    }
        System.out.println(" \n");
       
    } catch (IOException  e) {
        System.out.println(" No se ha encontrado el archivo");   
    } //catch
}

public void leer_administracion(){ 
    try {
        FileReader entrada=new FileReader("C:/Users/Sergio García/Desktop/administracion.csv");
        
        int c=entrada.read();
        
        while(c != -1){
        
            c=entrada.read();
            
            char letra=(char )c;
            
            System.out.print(letra );
    }
        System.out.println(" \n");
       
    } catch (IOException  e) {
        System.out.println(" No se ha encontrado el archivo");   
    } //catch
}
    
    
}
