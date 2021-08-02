/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3verano;

/**
 *
 * @author salva
 */
public class Nodo {
    private String valor;
    private Nodo sig;
    
    //  Contructor que inicializa el valor de las variables
    
    public void Nodo(){
        this.valor = null;
        this.sig = null;
    }
    
    // Métodos get y set para los atributos.
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }   
}