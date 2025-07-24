import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Length of the message
        sc.nextLine(); // Consume the newline character
        String s = sc.nextLine(); // The scrambled message
        System.out.println(decipherMessage(s));
    }

    public static String decipherMessage(String s) {
      
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
         
            Set<Character> uniqueChars = new TreeSet<>(); 
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }

           
            for (char c : uniqueChars) {
                result.append(c);
            }

           
            result.append(" ");
        }

        return result.toString().trim();
    }
}
