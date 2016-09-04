package coleccionTreeSet;

import java.util.*;

public class appTreeSet {


    public static void main(String[] args) {
        
        
        /*TreeSet<String> ordenar = new TreeSet();//por default ordena en orden alfabetico segun el caso
        
        ordenar.add("isabella");
        ordenar.add("sara");
        ordenar.add("andres");
        
        
        for(String orden : ordenar){
            
            
            System.out.println(orden);
            
        }*/
        
        Articulo articulo1 = new Articulo(1, "primer articulo");
        
        Articulo articulo2 = new Articulo(300, "segundo articulo");
        
        Articulo articulo3 = new Articulo(3, "tercer articulo");
        
        TreeSet<Articulo> orden_articulo = new TreeSet();
        
        orden_articulo.add(articulo1);
        orden_articulo.add(articulo2);
        orden_articulo.add(articulo3);
        
        for(Articulo a : orden_articulo){
            
            System.out.println(a.getDescripcion());
            
        }
        
    }
    
}

class Articulo implements Comparable<Articulo>{

    private int num;
    private String Desc;

    public Articulo(int num, String Desc) {
        this.num = num;
        this.Desc = Desc;
    }
    
    
    
    @Override
    public int compareTo(Articulo o) {
        
        return num - o.num;
        
    }
    
    public String getDescripcion(){
        
        return Desc;
        
    }
    
    
    
}
