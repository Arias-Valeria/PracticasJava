package diccionario;

import java.io.*;
import java.util.*;

public class portada {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      HashMap<Object, Object> hashmap = new HashMap<>();
      try {
         FileInputStream fileIn = new FileInputStream("C:/Users/salva/Downloads/Diccionario/src/diccionario/archivo.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);

         hashmap = (HashMap) in.readObject();

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
      int opc;
      String buscada;
      do {
         System.out.println("Bienvenido a Diccionarios Olymplic\r\n");
         System.out.println("Seleccione una opcion \r\n [1].- Consultar Palabra \r\n[2].- Insertar palabra \r\n " +
             /*"[3].- Imprimir Palabras \r\n*/"[3].- Salir");
         opc = entrada.nextInt();
         int x = Integer.parseInt(String.valueOf(opc));
         switch (x) {
            case 1:
               System.out.println("¿Cual es la palabra que esta buscando?");
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
      HashMap aux;
      aux = hashmap;

      Set keys = aux.keySet();
      boolean existe = false;
      for (Object key : keys) {
         if (aux.containsKey(buscada)) {
            existe = true;
         }
      }
      if (existe) {
         System.out.println("se encontro");
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
         FileOutputStream fileOut = new FileOutputStream("C:/Users/salva/Downloads/Diccionario/src/diccionario/archivo.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(hashmap);
         out.close();
         fileOut.close();

      } catch (IOException i) {
         i.printStackTrace();
      }
   }

}