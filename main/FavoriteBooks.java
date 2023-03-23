package main;

import books.BookAuthorPairs;
import books.HashMapDuplicateRemover;
import books.HashMapToList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoriteBooks {
    public static void main (String[] args){

        // map stores all book titles & authors entered by the user
        HashMap<String, String> bookAuthorPairs = BookAuthorPairs.createFavoriteBooksMap();

        // map w/ only unique book-author pairs
        HashMap<String, String> uniqueBookAuthorPairs = HashMapDuplicateRemover.removeDuplicates(bookAuthorPairs);

        // list w/ alphabetically sorted book-author pairs
        List<Map.Entry<String, String>> orderedFavoriteBooks = HashMapToList.createListFromHashMap(uniqueBookAuthorPairs);

        // print out favorite books w/ according authors in alphabetical order
        for (HashMap.Entry<String, String> entry : orderedFavoriteBooks) {
            System.out.println(entry.getKey() + " by " + entry.getValue());
        }
    }
}
