package books;

import java.util.HashMap;

public class BookAuthorPairs {
    public static HashMap<String, String> createFavoriteBooksMap(){
        /* helper method -- saves user input as book-author pairs, returns HashMap */
        HashMap<String, String> books = new HashMap<>();
        String book, author;

        System.out.println("""
                Enter your favorite books along with the authors.\s
                 To exit, type 0\s
                """);

        do {
            book = StrInputUtil.askStrInput("Enter a book title: ");
            if(book.equals("0")){
               break;
            }
            author = StrInputUtil.askStrInput("Enter the author of this book: ");
            books.put(book, author);

        } while (true);

        return books;
    }
}
