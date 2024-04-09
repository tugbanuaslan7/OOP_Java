// Tuğba Nur Aslan, 210101030

public class HW2 {



  //replaceLetters: This method creates a new string by shifting each letter in the input string forward by n positions in the alphabet. Non-letter characters remain unchanged.
  public static String replaceLetters(String word, int n){

    StringBuilder newWord = new StringBuilder();

    for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // I am checking whether the character 'currentChar' is a letter or not.
            if (Character.isLetter(currentChar)) {
                if(currentChar == 'z')
                    newWord.append('a');
                
                else if (currentChar == 'Z')
                    newWord.append('A');

                else 
                    newWord.append((char)(currentChar + n));
            } 
                
            else 
            // If it is not a letter, add it directly to newWord.
            newWord.append(currentChar);
            
    }

        return newWord.toString();
    }




  //stripFromBotthEnd: This method trims leading and trailing whitespaces from the input string.
  public static String stripFromBothEnd(String input){

    StringBuilder result = new StringBuilder();
    
    // Baştaki boşlukları atlamak için 'start' değişkeni tanımladım 
    int start = 0;
    // Sondaki boşlukalrı atlamak için 'end' değişkeni                
    int end = input.length() - 1;

    // Başındaki boşlukları atla
    // start değişkeni kelimenin uzunluğunu geçmedği sürece ve kelimenin start indeksindeki karakter boşluk oldğu sürece arttırılır
    while (start <= end && Character.isWhitespace(input.charAt(start))) 
        start++;

    // Sonundaki boşlukları atla
    while (end >= start && Character.isWhitespace(input.charAt(end))) 
        end--;

    for (int i = start; i <= end; i++) {
        result.append(input.charAt(i));
    }

    // Başındaki ve sonundaki boşlukları temizlenmiş metni döndür
    return result.toString();
  }





  //removeRepeatingChars: This method creates a new string by removing repeating characters from the input string.
  public static String removeRepeatingChars(String input){

    StringBuilder newString = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
        char currentChar = input.charAt(i);

        // Eğer ilk karakterse veya bir önceki karakterden farklıysa newString'e ekle
        if (i == 0 || currentChar != input.charAt(i - 1)) {
            newString.append(currentChar);
        }
    }

    // StringBuilder'ı String'e dönüştürerek sonucu döndür
    return newString.toString();

  }




  //compressText: This method creates a new string by compressing repeated character sequences in the input string.
  public static String compressText(String input){
    
    StringBuilder newText = new StringBuilder();
    char prevChar = input.charAt(0);
    int count = 1;

    for (int i = 1; i < input.length(); i++) {
        char currentChar = input.charAt(i);

        if (currentChar == prevChar) {
            count++;
        } else {
            // Tekrarlanan bir karakter bulunduğunda newText'e ekle
            newText.append(prevChar);
            if (count > 1) {
                newText.append(count);
            }
            // Değişkenleri sıfırla
            count = 1;
            prevChar = currentChar;
        }
    }

    // Son karakterleri ekle
    newText.append(prevChar);
    if (count > 1) {
        newText.append(count);
    }

    return newText.toString();
  }


  public static String rotateRight(String str, int n) {
        StringBuilder rotated = new StringBuilder();

        int length = str.length();

        // Eğer n negatifse veya str boşsa, aynı stringi geri döndür
        if (n < 0 || length == 0) {
            return str;
        }

        // Stringin sonundaki n karakteri başına ekle
        for (int i = length - n; i < length; i++) {
            rotated.append(str.charAt(i));
        }

        // Kalan karakterleri de ekleyerek sonucu oluştur
        for (int i = 0; i < length - n; i++) {
           rotated.append(str.charAt(i));
        }

        return rotated.toString();
    }

    public static String rotateLeft(String str, int n) {
        StringBuilder newWord = new StringBuilder();

        int length = str.length();

        // Eğer n negatifse veya str boşsa, aynı stringi geri döndür
        if (n < 0 || length == 0) {
            return str;
        }
        
        for (int i = n; i < length; i++) {
            newWord.append(str.charAt(i));
        }

        for (int i = 0; i < n; i++) {
           newWord.append(str.charAt(i));
        }

        return newWord.toString();
    }


public static String reverseString(String str) {
     StringBuilder reversed = new StringBuilder();

    int length = str.length();

    for (int i = length - 1; i >= 0; i--) {
        reversed.append(str.charAt(i));
    }

    return reversed.toString();
}

public static int countSpace(String str){

    int count = 0;

    int length = str.length();

    for(int i = 0; i < length; i++){
        if(str.charAt(i) == ' ')
          count++;
    }

    return count;
}

public static String removeSpace(String str){
   StringBuilder removed = new StringBuilder();

   int length = str.length();

   for(int i = 0; i < length; i++){
       if(str.charAt(i) != ' '){
        removed.append(str.charAt(i));
       }
   }

   return removed.toString();

}

public static String everyNthChar(String s, int n){
    StringBuilder result = new StringBuilder();

    int length = s.length();
    result.append(s.charAt(0));
    result.append(' ');

    for(int i = n; i < length; i = i + n){
        

        result.append(s.charAt(i));
        result.append(' ');


    }

    return result.toString();
}



   

   public static void main(String[] args) {
        // Metotları test etmek için oluşturuyrum
        System.out.println(replaceLetters("hello!", 3));                       // khoor!
        System.out.println(stripFromBothEnd(" Good  day! "));                  // Good  day!
        System.out.println(removeRepeatingChars("Java is cool."));             // Java is col.  (yanlış çıktı alıyorum)
        System.out.println(compressText("yummyyy in myyy tummyyyy..."));       // yum2y3 in my3 tum2y4.3
        System.out.println(rotateRight("yalova", 2));                          // vayalo
        System.out.println(rotateLeft("yalova", 2));                           // lovaya
        System.out.println(reverseString("piscine"));                          // enicsip
        System.out.println(countSpace(" Kaç tane  boşluk var?"));              // 5
        System.out.println(removeSpace("I am testing removeSpace method."));   // IamtestingremoveSpacemethod.
        System.out.println(everyNthChar("abcdefghijklmn", 2));                 // a c e g i k m
   }




}