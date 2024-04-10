// Tuğba Nur Aslan
// 210101030

public class DVD extends LibraryItem {

    // Fields
    Person director;
    int runtimeMinutes; // DVD'nin çalışma süresi (dk)

// Constructor
public DVD(String title, Person director, int runtimeMinutes) {  
    this.director = director;
    this.runtimeMinutes = runtimeMinutes;
}

// Methods
public Person getDirector(){
    return director;
}

public Person getRuntimeMinutes(){
    return runtimeMinutes;
}

public String toString(){
    return super.toString() + " Director: " + director + " Run Time: " + runtimeMinutes;
}

}