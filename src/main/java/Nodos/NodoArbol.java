package Nodos;
/**
 *
 * @author Quiej
 */
public class NodoArbol {
    
   private int valor;
   private NodoArbol nodoIzquierdo;
   private NodoArbol nodoDerecho;
   
   public NodoArbol(int valor){
       this.valor = valor;
       this.nodoDerecho = null;
       this.nodoIzquierdo = null;
   }

   public void insertar(int Nvalor){
       if (Nvalor < this.valor){
           if (this.nodoIzquierdo == null){
               this.nodoIzquierdo = new NodoArbol(Nvalor);
           }else {
               this.nodoIzquierdo.insertar(Nvalor);
           }
       }else{
           if (this.nodoDerecho == null){
               this.nodoDerecho = new NodoArbol(Nvalor);
           }else{
               this.nodoDerecho.insertar(Nvalor);
           }
       }
   }
   
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }
   
  
}
