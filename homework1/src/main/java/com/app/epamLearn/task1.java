package com.app.epamLearn;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("___________Task 1 : \n\t- Как тебя называть ...\n\t");
        String str = in.nextLine();

        System.out.print("\t- Привет ");
        System.out.print(str);
        in.close();
    }
}
