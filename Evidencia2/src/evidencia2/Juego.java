
package evidencia2;
public class Juego {
    private static String [] preguntas = {"¿Tu personaje es Hombre/Macho?", "¿Es cobarde?", "¿Es el cerebrito del grupo y viste de naranja?", "¿Siempre viste una camisa verde?", "¿Es el líder del grupo?", "¿Es una chica que siempre está a la moda?", "¿Es un perro glotón amante de las Scooby Galletas?" };
    private static  String [] respuestas = {"Shagy Rogers", "Scooby Doo", "Fred Jones", "Vilma Dinkley", "Daphne Blake", "¡Creo que el personaje que estás pensando no es parte de La máquina del misterio!"};
    private static int Shagy,Scooby, Fred, Vilma, Daphne, nulo;
    private String msj;
    static String persona;
    
    public Juego(){
        Shagy = 0;
        Scooby = 0;
        Fred = 0;
        Vilma = 0;
        Daphne = 0;
        nulo = 0;
    }

    public int getShagy() {
        return Shagy;
    }



    public int getScooby() {
        return Scooby;
    }

    public void setScooby(int Scooby) {
        Juego.Scooby = Scooby;
    }

    public int getFred() {
        return Fred;
    }

    public void setFred(int Fred) {
        Juego.Fred = Fred;
    }

    public int getVilma() {
        return Vilma;
    }

    public void setVilma(int Vilma) {
        Juego.Vilma = Vilma;
    }

    public int getDaphne() {
        return Daphne;
    }

    public void setDaphne(int Daphne) {
        Juego.Daphne = Daphne;
    }

    public int getNulo() {
        return nulo;
    }

    public void setNulo(int nulo) {
        Juego.nulo = nulo;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
    public static String determinarPregunta (int key, int nivel, String msj){
        String pregunta = "";
            switch(nivel){
                case 0:
                    if(msj.equals(preguntas[0])){
                        if(key == 1){
                            Shagy ++; Fred ++; Scooby ++;
                            pregunta = preguntas[1];
                        }else{
                            Vilma++; Daphne++;
                            pregunta = preguntas[2];
                        }
                    }
                    break;
                case 1:
                    if(msj.equals(preguntas[1])){
                        if(key == 1){
                            Shagy++; Scooby++;
                            pregunta = preguntas [3];
                        }else{
                            Fred++;
                            pregunta = preguntas[4];
                        }
                    }else if(msj.equals(preguntas[2])){
                        if(key == 1){
                            Vilma++;
                            persona = determinarPersonaje();
                            System.out.println("\n¡Tu personaje es: " + persona + "!");
                            
                        }else{
                            Daphne++;
                            pregunta = preguntas[5];
                        }
                    }
                    break;
                case 2:
                  if(msj.equals(preguntas[3])){
                      if(key == 1){
                          Shagy++;
                          persona = determinarPersonaje();
                          System.out.println("\nTu personaje es: " + persona+"!");
                      }else{
                          Scooby++;
                          pregunta = preguntas[6];
                      }
                  }else if(msj.equals(preguntas[4])){
                      if(key == 1){
                          Fred++;
                          persona = determinarPersonaje();
                          System.out.println("\nTu personaje es: " + persona+"!");
                      }else{
                          nulo++;
                          persona = determinarPersonaje();
                          System.out.println(persona);
                      }
                  }else if(msj.equals(preguntas[5])){
                      if(key == 1){
                          Daphne ++;
                          persona = determinarPersonaje();
                          System.out.println("\nTu personaje es: " + persona+"!");
                      }else{
                          nulo ++;
                          persona = determinarPersonaje();
                          System.out.println("\nTu personaje es: " + persona+"!");
                      }
                  }
                    break;
                case 3:
                    if(msj.equals(preguntas[6])){
                        if(key == 1){
                          Scooby ++;
                          persona = determinarPersonaje();
                          System.out.println("\nTu personaje es: " + persona+"!");
                        }else{
                            nulo++;
                            persona = determinarPersonaje();
                            System.out.println("\nTu personaje es: " + persona+"!");
                            
                        }
                    }
                    break;
                default:
                    break;
            }
        
        return pregunta;
    }
    
    public static int detenerJuego(){
        int r = 0;
        if(persona.equals(respuestas[3])){
            r = 1;
        }else{
            r = 2;
        }
        return r;
    }
    
    public static String determinarPersonaje (){
        String personaje = "";
        if(Shagy == 3){
            personaje = respuestas [0];
        }else if(Scooby == 4){
            personaje = respuestas [1];
        } else if (Fred == 3){
            personaje = respuestas[2];
        }else if(Vilma == 2){
            personaje = respuestas [3];
        }else if(Daphne == 3){
            personaje = respuestas [4];
        }else if(nulo == 1){
            personaje = respuestas[5];
        }
        return personaje;
    }
    
    
    
    /*Posicion de las preguntas.
    [0] -- ¿Tu personaje es Hombre/Macho?
    [1] -- ¿Es cobarde?
    [2] -- ¿Es el cerebrito del grupo y viste de naranja?
    [3] -- ¿Siempre viste una camisa verde?
    [4] -- ¿Es el líder del grupo?
    [5] -- ¿Es una chica que siempre está a la moda?
    [6] -- ¿Es un perro glotón amante de las Scooby Galletas?
    
    public String determinarPersonaje (){
        String personaje = "";
        if(Shagy == 3){
            personaje = respuestas [0];
        }else if(Scooby == 3){
            personaje = respuestas [1];
        } else if (Fred == 2){
            personaje = respuestas[2];
        }else if(Vilma == 1){
            personaje = respuestas [3];
        }else if(Daphne == 1){
            personaje = respuestas [4];
        }else{
            personaje = respuestas[5];
        }
        return personaje;
    }
    
    Posicion de las respuestas.
    [0] -- Shagy Rogers
    [1] -- Scooby Doo
    [2] -- Fred Jones
    [3] -- Vilma Dinkley
    [4] -- Daphne Blake
    [5] -- ¡Creo que el personaje que estás pensando no es parte de La máquina del misterio!
    */
}
