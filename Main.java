import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("The next number for the number " + n + " is " + (n + 1) + ".");
        System.out.println("The previous number for the number " + n + " is " + (n - 1) + ".");