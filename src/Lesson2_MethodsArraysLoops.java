import javax.swing.*;
import java.util.ArrayList;

public class Lesson2_MethodsArraysLoops {
    public static void main(String[] args) {
/*
            цикл while
*/
        int a = 0;
        while ( a < 10){
            System.out.println(a);
            a++;
        }
        System.out.println();
/*
            цикл do while
 */
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);
 /*
            вычисление факториала
*/
        String result = JOptionPane.showInputDialog("Факториал какого числа вы хотите вычислить???");
        System.out.println("Факториал числа " + result + " равен " + calcFactorial(result));
 /*
            брат пузырьковую сортировку я уже делал
*/

/*
            вернуть непарную цифру
*/
        int[] array = {1, 2, 3, 1, 3, 2, 3, 4};
        for (Object arr : getUnparedNumber(array)){
           System.out.println("Непарное число равно " + arr);
        }
    }

    private static ArrayList getUnparedNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    array[i] = 0;
                    array[j] = 0;
                }
            }
        }

        ArrayList unpared = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                unpared.add(array[i]);
            }
        }

        return unpared;
    }

    private static int calcFactorial(String result) {
        int number = Integer.parseInt(result);
        int i = 1;
        int factorial = 1;
        while (i <= number){
            factorial *= i;
            i++;
        }
        return factorial;
    }


}

