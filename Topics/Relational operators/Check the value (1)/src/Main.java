import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        boolean flag = (i > 0)&&(i < 10);
        System.out.println(flag);
    }
}