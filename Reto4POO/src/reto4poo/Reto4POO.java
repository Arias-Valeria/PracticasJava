package reto4poo;

public class Reto4POO {
    
    public static void main(String[] args) {
        //Filas: sabor del cafe frio vendido por trimestre.
        //columnas: el trimestre indicado del año anterior.
        //mostrar: el trimestre que más se vende por cada sabor. y el trimestre que vende más producto en general.
        //[4] filas y [4] columnas.
        //cada bloque representa una fila (4), lo que está dentro son las columnas (4) y los números son los valores.
        String[] trimestre = {"Ene-Feb-Mar", "Abr-May-Jun", "Jul-Ago-Sep", "Oct-Nov-Dic"};
        String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"}; 
        //Bloque/Fila 1 (Choco) Bloque/Fila 2 (Vainilla) Bloque/Fila 3 (Fresa) Bloque/Fila 4 (Oreo)
        int ventasTotal [][] = {{111, 483, 471, 427}, {192, 500, 355, 158}, {289, 470, 474, 160}, {415, 114, 161, 308}};
        int [] posicionTrimestre = posicionTrimestresPorSabor(ventasTotal);
        int trimestreMayor = TrimestreMayorGeneral(ventasTotal);
        
       
        for(int i = 0; i < 4; i ++){
            int posicion = posicionTrimestre[i];
            System.out.println("Trimestre de mayor venta de " + sabores [i] + ": " + trimestre[posicion] + " con " + ventasTotal[i][posicion] + " Unidades.");
                
        }
        
        //Para los trimestres en General.
        System.out.println("El trimestre con mayor ventas en general fue: " + trimestre[trimestreMayor]);
        
    }
    //Al pasar el arreglo, es una referencia, no una copia.
    public static int [] posicionTrimestresPorSabor (int [][] ventasTotal){
        int [] posicionTrimestre = {0,0,0,0};
        for (int fila = 0; fila < 4; fila ++){
            //cuando fila sea = 0, columna es igual a 0
            int mayor = ventasTotal [fila][0];
            //Este for define las columnas.
            for(int columna = 0; columna < 4; columna ++){
               if (ventasTotal [fila][columna] > mayor){
                    //La posicion del mayor se guarda en posicionTrimestre; en la fila que se está evaluando es igual a la columna en que se guarda mayor.
                   mayor = ventasTotal[fila][columna];
                    //Guarda la posicion del valor mayor en la fila indicada [fila] y en qué columna esta.
                   posicionTrimestre [fila] = columna;
               }     
            }
        }
        return posicionTrimestre;
    }
    
    public static int TrimestreMayorGeneral (int [] [] ventasTotal){
        //Para guardar la suma de las columnas de ventasTotal.
        int [] sumaTrimestre = {0,0,0,0};
        //Un for para la sumatoria de las columnas de ventasTotal.
        for (int fila = 0; fila < 4; fila ++){
            for (int columna = 0; columna < 4; columna ++){
                sumaTrimestre[fila] += ventasTotal[columna][fila];
            }
        }
        int mayorSuma = sumaTrimestre[0];
        int trimestreMayor = 0;
        //Un for para comprar las sumatorias de las columnas, guardadas en el arreglo sumaTrimestre, y guardando el mayor en la
        //variable trimestreMayor.
        for(int columna = 0; columna < 4; columna ++){
            if (sumaTrimestre[columna] > mayorSuma){
                mayorSuma = sumaTrimestre[columna];
                trimestreMayor = columna;
            }
        }
        return trimestreMayor;
    }
   
}
