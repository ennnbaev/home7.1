package com.company;

public class Homework {
    static int iterator =0;
    public static void main(String[] args) {
       int []mass=new int[]{1,2,3,4};
        System.out.println(recur(mass));
    }
    public  static int recur(int []data){
        if(iterator == data.length-1){
            return data[iterator];
        }
        else{
            System.out.print(data[iterator]+" ");
            iterator++;
            return recur(data);
        }
    }
}