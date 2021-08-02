
package reto11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reto11 {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Lista de animales
        
        Animales listaAnimales [] = new Animales[2];
            listaAnimales [0] = new Peces ("Perciformes", "Blanco y naranja", "Pacífico e ídico", "Amphiprioninae", "Pez Payaso", 15, "Omnivoros");
            listaAnimales [1] = new Mamiferos (30, 6, "Bosques de Asia", "Ailurus fulgens", "Panda Rojo", 15, "Carnivoro");
        //Lista de Electrodomesticos
        Electrodomesticos listaElectros [] = new Electrodomesticos[2];
            listaElectros [0] = new Lavadora (16, "Lavado y centrifugado", "Blanco", 32.5, "Plastico", 120, "LMDX6124PBAB0");
            listaElectros [1] = new Licuadora (550, 10, "Rojo", 3.5, "Plastico", 120, "BL1000RG");
        //Lista de Usuarios de tienda online
        Usuarios listaUsuarios [] = new Usuarios [2];
            listaUsuarios[0] =  new Empleados ("CEO de Potatoes.com", "EM20134457", "Elon Musk", 48, "TheRealElonMusk@outlook.com"); 
            listaUsuarios [1] = new Clientes ("Ciudad de Mexico", "9933731353", "CE45528061", "Hugo Lopez Gatell",  51, "HugoGatell@outlook.com");
        
        int terminar = 0;
        int opcion = 0;
        do{
            System.out.println("Bienvenido, seleccione una categoria para desplegar: \n1) Animales. \n2) Electrodomesticos. \n3) Usuarios de tienda online. \n4) Salir del sistema.");
            try{
                 opcion = Integer.parseInt(entrada.readLine());
                 switch(opcion){
                     //Animales
                     case 1:
                         System.out.println("Ha seleccionado la categoria de Animales. \n");
                         for (int aux = 0; aux < listaAnimales.length; aux++){
                             Animales dato = listaAnimales [aux];
                             //For Peces
                             if(dato instanceof Peces){
                                 Peces dato_Pez = (Peces) dato;
                                 System.out.println(dato.getClass());
                                 System.out.println("Nombre cientifico: " + dato.getNombreCientifico());
                                 System.out.println("Nombre comun: " + dato.getNombreComun());
                                 System.out.println("Promedio de vida: "+ dato.getPromedioVida() + " Años.");
                                 System.out.println("Dieta: " + dato.getDieta());
                                 System.out.println("Orden: " + ((Peces) dato).getOrden());
                                 System.out.println("Colores: "+ ((Peces) dato).getColores());
                                 System.out.println("Oceanos: " + ((Peces) dato).getOceanos() + "\n");
                             //For mamiferos    
                             }else if (dato instanceof Mamiferos){
                                 Mamiferos dato_mamifero = (Mamiferos) dato;
                                 System.out.println(dato.getClass());
                                 System.out.println("Nombre cientifico: " + dato.getNombreCientifico());
                                 System.out.println("Nombre comun: " + dato.getNombreComun());
                                 System.out.println("Promedio de vida: "+ dato.getPromedioVida() + " años.");
                                 System.out.println("Dieta: " + dato.getDieta());
                                 System.out.println("Altura: " + ((Mamiferos) dato).getAltura() + " cm.");
                                 System.out.println("Masa corporal: " + ((Mamiferos) dato).getMasaCorporal() + " kg.");
                                 System.out.println("Habitat: " + ((Mamiferos) dato).getHabitat());
                                
                             }
                             System.out.println("---------------------------------------------------");
                         }
                         break;
                     //Electrodomesticos
                     case 2:
                         System.out.println("Ha seleccionado la categoria de Electrodomesticos. \n");
                         for(int aux = 0; aux < listaElectros.length; aux++){
                             Electrodomesticos dato = listaElectros [aux];
                             //for Lavadora
                             if(dato instanceof Lavadora){
                                 Lavadora dato_Lavadora =  (Lavadora) dato;
                                 System.out.println(dato.getClass());
                                 System.out.println("Color: "+ dato.getColor());
                                 System.out.println("Peso: " + dato.getPeso() + " kg.");
                                 System.out.println("Material: " + dato.getMaterial());
                                 System.out.println("Voltaje: " + dato.getVoltaje() + " volts.");
                                 System.out.println("Numero de modelo: "+ dato.getNumModelo());
                                 System.out.println("Capacidad: " + ((Lavadora) dato).getCapacidad() + " kg.");
                                 System.out.println("Funciones: " + ((Lavadora) dato).getFunciones() + "\n");
                             //for licuadora
                             }else if (dato instanceof Licuadora){
                                 Licuadora dato_Licuadora = (Licuadora) dato;
                                 System.out.println(dato.getClass());
                                 System.out.println("Color: " + dato.getColor());
                                 System.out.println("Peso: " + dato.getPeso() + " kg.");
                                 System.out.println("Material: " + dato.getMaterial());
                                 System.out.println("Voltaje: " + dato.getVoltaje() + " volts.");
                                 System.out.println("Numero de modelo: " + dato.getNumModelo());
                                 System.out.println("Potencia: " + ((Licuadora) dato).getPotencia()+ " watts.");
                                 System.out.println("Numero de velocidades: " + ((Licuadora) dato).getNumVelocidades());
                                
                             }
                               System.out.println("---------------------------------------------------");

                         }
                         break;
                     //Uusarios de tienda online
                     case 3:
                         System.out.println("Ha seleccionado la categoria de Usuarios de tienda online. \n");
                         for(int aux = 0; aux < listaUsuarios.length; aux++){
                             Usuarios dato = listaUsuarios [aux];
                             //For Empleados
                             if(dato instanceof Empleados){
                                 Empleados dato_Empleado = (Empleados) dato;
                                 System.out.println(dato.getClass());
                                 System.out.println("Nombre: " + dato.getNombre());
                                 System.out.println("Edad: " + dato.getEdad() + " Años");
                                 System.out.println("Correo: " + dato.getCorreo());
                                 System.out.println("Puesto Laboral: " + ((Empleados) dato).getPuestoLaboral());
                                 System.out.println("ID de empleado: " + ((Empleados) dato).getEmpleadoID() + "\n");
                                 
                             //For Clientes
                             }else if(dato instanceof Clientes){
                                 Clientes dato_Cliente = (Clientes) dato;
                                 System.out.println("Nombre: " + dato.getNombre());
                                 System.out.println("Edad: " + dato.getEdad() + " Años");
                                 System.out.println("Correo: " + dato.getCorreo());
                                 System.out.println("Direccion: " + ((Clientes) dato).getDireccion());
                                 System.out.println("Telefono: " + ((Clientes) dato).getNumTelefono());
                                 System.out.println("ID de cliente: " + ((Clientes) dato).getClienteID());
                             }
                             System.out.println("---------------------------------------------------");
                         }
                         break;
                     
                     case 4:
                         System.out.println("Hasta luego! :D");
                         terminar = 4;
                         break;
                     
                     default:
                         System.out.println("Opcion no encontrada. Intente de nuevo :)");
                 }
                 
            }catch(IOException | NumberFormatException ex){
                System.out.println("Valor no numerico ingresado. Intente de nuevo. :)");
            }
         
        }while(terminar != 4);
    }
   
}
