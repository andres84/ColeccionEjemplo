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
        
        System.out.println("-----------------------------------");
        
    Articulo comparaArticulo = new Articulo();
    
    TreeSet<Articulo> orden_articulo2 = new TreeSet(comparaArticulo);
    
    orden_articulo2.add(articulo1);
    orden_articulo2.add(articulo2);
    orden_articulo2.add(articulo3);
    
    for(Articulo a2 : orden_articulo2){
        
        System.out.println(a2.getDescripcion());
        
    }
        
    }
    
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{

    private int num;
    private String Desc;
    
    public Articulo(){
        
        
        
    }

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

    @Override
    public int compare(Articulo o1, Articulo o2) {
        
        String descripcionA=o1.getDescripcion();
        String descripcionB=o2.getDescripcion();
        
        return descripcionA.compareTo(descripcionB);
        
    }
    
    
    
}
