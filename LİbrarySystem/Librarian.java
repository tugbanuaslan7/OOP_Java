// Tuğba Nur Aslan
// 210101030

public class Librarian extends Person {
    // Fields
    int employeeID;
    static int lastEmployeeID = -1;

// Constructor
public Librarian(int employeeID){
    super(firstName);
    super(lastName);
    super(dateOfBirth);
    this.employeeID = ++lastEmployeeID;

}

public int getEmployeeID(){
    return employeeID;
}

public String toString() {
    String personDetails = super.toString(); // Person classın toString metodunu çağırdım
    return "Librarian: " + personDetails + ", Employee ID: " + employeeID;
}

public static void main(String[] args) {
     
    }













}