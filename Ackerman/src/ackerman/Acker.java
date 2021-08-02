
package ackerman;

public class Acker {
    static int i;
    
    public int Ack(int m, int n) {

        if (m == 0) {
            System.out.println(i + ".- m: " + m + " - n: " + n);
            i++;
            return n + 1;
        } else if (n == 0) {
            System.out.println(i + ".- m: " + m + " - n: " + n);
            i++;
            return Ack(m - 1, 1);
        } else {
            System.out.println(i + ".- m: " + m + " - n: " + n);
            i++;
            return Ack(m - 1, Ack(m, n - 1));
        } // Not sure what to return here, Eclipse suggested this.
    }
    
    /*
    La recursividad ocurre cuando dentro de un metodo se llama así mismo para ejecutar una tarea y donde los parámetros cambian.
    En el ejemplo que hemos desarrollado en clase se hace uso de la función de ackermann, la cual consiste en hallar un valor 
    utilizando dos numeros. El proceso es el siguiente:
    Tenemos el caso base ubicado en la parte superior que corresponde al if(m == 0 ), donde sí se cumple está condición, el método
    terminará, devolviendo el valor correspondiente, sin embargo, de no cumplir con la primera condición, se pasará a la siguiente
    de manera en que irá restando los numeros de n y m hasta llegar a 0 y cumplir con las condiciones, esta accion desencadena varios
    ciclos anidados donde los valores de m y n parten de 0 a 1 y viceversa, hasta que finalmente m llegue a 0.
     m: 1 - n: 5
16.- m: 1 - n: 4
17.- m: 1 - n: 3
18.- m: 1 - n: 2
19.- m: 1 - n: 1
20.- m: 1 - n: 0
21.- m: 0 - n: 1
22.- m: 0 - n: 2
23.- m: 0 - n: 3
24.- m: 0 - n: 4
25.- m: 0 - n: 5
26.- m: 0 - n: 6
    */
}
