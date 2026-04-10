import java.util.Scanner;

//TASK 7 - STRING MANIPULATION - INTERMEDIATE PROGRAMMING
public class StringeExerciseTwo{
    static void main(String[]args) {
        System.out.println(spaceRemover());
        System.out.println(passwordHider());
        System.out.println(diamondStringPattern());
        System.out.print(snakeCase());
        System.out.println(isPalindrome());
    }
    static String spaceRemover() {
        System.out.println("======Space Remover======");
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Remove Space: ");
        str = input.nextLine();
        return str.replace(" ", "");
    }
    static String passwordHider() {
        System.out.println("======Password Hider======");
        Scanner input = new Scanner(System.in);
        System.out.println("Input Password: ");
        String passText = input.nextLine();
        int openParentheses = passText.indexOf('(');
        int closeParentheses = passText.indexOf(')');
        String code = passText.substring(0, openParentheses) + " ";
        String pin = " " + passText.substring(closeParentheses + 1);
        String hidden = "("+"*".repeat(closeParentheses-openParentheses - 1) + ")";
        return code+hidden+pin;
    }

    static String diamondStringPattern() {
        System.out.println("======Diamond String Pattern======");
        Scanner input = new Scanner(System.in);
        System.out.print("Input Text: ");
        String text = input.nextLine();
        String result = "";
        for (int i = 0; i < text.length() ; i++) {
            for (int j = 0; j < i ; j++) {
                     result += text.charAt(j);
            }
            result = result + "\n";
        }
        for (int i = text.length(); i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                result += text.charAt(j);
            }
            result = result + "\n";
        }
        return result;
    }
    static String snakeCase() {
            System.out.println("======Snake Case======");
            Scanner input = new Scanner(System.in);

            // for input
            System.out.print("Enter text with underscore" + "(_): ");
            String underScoreText = input.nextLine();

            // Split the input into words using underscore
            String[] wordArray = underScoreText.split("_");
            String result = "";

            for (int i = 0; i < wordArray.length; i++) {
                String Word = wordArray[i];

                if (Word.length() % 2 == 0) {
                    // Capitalize first letter if word length is even
                    char wordUpperCase = Character.toUpperCase(Word.charAt(0));
                    String remainingWord = Word.substring(1); // get the rest of the word
                    System.out.print(wordUpperCase + remainingWord);
                } else {
                    // Make whole word lowercase if word length is odd
                    System.out.print(Word.toLowerCase());
                }
                System.out.print(" ");
            }
            return result;
        }
   static String isPalindrome() {
       System.out.println();
       System.out.println("======Palindrome Checker======");
       Scanner input = new Scanner(System.in);
       System.out.println("Input text if Its a Palindrome or Not a Palindrome: ");
       String palindromeText = input.nextLine();


       String compressText = "";
       try{
           for (int i = 0; i < palindromeText.length(); i++) {
               if (i == 0 || palindromeText.charAt(i) != palindromeText.charAt(i-1)) {
                   compressText = compressText + palindromeText.charAt(i);
               }
           }
       } catch (Exception e){

       }
      
       //checking if it's a palindrome
       for (int i = 0; i < compressText.length() / 2; i++) {
            int opposite = compressText.length()-i-1;
           if (compressText.charAt(i) == compressText.charAt(opposite)) {
               return "The word " + compressText + " it's palindrome";
           }
       }
       return "The word " + compressText + " it's not palindrome";
   }
 }
