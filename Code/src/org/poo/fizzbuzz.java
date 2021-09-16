package org.poo;

public class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 31 ; i++) {
            if(i%15==0) {
                System.out.println("FizzBuzz");
            } else {System.out.println(i);}
        }
    }
}
