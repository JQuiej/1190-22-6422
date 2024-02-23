
package Nodos;

/**
 *
 * @author Quiej
 */
public class Arbol {
    NodoArbol inicial;
    
    public Arbol (){
        this.inicial = null;
    }
    
    public void insertar(int valor){
        if (this.inicial == null){
            this.inicial = new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    public void IniciarInOrden(){
        this.InOrden(this.inicial);
    }
    
    public void InOrden(NodoArbol nodo){
        if (nodo == null){
            return; 
        }else{
           InOrden(nodo.getNodoIzquierdo());
           System.out.print(nodo.getValor() + ", ");
           InOrden(nodo.getNodoDerecho());           
        }
    }
    public void IniciarPosOrden(){
        this.PosOrden(this.inicial);
    }
    
    public void PosOrden(NodoArbol nodo){
        if (nodo == null){
            return; 
        }else{
           PosOrden(nodo.getNodoIzquierdo());
           PosOrden(nodo.getNodoDerecho());
           System.out.print(nodo.getValor() + ", ");        }
    }
    public void IniciarPreorden(){
        this.PreOrden(this.inicial);
    }
    
    public void PreOrden(NodoArbol nodo){
        if (nodo == null){
            return; 
        }else{
           System.out.print(nodo.getValor() + ", ");
           PreOrden(nodo.getNodoIzquierdo());
           PreOrden(nodo.getNodoDerecho());
        }
    }
    
    
}
