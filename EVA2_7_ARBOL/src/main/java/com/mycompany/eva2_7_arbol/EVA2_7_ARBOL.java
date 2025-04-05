/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_arbol;

/**
 *
 * @author Admin
 */
public class EVA2_7_ARBOL {

    public static void main(String[] args) {
        ArbolBi arbolB = new ArbolBi();
        arbolB.add(50);
        arbolB.add(30);
        arbolB.add(70);
        arbolB.add(20);
        arbolB.add(40);
        arbolB.add(60);
        arbolB.add(80);

        // Imprimir en orden
        arbolB.inorder();
        
    }
}
