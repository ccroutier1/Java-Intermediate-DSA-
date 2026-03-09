

import java.util.Scanner;
//Bendaña, Rover James S.

public class NeighborSwap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many number you want to input? ");

            int arraySize = input.nextInt();

            int arrayNum[] = new int[arraySize];

        for(int i = 0; i < arrayNum.length ; i++)
        {
            System.out.print("Enter a number: ");
                      arrayNum[i] = input.nextInt();
        }
        for(int i = 0; i < arrayNum.length - 1; i+=2)
        {
            int num = arrayNum[i + 1];
                      arrayNum[i + 1] =arrayNum[i];
                      arrayNum[i] = num;
        }
        for(int i : arrayNum)
        {
            System.out.print(i + "");
        }
    }
}
