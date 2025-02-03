package Tarea4;

import java.util.ArrayList;
import java.util.List;

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

	// Funcionalidad para buscar un libro por título
	public Book findBookByTitle(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
}
