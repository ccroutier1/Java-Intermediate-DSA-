import java.util.Scanner;

public class StringExercise_AccountParcer {

    public static void main() {
     Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number(format: XXX-XX-XXXX): ");
        String accNum = input.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHoldName = input.nextLine();
        System.out.print("Enter Address: ");
        String accAddress = input.nextLine();
        System.out.println();

        if(!validateAccountNo(accNum)) {
            System.out.println("Invalid account number format.");
        } else {
          String zoneGet = getZone(accNum);
          String classificationGet = getClassification(accNum);
          String pipeGet = getPipeSize(accNum);

            System.out.println("-----Account Information-----");
            System.out.println("Name: " + accHoldName);
            System.out.println("Address: " + accAddress);
            System.out.println("Account Number: " + accNum);
            System.out.println();
            System.out.println("Zone: " + zoneGet);
            System.out.println("Classification: " + classificationGet);
            System.out.println("Pipe Size: " + pipeGet);
        }
    }
    static boolean validateAccountNo(String accountNo) {
        String[] validNum = accountNo.split("-");
        if(validNum.length != 3) {
            return false;
        }
        if(validNum[0].length() != 3) {
            return false;
        }
        if(validNum[1].length() != 2) {
            return false;
        }
        if(validNum[2].length() != 4) {
            return false;
        }
     return true;
    }
    static String getZone(String accountNo) {
        return accountNo.substring(0, 3);
    }
    static String getClassification(String accountNo){
        char option = accountNo.charAt(4);

        switch(option) {
            case '1' : return "Residential";
            case '2' : return "Commercial";
            case '3' : return "Industrial";
            case '4' : return "Government";
            default  : return "Error Option!";
        }
    }

    static String getPipeSize(String accountNo) {
         char option = accountNo.charAt(5);
        switch(option) {
            case '1' : return "1/2";
            case '2' : return "3/4";
            case '3' : return "1";
            case '4' : return "2";
            default  : return "Error Option!";
        }
    }
}
