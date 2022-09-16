import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String day = scanner.next();
        if(day.equals("true")){
            boolean weekday = (i>=15)&&(i<=25);
            System.out.println(weekday);
        }
        else{
            boolean workDay = (i>=10)&&(i<=20);
            System.out.println(workDay);
        }

    }
}