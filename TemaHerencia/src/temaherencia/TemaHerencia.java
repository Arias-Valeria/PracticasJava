
package temaherencia;

public class TemaHerencia {

    public static void main(String[] args) {
    Libro HarryPotterPiedraFilosofal= new Libro(1234,250,"Patito",2018,"01/01/207");
        HarryPotterPiedraFilosofal.setFecha_publicacion("31/12/2019");
        System.out.println(HarryPotterPiedraFilosofal.getFecha_publicacion());
        System.out.println(HarryPotterPiedraFilosofal.getEditor());
        System.out.println(HarryPotterPiedraFilosofal.getISBN());
        HarryPotterPiedraFilosofal.imprimeDatos();
        System.out.println("-----------------------");
        
        Folleto contamionAire = new Folleto("Patito",2020,"1/01/2020","Contaminación del aire");
        System.out.println(contamionAire.getFecha_publicacion());
        System.out.println(contamionAire.getEditor());
        System.out.println(contamionAire.getTema());
        contamionAire.imprimeDatos();
        System.out.println("-----------------------");
        
        Revista hola = new Revista();
        System.out.println(hola.getFecha_publicacion());
        System.out.println(hola.getEditor());
        System.out.println(hola.getCodigo_barra());
        hola.imprimeDatos();
        
        Publicacion publicaciones[] = new Publicacion[4]; // tipo Objetos hijos que vengan de la clase Publicacion
        // Libros, folletos y revistas
        publicaciones[0] = new Libro(1234,250,"Patito",2018,"01/01/207");
        publicaciones[1] = new Folleto("Patito",2020,"1/01/2020","Contaminación del aire");
        publicaciones[2] = new Revista("Patito",2018,"01/01/207","54657589484","Patito2");
        publicaciones[3] = new Publicacion("Patito",2018,"01/01/207");
        
        for(int aux = 0; aux < publicaciones.length; aux++ ){
            Publicacion item = publicaciones[aux];
            if( item instanceof Libro ){
                Libro item_libro = (Libro) item; // cast
                System.out.println(item_libro.getISBN());
            }else if( item instanceof Folleto ){
                Folleto item_folleto = (Folleto) item;
                System.out.println(item_folleto.getTema());
            }else if( item instanceof Revista){
                Revista item_revista = (Revista) item;
                System.out.println(item_revista.getCodigo_barra());
            }else{
                System.out.println(item.getFecha_publicacion());
            }
            System.out.println("------- ... ---------");
        }
    }
    
    }
    

