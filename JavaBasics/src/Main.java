import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        long number = input.nextLong();
        int digit = 5;
        System.out.println("occurrence of the given no is :"+checkNumberOccurrence(number, digit));
    }

    private static int checkNumberOccurrence(long number, int digit) {
        int count = 0;
        while (number > 0) {
            int reminder = (int) (number % 10);
            if (reminder == digit){
                count++;
            }
            number = number / 10;
        }
        return count;
    }

}