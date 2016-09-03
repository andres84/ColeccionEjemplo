package metodoEqualsyHashCode;

public class Libro {

    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {

        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;

    }

    public String getDattos() {

        return "El titulo es " + titulo + ", el autor es " + autor + ", codigo ISBN " + ISBN;

    }

    /*@Override
    public boolean equals(Object obj) {

        if (obj instanceof Libro) {

            Libro otro = (Libro) obj;

            if (this.ISBN == otro.ISBN) {

                return true;

            } else {

                return false;
            }

        } else {

            return false;
        }

    }*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.ISBN;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.ISBN != other.ISBN) {
            return false;
        }
        return true;
    }
    
    
    

}
