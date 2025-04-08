/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class EVA2_8_collections1 {

    public static void main(String[] args) {
        LinkedList<Integer> miLista = new LinkedList();
        miLista.add(100);
        miLista.add(200);
        miLista.add(300);
        miLista.add(400);
        miLista.add(500);
        miLista.add(600);
        miLista.add(700);
        System.out.println(miLista);
        miLista.add(1,69);
        System.out.println(miLista);
        
        System.out.println("array");
        ArrayList<String>miArrayList = new ArrayList();
        miArrayList.add("hola");
        miArrayList.add("");
        miArrayList.add("mundo");
        miArrayList.add("");
        miArrayList.add("cruel");
        miArrayList.add("");
        System.out.println(miArrayList);
        for (int i = 0; i < miArrayList.size();          i++) {
            System.out.println("{"+ miArrayList.get(i)+ "}");
            
        }
        System.out.println("queues");
        Queue<Integer>myQueue = new LinkedList();
        
        
        
        System.out.println("stack");
        Stack<Integer> stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println("cima" + stack.peek());
        System.out.println(stack);
        System.out.println("cima"+ stack.pop());
        System.out.println(stack);
        
       HashSet<String> conjunto = new HashSet();
               conjunto.add("rojo");
               conjunto.add("azul");
               conjunto.add("verde");
               conjunto.add("amarillo");
               conjunto.add("amarillo");
               System.out.println(conjunto);
               
               Map<String, Integer> mapa= new HashMap();
               mapa.put("lunes", 1);
               mapa.put("martes", 2);
               mapa.put("miercoles", 3);
               mapa.put("jueves", 4);
               mapa.put("viernes", 5);
               mapa.put("sabado", 6);
               System.out.println(mapa.get("lunes"));
               System.out.println(mapa);
        
                
                
                
                
    }
}
