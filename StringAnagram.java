import java.util.Scanner;

public class StringAnagram {
    public static boolean areAnagrams(String str1, String str2 ){

    str1 = str1.trim().toLowerCase();
    str2 = str2.trim().toLowerCase();

    if (str1.length() != str2.length()) {
        return false;
    }

    //Create an array to count occurences of each character
    int[] charCount = new int[256]; //Assuming ASCII characters

    //count characters in the first string
    for(int i = 0; i< str1.length(); i++) {
        charCount[str1.charAt(i)]++;
    }
    //Decrease the count for characters in the second string
    for(int i = 0; i< str2.length(); i++) {
        charCount[str2.charAt(i)]--;
    }

    //Check if all counts are zero
    for (int count : charCount) {
        if(count != 0){
            return false;
        }
    }
    return true; //They are Anagrams
}

public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first string:");
    String str1 = scanner.nextLine();

    System.out.print("Enter second string:");
    String str2 = scanner.nextLine();

     if (areAnagrams(str1, str2)) {
            System.out.println("The strings are Anagrams");
        }
        else {
            System.out.println("The strings are Not Anagrams");
        }
        scanner.close();
    }
}
