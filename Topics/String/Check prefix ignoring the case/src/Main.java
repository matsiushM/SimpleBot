import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next().toLowerCase(Locale.ROOT);
        System.out.println(txt.startsWith("j"));
    }
}