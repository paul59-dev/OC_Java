public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Book {

    String title;
    String author;
    int numberOfPages;
    String publisher;

    // Constructeur secondaire
    Book(String title, String author, int numberOfPages) {

        // Constructeur avec la publication prédéfinie
        this(title, author, numberOfPages, "OC");
    }

    // Constructeur principal 
    Book(String title, String author, int numberOfPages, String publisher) {

        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
}