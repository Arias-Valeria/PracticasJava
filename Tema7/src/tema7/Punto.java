
package tema7;
    public class Punto {
    //default 
    private double x;
    private double y;
    private static boolean valor;
    // 1.- se llama igual que la clase
    // 2.- nos sirve para inicializar valores o crear el objeto con valores vacios
    // Escenario --> crea punto x = 1 - y = 2
    public Punto() {
        x = 1;
        y = 2;
    }
    
    public Punto(double valorX, double valorY){
        x = valorX;
        y = valorY;
    }
    
    public Punto(double y){
        x = 1;
        this.y = y;
    }
    
    public void despligaPunto(){
        System.out.println(x + "," + y );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}

