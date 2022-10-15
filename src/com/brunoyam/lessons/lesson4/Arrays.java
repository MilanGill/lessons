package com.brunoyam.lessons.lesson4;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        // ОДНОМЕРНЫЕ МАССИВЫ
        int[] intArray = new int[5];   // объявляем и выделяем место в памяти
        System.out.println(intArray[0]);  // Новообъявленный массив по умолчанию заполнен нулями
        System.out.println(intArray.length + " <тут отступ>\n"); // Узнали длинну массива .length
        for (int i = 0 ; i < intArray.length ; i ++ ){
            intArray[i] = i * 10;
        }

        for (int i = 0 ; i < intArray.length; i ++) {
            System.out.println(i+1 + " элемент массива = " + i);
        }
//        int[] intArray2 = new int[] {1, 2, 3};   // Задаем элементы массива сразу в фигурных скобках
        int[] intArray2 = {1 , 2 , 3};
        System.out.println();
        for (int i : intArray2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(intArray2));

        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        System.out.println(java.util.Arrays.toString(seasons));
        // ЦИКЛ FOR-EACH
        for (String season : seasons) {
            System.out.println(season);
        }
        Random random = new Random();
        int[] randomArray = new int[5];
        for(int i = 0 ; i < randomArray.length; i ++){
            randomArray[i] = random.nextInt(100) ;
        }
        for(int j : randomArray){                      // Вытаскиваем каждый элемент массива и выводим его
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(randomArray));

        int[] minArray = new int[10];
        java.util.Arrays.sort(minArray);
        System.out.println(java.util.Arrays.toString(minArray));
        System.out.println("Минимум массива = " + minArray[0]);

        /*
          Одномерные массивы:
          1,2,3

          Двухмерные Массивы:
          [0]: 1, 2, 3
          [1]: 4, 5, 6

          Обращение к элементам массива: <название массива>[a][b], где:
          a - индекс строки
          b - индекс элемента строки

          Например, чтобы обратиться к элементу приведенного выше двухмерного массива со значением 6:
          <название массива>[1][3]
         */

//        int[][] twoDimensionalArray = new int[2][3];
//
//        twoDimensionalArray[0][0] = 1;
//        twoDimensionalArray[0][1] = 2;
//        twoDimensionalArray[0][2] = 3;
//
//        twoDimensionalArray[1][0] = 4;
//        twoDimensionalArray[1][1] = 5;
//        twoDimensionalArray[1][2] = 6;

//        for (int i = 0 ; i < twoDimensionalArray.length;i++){
//            for (int j = 0; j < twoDimensionalArray[i].length;j++){
//                System.out.print(twoDimensionalArray[i][j] + " ");
//            }
//            System.out.println();
//        }
        // В двумерном массиве перебираем одномерные массивы в первом цикле, во втором перебираем элементы одномерного массива.
//        for (int[] i : twoDimensionalArray) {
//            for (int j : i){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//       int[][][] threeDimensionalArray = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
//       System.out.println(java.util.Arrays.deepToString(threeDimensionalArray));
          int[][] twoDimensionalArray = {
                  {1,2,3},  // индекс 0
                  {4,5,6,4},  // индекс 1
                  {6,5}          // индекс 2
          };

        System.out.println("Размер подмассива под индексом 1 = " + twoDimensionalArray[1].length);
        System.out.println();
        System.out.println(java.util.Arrays.deepToString(twoDimensionalArray));
        Math.random();
    }
}
