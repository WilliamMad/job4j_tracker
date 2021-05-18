package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 999);
        Book book2 = new Book("To be or not to be", 10_000);
        Book book3 = new Book("Java for Dummies", 500);
        Book book4 = new Book("Dirty Code", 10);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bcs = books[index];
            System.out.println("Название книги: " + bcs.getBookName() + System.lineSeparator()
                    + "Количество страниц: " + bcs.getPages());
        }
        System.out.println();
        System.out.println("Replace \"Clean Code\" for \"Dirty Code\" ");
        System.out.println();
        books[0] = book4;
        books[3] = book1;
        for (int index = 0; index < books.length; index++) {
            Book bcs = books[index];
            System.out.println("Название книги: " + bcs.getBookName() + System.lineSeparator()
                    + "Количество страниц: " + bcs.getPages());
        }
        System.out.println();
        System.out.println("Show book with name \"Clean Code\" only");
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bcs = books[index];
            if (bcs.getBookName().equals("Clean Code")) {
                System.out.println("Название книги: " + bcs.getBookName() + System.lineSeparator()
                        + "Количество страниц: " + bcs.getPages());
            }
        }
    }
}
