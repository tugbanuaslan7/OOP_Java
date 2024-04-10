// Tuğba Nur Aslan
// 210101030

public class LibraryItem{

    // Fields
    String title;
    int itemID;  // A unique identifier for the library item
    boolean isAvailable;
    static int lastItemID = -1; // Oluşturulan son item ID'sini kontrol edrcek


// Constructor
public LibraryItem(String title) {  // class ile aynı isimde constructor oluşturdum
        this.title = title;
        this.isAvailable = true; // default olarak true alıyorum
        lastItemID++;
        this.itemID = lastItemID + 1;
    }

// Methods
public String getTitle(){
    return title;
}

public int getItemID(){
    return itemID;
}

public boolean isAvailable(){
    return isAvailable;
}

public void borrowItem() {
    if (isAvailable) /* item'ın kullanılabilirlik durumunu kontrol ediyorum */{
        isAvailable = false;
    }
    }

public boolean returnItem() {
    return isAvailable;
}

@Override
public String toString() {
    return itemID + " " + title + (isAvailable ? " available" : " not available");
}  

public static void main(String[] args) {
    LibraryItem libraryItem = new LibraryItem("Titanic");
    System.out.println(libraryItem.toString());  // 1 Titanic available
}


}



