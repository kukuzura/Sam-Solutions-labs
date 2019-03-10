package library;

public class Library {
    private String name;
    private String address;
    private Book[] books;

    Library() {
        name="Библиотека им.Пушкина";
        address="ул.Гикало 7";
        books=new Book[4];
        books[0]=new Book("Достоевский","Бесы",1234);
        books[1]=new Book("Достоевский","Белые ночи",1243);
        books[2]=new Book("Пушкин","Евгений Онегин",1254);
        books[3]=new Book("Гоголь","Вий",1264);
    }

    public void showAllBooksAmount() {
        int booksAmount=0;
        for (Book book : this.books) {
            booksAmount++;
        }
        System.out.println("Amount of books"+booksAmount);
    }

    public void showAllAuthorsAmount(){       ///
        int authorsAmount=0;
        String[] notRepeatAuthors=new String[books.length];
        for(int i=0;i<books.length;i++){
            for(int j=0;j<books.length;j++) {
                if (notRepeatAuthors[j]!=books[i].getAuthor()) {
                    notRepeatAuthors[i] = books[i].getAuthor();
                    authorsAmount++;
                    break;
                }
                else break;
            }
        }
        System.out.println("Authors amount:"+authorsAmount);

    }

    public void showAllBooksInPeriod(int beginDate,int endDate){
        for(Book book:books){
            if(book.getPublicationYear()>=beginDate&&book.getPublicationYear()<=endDate)
                book.showBookInf();
        }
    }

    public static void main(String[] args) {
        Library lib=new Library();
        lib.showAllAuthorsAmount();
        lib.showAllBooksAmount();
        lib.showAllBooksInPeriod(1234,1250);
    }

}
