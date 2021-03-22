
package Dispositivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrar_Dispositivo  {
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
    

        public void admini(){
        Scanner teclado=new Scanner(System.in);
        Crear_Dispositivo miListaC = new Crear_Dispositivo();
        miListaC.Nombrecompu=new ArrayList();
     int opcion;
     do {
       System.out.println(" \n 1. Computadora Portatil ");
        System.out.println(" 2. Tablet ");
        System.out.println(" 3. SmartWatch");
        System.out.println(" 4. Smartphone ");
         System.out.println(" 5. Auriculares inalambricos \n");
        System.out.println(" Digite la opción a elegir de 1 al 5");
        opcion= teclado.nextInt();
  
      switch (opcion){
         case 1:
            miListaC.Mostrar_compu();
              break;
         case 2:
            Mostrar_Tablet();
             break;
         case 3:
            
             break;
         case 4:
      
             break;
         case 5:
         
     }
     } while (opcion != 6);
}
    

    
        public void Mostrar_Tablet(){
    if (!NombreTa.isEmpty()){
    System.out.println("      Listado de diapositivos");
        for(int i=0; i<NombreTa.size(); i++){
        System.out.println(NombreTa.get(i));}
 
    } else{
        System.out.println(" No existen valores en la lista");
    }
    }
}
