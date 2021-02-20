package kg.megacom.arrayListHT;

import kg.megacom.arrayListHT.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
Book book1= new Book("Critical Analyzes\n");
        Book book2= new Book("Business Management\n");
        Book book3= new Book("Concept tools\n");
        Book book4= new Book("The art of Thinking Clearly \n");
        Book book5= new Book("Tactfulness\n");



       List<Book> myFaveBooks = new ArrayList<>();

        myFaveBooks.add(book1);
        myFaveBooks.add(book2);
        myFaveBooks.add(book3);
        myFaveBooks.add(book4);
        myFaveBooks.add(book5);
        System.out.println(myFaveBooks);
        System.out.println();

        Collections.swap(myFaveBooks,4,3 );
        System.out.println(myFaveBooks);

        myFaveBooks.remove(4);
        System.out.println(myFaveBooks );
        System.out.println();



        System.out.println(myFaveBooks.get(3));
        System.out.println();

        myFaveBooks.clear();
        System.out.println("Have books been deleted ? :  "+ myFaveBooks.isEmpty());
        System.out.println();



        Book book6= new Book("Quiet: The Power of Introverts in a World That Can't Stop Talking \n");
        Book book7= new Book("The Tipping Point: How Little Things Can Make a Big Difference\n");
        Book book8= new Book("link: The Power of Thinking Without Thinking\n");


        myFaveBooks.add(book6);
        myFaveBooks.add(book7);
        myFaveBooks.add(book8);
        System.out.println(myFaveBooks);
        System.out.println("Amount of Arrays : "+ myFaveBooks.size());

        LinkedList<Book>booksInListL= new LinkedList<>();
        booksInListL.add(book1);
        booksInListL.add(book2);
        booksInListL.add(book3);
        booksInListL.add(book4);
        booksInListL.add(book5);
        booksInListL.add(book6);
        booksInListL.add(book7);
        booksInListL.add(book8);

        booksInListL.addFirst(book3);
        booksInListL.addFirst(book3);
        booksInListL.forEach(System.out::println);
        System.out.println("__________________");
        booksInListL.addLast(book3);
        booksInListL.addLast(book3);
        booksInListL.forEach(System.out::println);
        System.out.println("__________________");
        booksInListL.pollFirst();
        booksInListL.pollLast();
        booksInListL.forEach(System.out::println);
        System.out.println("__________________");



    }
}
