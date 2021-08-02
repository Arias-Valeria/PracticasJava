
package tema8;

public class Tema8 {
    public static void seleccion(int A[]){
        int i, j, menor, pos, tmp;
        for(i = 0; i < A.length; i++){
            menor = A[i];
            pos = i;
            for(j = i +1; j < A.length; j++){
                if(A[j] > menor){
                    menor = A[j];
                    pos = j;
                    
                }
            }
            if(pos != i){
                tmp = A[i];
                A[i] = A [pos];
                A[pos] = tmp;
            }
        }
    }
    public static void main(String[] args) {
     int [] lista = {2,3,6,9,1,4,8,5,7};
        seleccion(lista);
        
     
    }
    
}
