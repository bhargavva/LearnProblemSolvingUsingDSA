import java.util.Scanner;

public class MaxOfThreeNumbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scan.nextInt();
        System.out.print("Enter Third Number: ");
        int c = scan.nextInt();

        if(a >= b && a >= c){
            System.out.println("Max num is " + a);
        } else if (b >= a && b >= c){
            System.out.println("Max num is " + b);
        } else {
            System.out.println("Max num is " + c);
        }
    }
}
