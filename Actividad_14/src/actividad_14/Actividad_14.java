
package actividad_14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Actividad_14 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      HashMap <Object, Object> biblioteca = new HashMap();
      try {
         FileInputStream fileIn = new FileInputStream("C:/Users/Valea/Documents/NetBeansProjects/Actividad_14/src/actividad_14/archivo.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);

         biblioteca = (HashMap) in.readObject();
         in.close();
         fileIn.close();
         
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("\nHa ocurrido una interrumpcion en el código.");
         c.printStackTrace();
         return;
      }
      
      int opcion;
      String palBuscada;
      
      do {
         System.out.println("Bienvenido a MyVirtual Diccionary \r\n");
         System.out.println("Seleccione la opcion que desee realizar \r\n1) Consultar una palabra \r\n2) Agregar una nueva palabra al diccionario\r\n3) Salir");
         opcion = leer.nextInt();
         int opc = Integer.parseInt(String.valueOf(opcion));
         switch (opc) {
            case 1:
               System.out.println("\n¿Qué palabra desea buscar?");
               palBuscada = leer.next();
               consultarPalabra(palBuscada, biblioteca);
               break;
            case 2:
               agregarPalabra(biblioteca);
               break;
            default:
               break;
         }
      } while (opcion != 3);
        System.out.println("Tamaño: " + biblioteca.size());
        
   }

   public static void consultarPalabra(String buscada, HashMap hashmap) {
      HashMap aux;
      aux = hashmap;
      String encontrado;
      Set keys = aux.keySet();
      boolean existe = false;
      for (Object key : keys) {
         if (aux.containsKey(buscada)) {
              encontrado = (String) aux.get(key);
              System.out.println(encontrado);
            existe = true;
         }
      }
      if (existe) {
         System.out.println("\nLa palabra está registrada y ha sido encontrada.");
      } else {
         System.out.println("La palabra no se han encontrado en los registros.");
      }
   }

   private static void agregarPalabra(HashMap<Object, Object> hashmap) {

      Scanner entrada = new Scanner(System.in);
      Set<Object> keys = hashmap.keySet();
      boolean existe = false;
      System.out.println("\n¿Qué palabra desea agregar?");
      Object pal = entrada.next();
      for (Object key : keys) {
         if (hashmap.containsKey(pal)) {
            existe = true;
         }
      }
      if (existe) {
         System.out.println("\nEsta palabra está en los registros.");
      } else {
         System.out.println("¿Cual es la definicion de esta palabra?");
         Object definicion = entrada.next();
         hashmap.put(pal, definicion);
      }

      try {
         FileOutputStream fileOut = new FileOutputStream("C:/Users/Valea/Documents/NetBeansProjects/Actividad_14/src/actividad_14/archivo.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(hashmap);
         out.close();
         fileOut.close();

      } catch (IOException i) {
         i.printStackTrace();
      }
   }
    }
    

