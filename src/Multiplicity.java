import java.util.Scanner;

public class Multiplicity {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in); //для того, чтобы мы могли считывать с клавиатуры

        System.out.print("Введите значение n");
        int n = in.nextInt(); //вводим значение n

        System.out.print("Введите значение a");
        int a = in.nextInt(); //вводим значение a

        in.close();

        int div1 = n/1000; // получаем первую цифру
        int div2 = n/100%10; // получаем вторую цифру
        int div3 = n/10%10; // получаем третью цифру
        int div4 = n%10; // получаем четвертую цифру

        int multiplication = div1 * div2 * div3 * div4; // произведение всех цифр числа

        if (multiplication % 3 == 0) { // если при делении произведения на 3 нет остатка
            System.out.println("Произведение цифр числа " + n + " кратно 3");
        } else { //иначе
            System.out.println("Произведение цифр числа " + n + " не кратно 3");
        }

        if (multiplication % a == 0) { // если при делении произведения на а нет остатка
            System.out.println("Произведение цифр числа " + n + " кратно " + a);
        } else{
            System.out.println("Произведение цифр числа " + n + "  не кратно " + a);
        }
    }
}
