 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.first.project;
import  java.util.Scanner;

/**
 *
 * @author mohammed
 */
public class FirstProject {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("moahmed");
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the lenght of the rec");
//        int lenght = input.nextInt();
//        System.out.println("enter the wedth of the rec ");
//        int width = input.nextInt();
//         int area = lenght * width ;
//         System.out.printf("the area of the rec %d", area );
//         
//         System.out.println("enter your name!!!");
//         String name = input.next();
//         System.out.printf("your name is %s", name);
           Scanner input = new Scanner(System.in);
           
          String name ="";
          float salary ;
          int age ;
          
          System.out.println("enter your name ");
          name = input.next();
          System.out.println("enter your age ");
          age = input.nextInt();
          System.out.println("enter your salary");
          salary = input.nextFloat();
          System.out.println("your name is " + name);
          System.out.println("your salary is "+ salary);
          System.out.println("your age is "+ age);
        
    }
}
