package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 45;
        int y = 52;
        int max;
        int counter = 0;

        if ( x >= y){
            max = x;
        }else{
            max = y;
        }

        for (int i = 2; i <= max; i++){
            if (x % i == 0 && y % i == 0){
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Yes!");
        }else{
            System.out.println("No!");
        }



	// write your code here
    }
}
