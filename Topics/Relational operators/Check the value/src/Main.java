import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 10) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}