public class Book 
{
    private String name;
    private String isbn;
    private String author;
    private String publisher;

    public Book(String name, String isbn, String author, String publisher) 
    {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }


    public void setName(String name) 
    {
        this.name = name;
    }

    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    
    public String getName() 
    {
        return name;
    }

    public String getIsbn() 
    {
        return isbn;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getPublisher() 
    {
        return publisher;
    }


    public String getBookInfo() 
    {
        return "Book Name: " + name + ", ISBN: " + isbn + ", Author: " + author + ", Publisher: " + publisher;
    }

 
    public static void main(String[] args) 
    {
        Book book1 = new Book("Effective Java", "978-0134686097", "Joshua Bloch", "Addison-Wesley");
        System.out.println(book1.getBookInfo());


        book1.setAuthor("Joshua Bloch and Others");
        System.out.println(book1.getBookInfo());
    }
}

***OUTPUT***

Book Name: Effective Java, ISBN: 978-0134686097, Author: Joshua Bloch, Publisher: Addison-Wesley
Book Name: Effective Java, ISBN: 978-0134686097, Author: Joshua Bloch and Others, Publisher: Addison-Wesley