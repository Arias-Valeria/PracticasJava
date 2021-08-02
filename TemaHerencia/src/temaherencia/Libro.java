
package temaherencia;

public class Libro extends Publicacion{
         private int ISBN;
    private int numero_pagina;

    public Libro(int ISBN, int numero_pagina, String editor, int edicion, String fecha_publicacion) {
        super(editor, edicion, fecha_publicacion); // constructor de la clase padre
        this.ISBN = ISBN;
        this.numero_pagina = numero_pagina;
    }

    public Libro(int ISBN, int numero_pagina) {
        this.ISBN = ISBN;
        this.numero_pagina = numero_pagina;
    }
    
    public Libro(){
}

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumero_pagina() {
        return numero_pagina;
    }

    public void setNumero_pagina(int numero_pagina) {
        this.numero_pagina = numero_pagina;
    }
}
