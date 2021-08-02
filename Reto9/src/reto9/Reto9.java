
package reto9;

public class Reto9 {
    
    public static void main(String[] args) {
       Minion[] nuevoMinion = new Minion[5];
       //Crea los 5 objetos. 
       for(int i = 0; i < nuevoMinion.length; i++){
           nuevoMinion[i] = new Minion();
       }
       //Imprime las características de los cinco objetos.
       for(int turno = 0; turno < nuevoMinion.length; turno++ ){
           System.out.println("Características del Minion " + (turno +1));
           System.out.println("Número de ojos: " + nuevoMinion[turno].getNumOjos());
           System.out.println("Color de piel: " + nuevoMinion[turno].getColorPiel());
           System.out.println("Altura: " + nuevoMinion[turno].getAltura());
           System.out.println("Nivel de creacion: " + nuevoMinion[turno].getNivelCreacion());
           System.out.println("Nivel de destruccion: " + nuevoMinion[turno].getNivelDestruccion());
           System.out.println("Nivel de reparacion: " + nuevoMinion[turno].getNivelReparacion());
           System.out.println("-------------------------------------------------------------------");
       }
    }
    
}
