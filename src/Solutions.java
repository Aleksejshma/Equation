

import java.lang.Math;

import java.util.Scanner;

public class Solutions {

    // y = 5; x = 10;


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите значение - y");
//        int y = sc.nextInt();
//        System.out.println("Введите значение - x");
//        double x = sc.nextInt();
//        double solution1 = (3 * x + 16 * y) / 12;
//        System.out.println(solution1);
//
//        double solution2 = (4 *(x*x) - 16) / ((2 * x) / 14);
//
//        System.out.println(solution2);


// Дано квадратное уравнение 4х^2 - 16 + 10 = 0;
//        double a, b, c;
//        double x1, x2;
//        a = 4;
//        b = -16;
//        c = 10;
//
//        double discr = b * b - 4 * a * c;
//        if (discr == 0) {
//            x1 = -(b / (2 * a));
//            x2 = x1;
//            System.out.println(x1);
//            System.out.println(x2);
//        } else if (discr > 0) {
//            x1 = (-b + Math.sqrt(discr)) / (2 * a);
//            x2 = (-b - Math.sqrt(discr)) / (2 * a);
//            System.out.println(x1);
//            System.out.println(x2);
//        }
//
//        else if (discr < 0) {
//            System.out.println("Нет решения");
//        }

//        Дано квадратное уравнение -5х^2 -12x + 3 = 0;
//        double a, b, c;
//        double x1, x2;
//        a = -5;
//        b = -12;
//        c = 3;
//
//        double discr = b * b - 4 * a * c;
//        if (discr == 0) {
//            x1 = -(b / (2 * a));
//            x2 = x1;
//            System.out.println(x1);
//            System.out.println(x2);
//        } else if (discr > 0) {
//            x1 = (-b + Math.sqrt(discr)) / (2 * a);
//            x2 = (-b - Math.sqrt(discr)) / (2 * a);
//            System.out.println(x1);
//            System.out.println(x2);
//        }
//
//        else if (discr < 0) {
//            System.out.println("Нет решения");
//        }

        // Дано sin(X) + cos(Y); Взято sin 30 и cos 60;30
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите значение в градусах - x");
//        int x = sc.nextInt();
//        System.out.println("Введите значение в градусах - y");
//        double y = sc.nextInt();
//        double sum = Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y));
//        System.out.println(sum);


       // Дано (7x^2 - 12x) / (sin(x^3) / (cos y);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение в градусах - x");
        double x = sc.nextInt();
        System.out.println("Введите значение в градусах - y");
        double y = sc.nextInt();
        double solution = (7 * Math.pow(x, 2) - 12 * x) / (Math.sin(Math.toRadians(Math.pow(x, 3)))) / (Math.cos(Math.toRadians(y)));
        System.out.println(solution);
    }
}