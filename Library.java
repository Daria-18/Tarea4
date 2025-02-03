package Tarea4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Library {
	private List<Book> books;

	public Library() {
		books = new ArrayList<>();
	}

	// Funcionalidad para agregar un libro
	public void addBook(Book book) {
    	if(books.contains(book)){
    		System.out.println("Libro " + book.getTitle() +  " ya existe.");
    	}
    	else {
	    	books.add(book);
	        System.out.println("Libro agregado: " + book);
    	}
    }
    
 // Funcionalidad para listar todos los libros ordenados por titulo
    public void listBooksTitle() {
        System.out.println("Lista de libros ordenados por título:");

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle()); // Asumiendo que tienes un método getTitle() en Book
            }
        });

        // Imprimir los libros ordenados
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    // Funcionalidad para buscar un libro por autor
    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
  
	// Funcionalidad para eliminar un libro
		public void deleteBook(Book book) {
	    	if(books.contains(book)){
	    		System.out.println("Libro " + book.getTitle() +  " si existe.");
	    		books.remove(book);
	    	}
	    	else {
		    	books.add(book);
		        System.out.println("Libro no existente: " + book);
	    	}
	    }
	
	// Funcionalidad para listar todos los libros
	public void listBooks() {
		System.out.println("Lista de libros:");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
