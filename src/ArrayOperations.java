import java.util.Scanner;


public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr = new int[15]; //заводим массив из 15 элементов

        Scanner in = new Scanner(System.in); //для того, чтобы мы могли считывать с клавиатуры
        for (int i = 0; i < 15; i++) { //для i от 0 до 15
            System.out.print("arr[" + i + "]= ");
            arr[i] = in.nextInt(); //заполняем массив полученными числами
        }
        in.close();
        int countNull = 0; //количество 0 в массиве
        int countPositive = 1; // количество положительных чисел в массиве
        int countNegative = 0; // количество отрицательных чисел в массиве

        for (int i = 0; i < 15; i++) { //проверяем все числа в массиве по порядку
            if (arr[i] < 0) { // если значение массива меньше 0
                countNegative++; // увеличиваем на 1 число 0
            } else {
                if (arr[i] > 0) { //если больше 0
                    countPositive = countPositive * arr[i]; //находим произведение
                } else {
                    if (arr[i] == 0){ //если = 0
                        countNull++; //увелисиваем число нулевых элементов на 1
                    }

                }
            }

        }

        System.out.println(countNegative);
        System.out.println(countPositive);
        System.out.println(countNull);
    }
}
