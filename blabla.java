import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int niger=scanner.nextInt();
        int tot=60*niger-10*(niger/2)-15;
        int hentai=9+tot/60;
        int m=tot%60;
        System.out.println(hentai+" "+m);
    }
}
