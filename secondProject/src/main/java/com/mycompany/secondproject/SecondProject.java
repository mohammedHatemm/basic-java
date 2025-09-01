/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondproject;
import java.util.Scanner;


/**
 *
 * @author mohammed
 */
public class SecondProject {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//int age;
//Scanner input = new Scanner(System.in);
//System.out.println("enter your age ");
//age = input.nextInt();
//if(age>=30){
//    System.out.println("your age is upper than 28 \n" + age );
//}
char grade;
    Scanner reader = new Scanner(System.in);
    System.out.println("please , enter your grade with upper case ");
    grade = reader.next().charAt(0);
    grade = Character.toUpperCase(grade);
    
    
    
    switch(grade)
    {
        case'A':
            System.out.println("Excellent");
            break;
        case'B':    
            System.out.println("Very good");
            break;
        case'C':
            System.out.println("good");
            break;
        case'D':
            System.out.println("fair");
            break;
        case'F':
            System.out.println("failed");
            break;
        default:
            System.out.println("invaliad grade ");
            
    }

    }
}
