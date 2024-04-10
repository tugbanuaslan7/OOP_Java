// Tuğba Nur Aslan
// 210101030

public class Person {
    // Fields
    String firstName;
    String lastName;
    Date dateOfBirth;

// Constructors
public Person(String firstName, String lastName, int day, int month, int year){
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = new Date(day, month, year);

}

public Person(String firstName, String lastName, int day, int month, int year){
    this.firstName = firstName;
    this.lastName = lastName;

    this.dateOfBirth = new Date(day, month, year); // an instance of the Date class
}

// Methods
public String getFirstName(){
    return firstName;
}

public String getLastName(){
    return lastName;
}

public Date getDateOfBirth(){
    return dateOfBirth;
}

@Override
public String toString() {
    return "Person: " + firstName + " " + lastName + ", Date of Birth: " + dateOfBirth;
}



}