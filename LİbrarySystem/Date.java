// Tuğba Nur Aslan
// 210101030

public class Date {
    int day;
    int month;
    int year;

// Constructor 
public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
}

// Metods
public int getDay(){
    return day;
}

public int getMonth(){
    return month;
}

public int getYear(){
    return year;
}

public String toString() {
    return "Date: " + day + " " + month + " " + year; 
}

public static void main(String[] args) {
     
}

}
