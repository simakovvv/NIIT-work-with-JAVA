public class BooksName {
    public static void main(String[] args) {
        Author author1 = new Author("Kay Horsman","Horsman@gmail.com",'m',25);
        Author author2 = new Author("Gerbert Shild", "Shild@mail.ru",'m',25);
        
        System.out.println("-----------------Authors before adding--------------------");

        Book book = new Book("Java vol 1",new Author[]{author1,
                new Author("Htoto Htotoev", "Htoto@mil.com",'m',11)}, 100.);



        System.out.println(book);
        book.addNewAuthor(author2);


        System.out.println("-----------------Authors after adding--------------------");
        System.out.println(book);

    }
}
