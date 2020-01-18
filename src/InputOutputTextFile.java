
import java.util.Scanner;

public class InputOutputTextFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение n: ");
        int n = sc.nextInt();//считываем значение с клавиатуры

        if ( n < 0) { System.out.println("Введите натуральное значение!"); }//если значение меньше 0, число не натуральное
        else {
            System.out.println("Разложение числа " + n + " на простые множители:");
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j <= i; j++) {
                    if (n % j == 0) { // получаем остаток от деления n на j, если он = 0, он - простой делитель
                        System.out.println(j);
                        n = n / j;

                    }


                }
            }
        }
    }
}