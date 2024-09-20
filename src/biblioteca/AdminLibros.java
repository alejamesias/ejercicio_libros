package biblioteca;

public class AdminLibros {
    public static void main(String[] args) {
        Libro libroUno = new Libro("Yo antes de ti", "Jojo Moyes", 496, 2014);
        Libro libroDos = new Libro("El Principito", "Antoine de Saint", 120, 1943);

        System.out.println("Datos del libro 1: ");
        libroUno.mostrarDatosLibros();
        System.out.println("Nombre del Libro 1: " + libroUno.getTitulo());
        System.out.println("Autor del Libro 1: " + libroUno.getAutor());
        System.out.println("Numero de Paginas del Libro 1: " + libroUno.getNumeroDePaginas());
        System.out.println("Año de Publicacion del Libro 1: " + libroUno.getAnoDePublicacion());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Datos del libro 2: ");
        libroDos.mostrarDatosLibros();
        System.out.println("Nombre del Libro 2: " + libroDos.getTitulo());
        System.out.println("Autor del Libro 2: " + libroDos.getAutor());
        System.out.println("Numero de Paginas del Libro 2: " + libroDos.getNumeroDePaginas());
        System.out.println("Año de Publicacion del Libro 2: " + libroDos.getAnoDePublicacion());


        //Modificacion libro
        //libroUno.setNumeroDePaginas(500);
        //System.out.println("Numero de paginas del Libro 1 Modificado: "+ libroUno.getNumeroDePaginas());

    }
}
