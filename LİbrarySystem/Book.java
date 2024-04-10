// Tuğba Nur Aslan
// 210101030
 public class Book extends LibraryItem {

    // Fields 
    Person author;
    String isbn;

// Constructor
public Book(String title, String firstName, String lastName, Date dateOfBirth, String isbn){
    super(title);
    this.author = new Person(firstName, lastName, dateOfBirth);
    this.isbn = isbn;

}

// Methods
public Person getAuthor(){
    return author;
}

public String getISBN(){
    return isbn;
}

public String toString() {
    return super.toString() + " Author: " + author + " ISBN: " + isbn;

}



}