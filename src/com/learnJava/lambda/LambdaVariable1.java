package com.learnJava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaVariable1 {


    public static void main(String[] args) {

        int i=0; //Repeated varibale name not allowed Consumer<Integer> c1 = (i) -> {
        
        Consumer<Integer> c1 = (a) -> {
            // int i=0;	  not allowed
            System.out.println(i);
        };
        
        c1.accept(5);
    }
}
