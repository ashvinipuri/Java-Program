package assignment7;

public class Book {

    String author;
    String title;
        
    public Book(String author, String title) {
        this.author = author;
        this.title = title;		
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
	
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + "]";
    }
}

class Library {
    private int size;
    final static int MAX_SIZE = 6;
    private Book[] books;

    public Library() {
        size = 0;
        this.books = new Book[MAX_SIZE];
    }

    public void addBook(Book book) {
        if (size < MAX_SIZE) {
            books[size] = book;
            size++;
            System.out.println("Added: " + book);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < size; i++) {
                System.out.println(books[i]);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Author 1", "Title 1"));
        library.addBook(new Book("Author 2", "Title 2"));
        library.display();
    }
}
