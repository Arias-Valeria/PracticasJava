package act_14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Act_14 {

   public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
   
      Scanner entrada = new Scanner(System.in);
      HashMap<Object, Object> hashmap = new HashMap<>();
      int opc;
      String buscada;
      do {
         System.out.println("Bienvenido a la rae\r\n");
         System.out.println("Seleccione una opcion");
         System.out.println("1.- Consultar Palabra");
         System.out.println("2.- Insertar palabra");
         System.out.println("3.- Salir");
         opc = entrada.nextInt();
         int x = Integer.parseInt(String.valueOf(opc));
         switch (x) {
            case 1:
               System.out.println("Que palabra busca");
               buscada = entrada.next();
               consultarPalabra(buscada, hashmap);
               break;
            case 2:
               insertarPalabra(hashmap);
               break;
            default:
               break;
         }
      } while (opc != 3);
   }

   public static void consultarPalabra(String buscada, HashMap hashmap) {
      HashMap aux = hashmap;
      try {
         FileInputStream fileIn = new FileInputStream("C:/Users/Valea/Documents/NetBeansProjects/act_14/src/act_14/guardado");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         aux = (HashMap) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Error");
         c.printStackTrace();
         return;
      }

      Set keys = aux.keySet();
      boolean existe = false;
      for (Object key : keys) {
         if (aux.containsKey(buscada)) {
            existe = true;
         }
      }
      if (existe) {
         System.out.println("se encontro");
         System.out.println(hashmap.get(buscada));
      } else {
         System.out.println("No se encunetra la palabra");
      }
   }

   private static void insertarPalabra(HashMap<Object, Object> hashmap) {

      Scanner entrada = new Scanner(System.in);
      Set<Object> keys = hashmap.keySet();
      boolean existe = false;
      System.out.println("¿Cual es la palabra que desea agregar?");
      Object palabra = entrada.next();
      for (Object key : keys) {
         if (hashmap.containsKey(palabra)) {
            existe = true;
         }
      }
      if (existe) {
         System.out.println("Esta palabra ya existe, puede consultarla");
      } else {
         System.out.println("¿Cual es el significado de dicha palabra?");
         Object significado = entrada.next();
         hashmap.put(palabra, significado);
      }

      try {
         FileOutputStream fileOut = new FileOutputStream("C:/Users/Valea/Documents/NetBeansProjects/act_14/src/act_14/guardado", true);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(hashmap);
         out.close();
         fileOut.close();

      } catch (IOException i) {
         i.printStackTrace();
      }
   }

}
