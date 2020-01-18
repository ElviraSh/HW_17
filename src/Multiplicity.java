import java.util.Scanner;

public class Multiplicity {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in); //для того, чтобы мы могли считывать с клавиатуры

        System.out.print("Введите значение n");
        int n = in.nextInt(); //вводим значение n



        int del1 = n/1000; // получаем первую цифру
        int del2 = n/100%10; // получаем вторую цифру
        int del3 = n/10%10; // получаем третью цифру
        int del4 = n%10; // получаем четвертую цифру

        if ((del1 == 0) | ((del1 ==0) & (del2 ==0)) | ((del1 == 0) & (del2 == 0) & (del3 ==0))){ //если перая и вторая цифра = 0, то ч
            System.out.println("Введите четырехзначное число");

        }
        else {



            int multiplication = del1 * del2 * del3 * del4; // произведение всех цифр числа

            if (multiplication % 3 == 0) { // если при делении произведения на 3 нет остатка
                System.out.println("Произведение цифр числа " + n + " кратно 3");
            } else { //иначе
                System.out.println("Произведение цифр числа " + n + " не кратно 3");
            }

            System.out.print("Введите значение a");
            int a = in.nextInt(); //вводим значение a

            in.close();

            if (multiplication % a == 0) { // если при делении произведения на а нет остатка
                System.out.println("Произведение цифр числа " + n + " кратно " + a);
            } else {
                System.out.println("Произведение цифр числа " + n + "  не кратно " + a);
            }
        }
    }
}
