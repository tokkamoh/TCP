package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("""
                    enter :-
                    1-Area for circle
                    2-Area for square\s
                    3-Area for rectangle
                    4-Exit""");
            int shape=sc.nextInt();
            if(shape==1){
                System.out.println("enter the radius of Circle");
                double radius=sc.nextDouble();
                double pi=3.14;
                System.out.println("area of circle = "+pi*(radius*radius));
            }
            else if (shape==2){
                System.out.println("enter the Square side length");
                double a=sc.nextDouble();
                System.out.println("area of square = "+a*a);
            }
            else if (shape==3){
                System.out.println("enter the length and the width of Rectangle");
                double length=sc.nextDouble();
                double width=sc.nextDouble();
                System.out.println("area of rectangle = "+length*width);

            }
            else{
                break;
            }

        }

    }
}

