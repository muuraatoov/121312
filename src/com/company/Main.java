package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = 10;
        int []a={1,25,6,32,43,5,96,23,4,55};
        int min = 0; // ен киши ман ушн
        int buf = 0; // ауыстыру ушн

        /* сортировка басы */
        for (int i = 0; i < N; i++)
        {
            min = i; // номерн сактап алады,ен кишисин
            // цикл ишинен накты киши манин тауып аламыз
            for (int j = i + 1; j < N; j++)
                min = ( a[j] < a[min] ) ? j : min;
            // орындарын ауыстыру аркылы коямыз
            if (i != min)
            {
                buf = a[i];
                a[i] = a[min];
                a[min] = buf;
            }
        }
        /** СОНЫ **/

        for (int i = 0; i < N; i++) //массивтын озгеруин шыгару
            System.out.println(a[i]);

    }
}

