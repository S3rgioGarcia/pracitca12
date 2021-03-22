
package Dispositivo;

import java.util.ArrayList;
import java.util.Scanner;


public class Crear_Dispositivo {
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
    
    String nombre, visible;
    public void crear(){
        Scanner teclado=new Scanner(System.in);
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
             Computadora_Portatil();
              break;
         case 2:
             Tablet();
             break;
         case 3:
             SmartWatch();
             break;
         case 4:
             Smartphone();
             break;
         case 5:
             Mostrar_auriculares();
     }
     } while (opcion != 6);

    

    }

          public void Computadora_Portatil () {
Scanner entrada = new Scanner (System.in);
Scanner sc= new Scanner (System.in);
String correo=null;

int opcion1, opcion2, a =1;

while (a==1){
switch (opcion1=1){   
 
    case 1: 
     
        System.out.println(" Ingrese el Correo electronico: ");
         correo = entrada.nextLine();
    
    case 2: 
        System.out.println(" Ingrese el Nombre del dispositivo ");
        nombre = entrada.nextLine();
        
         if (nombre.equals("  ")){
             System.out.println("ingrese nuevo valor");
         }
                
    case 3: 
        System.out.println(" Ingrese di estara visible para conexion: ");
        System.out.println(" 1. Si ");
        System.out.println(" 2. No");
        visible= entrada.next();

    case 4: 
        
        System.out.println(" \n si desea validar escriba\n 1. Aceptar  o 2. Caselar ");
        opcion2 = entrada.nextInt();     
       
    
     while (opcion2 == 1){
          Computadora.add("  "+correo +"      "+nombre+"       "+visible+"     "+"    Activo    ");
          Correo.add(correo+" ");
          Nombrecompu.add(" carros"+nombre);
          Auriculares.add("Lapton_"+nombre);
          Visible.add("Activo");


            break;
      } if ((opcion2 == 2)){
          System.out.println(" Usted a cancelado la informaccion");
        
      }

}
a++;
    }
    }
          
                    public void Tablet () {
Scanner entrada = new Scanner (System.in);
String correo=null;

int opcion1, opcion2, a =1;

while (a==1){
switch (opcion1=1){   
 
    case 1: 
     
        System.out.println(" Ingrese el Correo electronico: ");
         correo = entrada.nextLine();
    
    case 2: 
        System.out.println(" Ingrese el Nombre del dispositivo ");
        nombre = entrada.nextLine();
        
         if (nombre.equals("  ")){
             System.out.println("ingrese nuevo valor");
         }
                
    case 3: 
        System.out.println(" Ingrese di estara visible para conexion: ");
        System.out.println(" 1. Si ");
        System.out.println(" 2. No");
        visible= entrada.next();

    case 4: 
        
        System.out.println(" \n si desea validar escriba\n 1. Aceptar  o 2. Caselar ");
        opcion2 = entrada.nextInt();     
       
    
     while (opcion2 == 1){
          Tablets.add("  "+correo +"      "+nombre+"       "+visible+"     "+"    Activo    ");
          Correo.add(correo+" ");
          NombreTa.add("d_"+nombre);
          Auriculares.add("tablet_"+nombre);
          Visible.add("Activo");


            break;
      } if ((opcion2 == 2)){
          System.out.println(" Usted a cancelado la informaccion");
        
      }

}
a++;
    }
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

                  
                         public void SmartWatch () {
Scanner entrada = new Scanner (System.in);
Scanner sc= new Scanner (System.in);
String correo=null;

int opcion1, opcion2, a =1;

while (a==1){
switch (opcion1=1){   
 
    case 1: 
     
        System.out.println(" Ingrese el Correo electronico: ");
         correo = entrada.nextLine();
    
    case 2: 
        System.out.println(" Ingrese el Nombre del dispositivo ");
        nombre = entrada.nextLine();
        
         if (nombre.equals("  ")){
             System.out.println("ingrese nuevo valor");
         }
                
    case 3: 
        System.out.println(" Ingrese di estara visible para conexion: ");
        System.out.println(" 1. Si ");
        System.out.println(" 2. No");
        visible= entrada.next();

    case 4: 
        
        System.out.println(" \n si desea validar escriba\n 1. Aceptar  o 2. Caselar ");
        opcion2 = entrada.nextInt();     
       
    
     while (opcion2 == 1){
          SmartWatch.add("  "+Correo +"      "+NombreDis+"       "+Visible+"     "+"    Activo    ");
          Correo.add(correo+" ");
          NombreWatch.add(nombre);
          Auriculares.add("SmartWach_"+nombre);
          Visible.add("Activo");


            break;
      } if ((opcion2 == 2)){
          System.out.println(" Usted a cancelado la informaccion");
        
      }

}
a++;
    }
    }
                         
                        public void Smartphone () {
Scanner entrada = new Scanner (System.in);
Scanner sc= new Scanner (System.in);
String correo=null;

int opcion1, opcion2, a =1;

while (a==1){
switch (opcion1=1){   
 
    case 1: 
     
        System.out.println(" Ingrese el Correo electronico: ");
         correo = entrada.nextLine();
    
    case 2: 
        System.out.println(" Ingrese el Nombre del dispositivo ");
        nombre = entrada.nextLine();
        
         if (nombre.equals("  ")){
             System.out.println("ingrese nuevo valor");
         }
                
    case 3: 
        System.out.println(" Ingrese di estara visible para conexion: ");
        System.out.println(" 1. Si ");
        System.out.println(" 2. No");
        visible= entrada.next();

    case 4: 
        
        System.out.println(" \n si desea validar escriba\n 1. Aceptar  o 2. Caselar ");
        opcion2 = entrada.nextInt();     
       
    
     while (opcion2 == 1){
          Smartphone.add("  "+Correo +"      "+NombreDis+"       "+Visible+"     "+"    Activo    ");
          Correo.add(correo+" ");
          Nombrephone.add(nombre);
          Auriculares.add("Smartphone_"+nombre);
          Visible.add("Activo");


            break;
      } if ((opcion2 == 2)){
          System.out.println(" Usted a cancelado la informaccion");
        
      }

}
a++;
    }
    }
    
         public void Mostrar_auriculares(){
    if (!Auriculares.isEmpty()){
        
    System.out.println("      Listado de diapositivos");
        for(int i=0, a=1; i<Auriculares.size(); i++, a++){
        System.out.println("  "+a +" "+Auriculares.get(i));}
       
    } else{
        System.out.println(" No existen valores en la lista");
    }
    }

 public void Mostrar_compu(){
            
    if (!Nombrecompu.isEmpty()){
    System.out.println("      Listado de diapositivos");
        for(int i=0; i<Nombrecompu.size(); i++){
        System.out.println(Nombrecompu.get(i));}
 
    } else{
        System.out.println(" No existen valores en la lista");
    }
}}

