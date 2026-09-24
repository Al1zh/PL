import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double hypotenuse = Math.sqrt(a * a + b * b);
        System.out.println(hypotenuse);
    }
}
