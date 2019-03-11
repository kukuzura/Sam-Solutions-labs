package library;

public class Book {
    private String author;
    private String title;
    private int publicationYear;

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String author, String title, int publicationYear){
        this.author=author;
        this.publicationYear=publicationYear;
        this.title=title;
    }

    public void showBookInf(){
        System.out.println("Author"+author);
        System.out.println("Title"+title);
        System.out.println("Publication year"+publicationYear);
    }

}
