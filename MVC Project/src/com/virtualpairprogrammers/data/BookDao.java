package com.virtualpairprogrammers.data;

import java.util.List;

import com.virtualpairprogrammers.domain.Book;

public interface BookDao 
{
	   public List<Book> allBooks();
	   public Book findByIsbn(String isbn) throws BookNotFoundException;
	   public void create(Book newBook);
	   public void delete(Book redundantBook);
	   public List<Book> findBooksByAuthor(String author);
	public List<Book> findBooksLooseMatch(String chars);   
}
