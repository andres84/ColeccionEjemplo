/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionSet_HashSet;

import java.util.*;

/**
 *
 * @author sara
 */
public class CuentasUsuarios {
    
    public static void main(String... fragozo){
        
        //crear objetos
        Cliente cl1 = new Cliente("andres fragozo", "00001", 200000);
        Cliente cl2 = new Cliente("Sara fragozo", "00002", 300000);
        Cliente cl3 = new Cliente("Isabella fragozo", "00003", 400000);
        Cliente cl4 = new Cliente("Liliana cantor", "00004", 500000);
        Cliente cl5 = new Cliente("andres fragozo", "00001", 200000);
        
        //crear collecion
        
        Set<Cliente> clientesBanco = new HashSet();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        
        //recorrer la coleccion
       
        //StringBuilder concat = new StringBuilder();
        
        for(Cliente cliente : clientesBanco){
            
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());  
            
        }
        
    }
    
}
