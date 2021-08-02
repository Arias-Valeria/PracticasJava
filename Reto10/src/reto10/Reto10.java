
package reto10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Reto10 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a Mario Kart 8 Deluxe: Catalogo de vehículos.");
        ArrayList catalogo = new ArrayList ();
        int terminar = 0;
        int opcion;        
        do{
            System.out.println("Por favor, selecciones una opcion: \n1) Ver catalogo de vehículos. \n2) Agregar nuevo vehículo. \n3) Ver un vehiculo específico. \n4) Eliminar vehículo del catalogo \n5) Modificar vehículo \n6) Salir.");
            try{
                opcion = Integer.parseInt(entrada.readLine());
                switch (opcion){
                case 1:
                    if(catalogo.isEmpty()){
                        System.out.println("\n¡No hay vehiculos disponibles en el catalogo!. \n*");
                    }else{
                        int turno = 1;
                        for(Object vehiculoActual : catalogo){
                            Auto vehiculo = (Auto) vehiculoActual;
                            System.out.println("----------------------");
                            System.out.println("**Datos del vehiculo " + turno + ".**");
                            System.out.println("Clase: " + vehiculo.getTipoVehiculo());
                            System.out.println("Modelo: " + vehiculo.getModelo());
                            System.out.println("Tipo Neumatico: " + vehiculo.getTipoNeumatico());
                            System.out.println("Ventajas: " + vehiculo.getVentajas());
                            System.out.println("Desventajas: " + vehiculo.getDesventajas());
                            turno ++;
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Indique la clase del vehiculo: \n- Kart. \n- Moto. \n- Atv.");
                    String clase = entrada.readLine();
                    System.out.println("Indique el nombre del modelo: ");
                    String modelo = entrada.readLine();
                    System.out.println("Indique el tipo de neumaticos: \n- Estandar. \n- Monster. \n- Roller. \n- Madera. \n- Metal. \n- Oro.");
                    String neumaticos = entrada.readLine();
                    System.out.println("Indique las ventajas (separadas por una coma): \n- Velocidad. \n- Peso. \n- Aceleracion. \n- Control. \n- Todo terreno. \n- Turbo.");
                    String ventajas = "+ " + entrada.readLine();
                    System.out.println("Indique las desventajas (separadas por una coma): \n- Velocidad. \n- Peso. \n- Aceleracion. \n- Control. \n- Todo terreno. \n- Turbo");
                    String desventajas = "- " + entrada.readLine();
                    Auto nuevoVehiculo = new Auto(clase, modelo, neumaticos, ventajas, desventajas);
                    catalogo.add(nuevoVehiculo);
                    break;
                case 3:
                    System.out.println("\nSeleccione el numero del vehiculo.");
                    int numeroV = Integer.parseInt(entrada.readLine());
                    if (numeroV > catalogo.size() || numeroV <= 0){
                        System.out.println("Vehiculo no encontrado, intente de nuevo. \n *");
                    }else{
                        Auto vehiculoEncontrado = (Auto) catalogo.get(numeroV -1);
                        System.out.println("\n**Datos del vehiculo " + numeroV + ".**");
                            System.out.println("Clase: " + vehiculoEncontrado.getTipoVehiculo());
                            System.out.println("Modelo: " + vehiculoEncontrado.getModelo());
                            System.out.println("Tipo Neumatico: " + vehiculoEncontrado.getTipoNeumatico());
                            System.out.println("Ventajas: " + vehiculoEncontrado.getVentajas());
                            System.out.println("Desventajas: " + vehiculoEncontrado.getDesventajas());
                            System.out.println("----------------------");
                    }
                    break;
                case 4:
                    System.out.println("\nSeleccione el numero de vehiculo a eliminar: ");
                    int eliminarV = Integer.parseInt(entrada.readLine());
                    if (eliminarV > catalogo.size() || eliminarV <= 0){
                        System.out.println("Vehiculo no encontrado, intente de nuevo. \n*");
                    }else{
                        catalogo.remove(eliminarV - 1);
                    }
                    break;
                case 5:
                    System.out.println("\nSeleccione el numero de vehiculo que desea modificar: ");
                    int modificarV = Integer.parseInt(entrada.readLine());
                    if (modificarV > catalogo.size() || modificarV <= 0){
                        System.out.println("Vehiculo no encontrado, intente de nuevo. \n*");
                    }else{
                        System.out.println("¿Que caracteristica desea modificar? \n1) Clase. \n2) Modelo. \n3) Tipos de neumaticos. \n4) Ventajas. \n5) Desventajas.");
                        try{
                            int seleccion = Integer.parseInt(entrada.readLine());
                            Auto vehiculoModificado = (Auto) catalogo.get(modificarV -1);
                            switch(seleccion){
                                case 1:
                                   System.out.println("Indique la clase del vehiculo: \n- Kart. \n- Moto. \n- Atv.");
                                    String claseNueva = entrada.readLine();
                                    vehiculoModificado.setTipoVehiculo(claseNueva);
                                    break;
                                case 2: 
                                    System.out.println("Indique el nombre del modelo: ");
                                    String modeloNuevo = entrada.readLine();
                                    vehiculoModificado.setModelo(modeloNuevo);
                                    break;
                                case 3:
                                    System.out.println("Indique el tipo de neumaticos: \n- Estandar. \n- Monster. \n- Roller. \n- Madera. \n- Metal. \n- Oro.");
                                    String neumaticosNuevos = entrada.readLine();
                                    vehiculoModificado.setTipoNeumatico(neumaticosNuevos);
                                    break;
                                case 4:
                                    System.out.println("Indique las ventajas (separadas por una coma): \n- Velocidad. \n- Peso. \n- Aceleracion. \n- Control. \n- Todo terreno. \n- Turbo.");
                                    String ventajasNuevas = "+ " + entrada.readLine();
                                    vehiculoModificado.setVentajas(ventajasNuevas);
                                    break;
                                case 5:
                                    System.out.println("Indique las desventajas (separadas por una coma): \n- Velocidad. \n- Peso. \n- Aceleracion. \n- Control. \n- Todo terreno. \n- Turbo");
                                    String desventajasNuevas = "- " + entrada.readLine();
                                    vehiculoModificado.setDesventajas(desventajasNuevas);
                                    break;
                                default:
                                    System.out.println("Caracteristica no encontrada, intente de nuevo.");
                                    break;
                            }
                        }catch(IOException | NumberFormatException ex){
                            System.out.println("Valor no numero ingresado, intente de nuevo.");
                        } 
                    }
                    break;
                case 6:
                    System.out.println("\n¡Hasta pronto!");
                    terminar = 5;
                    break;
                default:
                    System.out.println("Opcion no encontrada. Intente de nuevo.");
                    break;
            }
            }catch(IOException | NumberFormatException ex){
                System.out.println("Valor no numerico ingresado. Intente de nuevo.");
            }
            
        }while(terminar != 5);
    }
    
    
}
