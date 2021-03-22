
package Dispositivo;

import java.util.ArrayList;
import java.util.Scanner;

public class menu_Princiapal {
    ArrayList<String>Correo;
    ArrayList<String>NombreDis;
    ArrayList<String>Visible;
    ArrayList<String>Computadora;
    ArrayList<String>Tablets;
    ArrayList<String>Smartphone;
    ArrayList<String>SmartWatch;
    ArrayList<String>Auriculares;
    ArrayList<String>Nombrecompu;
    ArrayList<String>NombreTa;
    ArrayList<String>NombreWatch;
    ArrayList<String>Nombrephone;
    
        public static void main(String [] args) {
            
             Crear_Dispositivo miListaC = new Crear_Dispositivo();
       miListaC.Correo = new ArrayList();
       miListaC.NombreDis=new ArrayList();
       miListaC.NombreTa=new ArrayList();
       miListaC.Nombrecompu=new ArrayList();
       miListaC.Visible=new ArrayList();
       miListaC.Tablets=new ArrayList();
       miListaC.Computadora=new ArrayList();
       miListaC.SmartWatch=new ArrayList();
       miListaC.NombreWatch=new ArrayList();
       miListaC.Smartphone=new ArrayList();
       miListaC.Nombrephone=new ArrayList();
       miListaC.Auriculares=new ArrayList();
       Crear_Dispositivo crear= new Crear_Dispositivo();
       Administrar_Dispositivo admi= new Administrar_Dispositivo();
       
            Scanner entrada=new Scanner(System.in);
   
            int valor, opcion, opcion1, opcion2;
        
  do{
        System.out.println(" Bienvenidos  \n");
        
        System.out.println(" Ingrese la opcion a elegir \n");
        
        System.out.println(" 1. Crear dispositivo ");
        System.out.println(" 2. Administar Dispositivo  ");
        System.out.println(" 3. Acciones con dispositivos");
        System.out.println(" 4. Acciones externas de dispositivos");
        System.out.println(" 5. Cargas Masivas");
        System.out.println(" 6. Salir ");
        valor = entrada.nextInt();

      
        switch (valor){
            case 1:
                do {
                    miListaC.crear();
        System.out.println(" \n 1. Computadora Portatil ");
        System.out.println(" 2. Tablet ");
        System.out.println(" 3. SmartWatch");
        System.out.println(" 4. Smartphone ");
         System.out.println(" 5. Auriculares inalambricos \n");
        System.out.println(" Digite la opción a elegir de 1 al 5");
        opcion= entrada.nextInt();
  
     switch (opcion){
         case 1:
             crear.Computadora_Portatil();
              break;
         case 2:
             crear.Tablet();
             break;
         case 3:
             crear.SmartWatch();
             break;
         case 4:
             crear.Smartphone();
             break;
         case 5:
             crear.Mostrar_auriculares();
     }
     } while (opcion != 6);

       break;

            case 2:
 

     do {
            admi.admini();
        System.out.println(" \n 1. Computadora Portatil ");
        System.out.println(" 2. Tablet ");
        System.out.println(" 3. SmartWatch");
        System.out.println(" 4. Smartphone ");
         System.out.println(" 5. Auriculares inalambricos \n");
        System.out.println(" Digite la opción a elegir de 1 al 5");
     opcion1= entrada.nextInt();
  
     switch (opcion1){
         case 1:
             admi.admini();
             break;
         case 2:
             admi.admini();
             break;
         case 3:
           
             break;
         case 4:
            
             break;
     }
     } 
     while (opcion1 != 5);
    break;
            case 3:
         
         
            case 4:
                
                break;
            case 5:
                 do {
        Carga_Masiva accediendo = new  Carga_Masiva();
            System.out.println("!! Bienvnido a Carga Masibo de archivos !!");
            System.out.println(" Eliga una de las opciones ");
            System.out.println(" 1. si desea leer Acciones");
            System.out.println(" 2. si desea leer Acciones externas");
            System.out.println(" 3. si desea leer Notificacones ");
            System.out.println(" 4. si desea leer dispotivos");
            System.out.println(" 4. si desea leer administracion");
            opcion= entrada.nextInt();
            
            
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
                
                
                break;
                
            case 6:
                break;
                
         
         
         }  
        
         }while (valor !=7);
  
  
 
}//main
}
   
    
