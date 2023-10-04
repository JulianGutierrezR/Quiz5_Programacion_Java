import java.util.LinkedList;

public class Biblioteca {
    LinkedList<Libro> librosDisponibles = new LinkedList<>();

    /**
     * Registra un libro en la biblioteca.
     *
     * @param libro El libro que se va a registrar.
     */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Busca un libro por su título en la biblioteca.
     *
     * @param titulo El título del libro que se busca.
     * @return El libro encontrado o null si no se encuentra.
     * 
     * Complejidad temporal: O(N) Tiempo Lineal
     */
    public Libro buscarLibro(String titulo) {
        for (int i = 0; i < librosDisponibles.size(); i++) {
            Libro libroBuscado = librosDisponibles.get(i);
            if (libroBuscado.getTitulo().equals(titulo)) {
                return libroBuscado;
            }
        }
        return null;
    }

    /**
     * Devuelve una lista de todos los libros disponibles en la biblioteca.
     *
     * @return Una lista de libros disponibles.
     */
    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }
}
