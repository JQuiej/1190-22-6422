
package com.mycompany.tareaarbolbinario;

import Nodos.Arbol;

/**
 *
 * @author Quiej
 */
public class main {

    public static void main(String[] args) {
        //ingresamos los datos del arbol binario en orden padre a hijos
        Arbol arbol = new Arbol();
        arbol.insertar(12);   
        arbol.insertar(7);   
        arbol.insertar(21);    
        arbol.insertar(4);   
        arbol.insertar(9);   
        arbol.insertar(16);   
        arbol.insertar(25);
        arbol.insertar(2);   
        arbol.insertar(8);   
        arbol.insertar(11);   
        arbol.insertar(19);

        //imprimimos los recorridos del arbol binario requeridos
        System.out.println("InOrden");
        arbol.IniciarInOrden();
        System.out.println(" ");
        System.out.println("PosOrden");
        arbol.IniciarPosOrden();
        System.out.println(" ");
        System.out.println("PreOrden");
        arbol.IniciarPreorden();
    }
    
}
