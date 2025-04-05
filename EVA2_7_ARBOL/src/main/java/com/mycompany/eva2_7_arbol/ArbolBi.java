/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_arbol;

/**
 *
 * @author Admin
 */
public class ArbolBi {
    private Nodo root;
    public ArbolBi(){
    root = null;
    }
    public void add(int valor){
      
    if(root== null){
        root = new Nodo(valor);
        
    
    }else{
        addRec(valor,root);
    
    }
    }
    private void addRec(int valor,Nodo actual){
        if(valor < actual.getValor()){
        if(actual.getIzquierda()== null){
        actual.setIzquierda(new Nodo(valor));
        }else{
        addRec(valor,actual.getIzquierda());
        }
        }else if(valor > actual.getValor()){
          
        if(actual.getDerecha()== null){
        actual.setDerecha(new Nodo(valor));
        }else{
        addRec(valor,actual.getDerecha());
        }
        
        }
    
    } 

    
    public void inorder(){
    inorderRec(root);
        System.out.println("");
    }
    private void inorderRec(Nodo actual){
        if(actual != null){
        inorderRec(actual.getIzquierda());
        System.out.println("{"+ actual.getValor()+"}");
        inorderRec(actual.getDerecha());
        
        }
    
    }
    public void preorden() {
        preordenRec(root);
        System.out.println("");
    }
    private void preordenRec(Nodo actual) {
        if (actual != null) {
            System.out.print("{" + actual.getValor() + "} "); // 1. Visitar raíz
            preordenRec(actual.getIzquierda());              // 2. Subárbol izquierdo
            preordenRec(actual.getDerecha());                // 3. Subárbol derecho
        }
    }
    
}
