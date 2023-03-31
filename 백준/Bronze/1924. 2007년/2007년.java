import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(LocalDate.of(2007, x, y).getDayOfWeek().toString().substring(0,3));
        sc.close();
    }
}