import com.sun.source.util.SourcePositions;

import java.math.MathContext;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Solutions {

    // y = 5; x = 10;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение - y");
        int y = sc.nextInt();
        System.out.println("Введите значение - x");
        double x = sc.nextInt();
        double solution1 = (3 * x + 16 * y) / 12;
        System.out.println(solution1);

        double solution2 = (4 *(x*x) - 16) / ((2 * x) / 14);

        System.out.println(solution2);




    }
}