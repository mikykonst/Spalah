package HomeWork2_Calc_Arrays;

import java.util.Arrays;

/**
 * Created by user on 14.12.2016.
 */
public class ArraySorts
{
    public static void show(int[] array) {
        for (int item: array) {
            System.out.print(item + " ");
        }
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        for (int item: array) {
            System.out.print(item + " ");
        }
    }

    public static void minElementOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print(min);
    }

    public static void maxElementOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.print(max);
    }

    public static void center(int[] array) {
        float res = 0f;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        float result = res/array.length;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 20, 8, 3, 12, 10};
        System.out.print("Массив: ");
        show(array);
        System.out.println();
        System.out.print("Отраженный массив: ");
        reverse(array);
        System.out.println();
        System.out.print("Минимальный элемент: ");
        minElementOfArray(array);
        System.out.println();
        System.out.print("Максимальный элемент: ");
        maxElementOfArray(array);
        System.out.println();
        System.out.print("Средний элемент: ");
        center(array);
    }
}
