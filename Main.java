

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Agregar algunos libros
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        // Listar los libros
        library.listBooks();
        
     // Listar los libros ordenado
        library.listBooksTitle();

        // Buscar libros
        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Libro encontrado: " + foundBook);
        } else {
            System.out.println("Libro no encontrado.");
        }
        
     // Buscar autor
        Book foundBook2 = library.findBookByAuthor("George Orwell");
        if (foundBook != null) {
            System.out.println("Libro encontrado: " + foundBook);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}


