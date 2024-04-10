// Tuğba Nur Aslan
// 210101030

public class Magazine extends LibraryItem {
    // Fields
    String issueNumber; // Derginin sayı numarası
    Date publicationDate;  // Yayın tarihi

// Cunstructor
public Magazine(String title, String issueNumber, Date publicationDate) {
    super(title); // LİbraryItem classının constructırını çağırdım
    this.issueNumber = issueNumber;
    this.publicationDate = publicationDate;
}

// Methods
public String getIssueNumber() {
    return issueNumber;
}

public Date getPublicationDate() {
    return publicationDate;
}

@Override
public String toString() {
    return super.toString() + " Publication Date: " + publicationDate + " Issue Number: " + issueNumber;
}


}
