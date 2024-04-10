// Tuğba Nur Aslan
// 210101030

public class Patron extends Person {
    // Fields
    int libraryCardNumber;
    String emailAddress;
    static int lastLibraryCardNumber = -1;

// Constructor
public Patron(String firstName, String lastName, Date dateOfBirth, String emailAddress){
    super(firstName);
    super(lastName);
    super(dateOfBirth);
    this.libraryCardNumber = ++lastLibraryCardNumber;
    this.emailAddress = emailAddress;
}

// Methods
public int getLibraryCardNumber(){
    return libraryCardNumber;
}

public int getEmailAddress(){
    return emailAddress;
}

public String toString() {
     return super.toString() + "Library Card Number: " + libraryCardNumber + ", Email Address: " + emailAddress;
}




}





