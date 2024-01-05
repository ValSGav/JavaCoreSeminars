package seminar2.home_work;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        int[] arr4 = {2, 1, 0, 0, 4};

        /*Написать метод, возвращающий количество чётных элементов массива.
        countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0*/
        System.out.printf("В массиве %s %d четных элементов"
                , Arrays.toString(arr1)
                , getCountEvensElementsOfArray(arr1));
        System.out.println();

        System.out.printf("В массиве %s %d четных элементов"
                , Arrays.toString(arr2)
                , getCountEvensElementsOfArray(arr2));
        System.out.println();

        System.out.printf("В массиве %s %d четных элементов"
                , Arrays.toString(arr3)
                , getCountEvensElementsOfArray(arr3));
        System.out.println();

        /*Написать функцию, возвращающую разницу между самым большим и самым маленьким
        элементами переданного не пустого массива.*/
        try{
        System.out.printf("В массиве %s разница между максимальным и минимкальным значением: %d "
                , Arrays.toString(arr1)
                , getDiffBtwMaxMinElementsOfArray(arr1));
        System.out.println();

        System.out.printf("В массиве %s разница между максимальным и минимкальным значением: %d "
                , Arrays.toString(arr2)
                , getDiffBtwMaxMinElementsOfArray(arr2));
        System.out.println();

        System.out.printf("В массиве %s разница между максимальным и минимкальным значением: %d "
                , Arrays.toString(arr3)
                , getDiffBtwMaxMinElementsOfArray(arr3));
        System.out.println();}
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*Написать функцию, возвращающую истину, если в переданном массиве есть два
        соседних элемента, с нулевым значением.*/
        System.out.printf("В массиве %s %s два соседних нулевых элемента"
                , Arrays.toString(arr4)
                , checkContentsOfTwoAdjacentZeroValueInArray(arr4)?"обнаружены":"не обнаружены");
        System.out.println();
        System.out.printf("В массиве %s %s два соседних нулевых элемента"
                , Arrays.toString(arr3)
                , checkContentsOfTwoAdjacentZeroValueInArray(arr3)?"обнаружены":"не обнаружены");
        System.out.println();

    }

    private static int getCountEvensElementsOfArray(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                count += 1;
        }
        return count;
    }

    private static int getDiffBtwMaxMinElementsOfArray(int[] arr) throws Exception {
        if (arr.length == 0) throw new Exception("В массиве должен быть хотя бы один элемент!");
        int max = arr[0];
        int min = max;
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return max - min;
    }

    private static boolean checkContentsOfTwoAdjacentZeroValueInArray(int[] arr) {
        if (arr.length > 1)
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == 0 && arr[i - 1] == arr[i])
                    return true;
            }
        return false;
    }


}
