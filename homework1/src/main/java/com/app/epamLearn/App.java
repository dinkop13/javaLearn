package com.app.epamLearn;

import sun.security.x509.OtherName;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "----------- Optional Task 1 : " );
        Scanner in = new Scanner(System.in);
        System.out.print("\t Выбор задания :\n 1.\n 2.\n 3.\n 4.\n >> ");
        int nmb = in.nextInt();

        switch (nmb) {
            case  (1):
                task1.main(args);
                break;
            case (2):
                task2.main(args);
                break;
/*            case (3):
                КодN;
                break;
            case (4):
                КодN;
                break;*/
            default:
                System.out.println("Выбрано не правильное значение");
                main(args);
                break;
        }


        in.close();
    }
}
