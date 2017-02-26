
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */



//los comentarios son asi


/*tambien 
pueden ser asi en caso de
parrafos*/
public class ClasePrincipal {
//puedes pasar el metodo main que contiene el hola java
    //copia
    public static void main(String[ ] arg) {
       
      //NombreClase nomreobjeto = new NombreClase();
      //nombreobjeto.metodo(argumentos de metodo); 
//      System.out.println("Holaa Java");
     
      
     System.out.println("1.-Convertir DELTA-estrella");
     System.out.println("2.-Convertir Estrella-Delta");
     switch(Integer.parseInt(EntradaNumero())){
         case 1:{
                  float r1 = Float.parseFloat(EntradaNumero());
                  float r2 = Float.parseFloat(EntradaNumero());
                  float r3 = Float.parseFloat(EntradaNumero()); 
                  ArrayList<Float> list=Delta_Estrella.Convert(r1,r2,r3);      
                       System.out.print("RESULTADO:  ");
                  for(int i=0;i<list.size();i++){
                      System.out.print("resutado: "+list.get(i));
                  }
             break;
         }
         case 2:{
             float r1 = Float.parseFloat(EntradaNumero());
                  float r2 = Float.parseFloat(EntradaNumero());
                  float r3 = Float.parseFloat(EntradaNumero()); 
                  ArrayList<Float> list=Estrella_Delta.Convert(r1,r2,r3);      
                       System.out.print("RESULTADO:  ");
                  for(int i=0;i<list.size();i++){
                      System.out.print("resutado: "+list.get(i));
                  }
             break;
             
         }
     } 

     
     
     
     
     
     
     
     
             // deja por lo menos tener la ecuaci
    //importante destacar tambien el buen uso de las llaves  
       }//Esta llave cierra el metodo
    
    
    public static String EntradaNumero(){
        Validaciones validaciones = new Validaciones();
        String prueba="asdasd";
      
      //System.out.println("RETORNAA:   "+validaciones.isType(prueba,"float"));
      //while()
      //mientras(sea falso sigue repitiendo)
      //si es verdadero es decir ingresas un numero
      //sigue con la ejecucion
      //vamos bien?? Sí
      do 
      {
          prueba= inputTeclado();
      }while(validaciones.isType(prueba,"float")==false);
      System.out.println(prueba);
      return prueba;
    }
public static String inputTeclado(){
        String entrada="";

        try
        {	//dice que no tiene esos recursos y que debes importarlos
            InputStreamReader leer = new InputStreamReader(System.in);
            BufferedReader buff = new BufferedReader(leer);
            entrada = buff.readLine();
         

        }
        //leer del teclado como String
        catch(java.io.IOException ioex) {}
        return entrada;
    }    
    
}//esta llave cierra la clase
//ya podemos darle run 
///ok ahora vamos a intentar ingresar valores por teclado
