package com.tw;

import java.util.Scanner;

public class CheckArrayType {

    static int checkType(int size, int[] array){
        boolean isOdd=false,isEven=false;

        for(int i=0;i<size;i++){

            if(array[i]%2==0){
                isEven=true;
            }
            else{
                isOdd=true;
            }

        }

        if(isEven && isOdd){
            return 3;
        }

        if(isEven){
            return 1;
        }
        else {
            return 2;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]= scan.nextInt();
        }

        int arrayType=checkType(size,arr);

        if(arrayType==1){
            System.out.println("Even");
        }
        else if(arrayType==2){
            System.out.println("Odd");
        }
        else {
            System.out.println("Mixed");
        }
    }
}
