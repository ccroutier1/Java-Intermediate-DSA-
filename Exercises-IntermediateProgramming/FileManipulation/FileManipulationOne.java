
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulationOne {
    static void main(String[] args) {
               Scanner input = new Scanner(System.in);
               try{
                   FileWriter writer = new FileWriter("students.exe", true);

                   System.out.print("Enter student name: ");
                   String studentName = input.nextLine();
                   System.out.print("Enter grade: ");
                   int studentGrade = input.nextInt();

                   writer.write(studentName + " - " + studentGrade + "\n");
                   writer.close();
               }   catch(IOException e) {
                   System.out.println("Error saving data.");
               }
               input.close();
    }
}
