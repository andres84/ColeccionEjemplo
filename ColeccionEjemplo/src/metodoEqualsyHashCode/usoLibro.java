package metodoEqualsyHashCode;

public class usoLibro {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro("andres", "fragozo", 0001);
        Libro libro2 = new Libro("andres", "fragozo", 0001);
        
        //libro1 = libro2;
        
        if(libro1.equals(libro2)){
            
            System.out.println("los libros son iguales");
            System.out.println(libro1.hashCode());//ver numero de refencia asignado en memoria
            System.out.println(libro2.hashCode());//ver numero de refencia asignado en memoria
            
        }else{
            
            System.out.println("los libros son diferentes");
            System.out.println(libro1.hashCode());//ver numero de refencia asignado en memoria
            System.out.println(libro2.hashCode());//ver numero de refencia asignado en memoria
        }
        
    }

    
}
