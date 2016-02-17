package bookserviceswt.provider;

import java.io.IOException;
import java.util.List;

import bookserviceswt.model.BookTo;
import bookserviceswt.rest.*;

public enum BookProvider {

	INSTANCE;

	private List<BookTo> books;
	private BookRestService bookRestService = new BookRestService();

	private BookProvider() {
		try {
			books = bookRestService.sendGET("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addBook(BookTo book){
		books.add(book);
	}

	public List<BookTo> getBooks() {
		return books;
	}

}
