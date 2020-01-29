package com.javaguru.lessons.lesson2;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(1000);
        System.out.println("UnboundRandom = " + unboundRandom);
        System.out.println("BoundGenerator = " + boundRandom);
        int a = unboundRandom + boundRandom;
        int b = unboundRandom - boundRandom;
        int c = unboundRandom * boundRandom;
        int d = unboundRandom / boundRandom;
        System.out.println("Plus = " + a);
        System.out.println("Minus = " + b);
        System.out.println("Umnozenie = " + c);
        System.out.println("Delenie = " + d);

        //метод math
        double mathRandom = Math.random() * 101;    //если я правильно понял то рандомные будут от 0 до 100?
        System.out.println((int)mathRandom);
        int resultOfThreeNumbers = boundRandom + (int)mathRandom + unboundRandom;
        System.out.println("UnboundRandom + MathRandom = " + resultOfThreeNumbers);

        //попробовать для себя
        Random randomPass = new Random();
        String passGen = "1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*()_+";
        System.out.print("your new pass: ");
            for (int i = 0; i < 12; i++ ){
                System.out.print(passGen.charAt(randomPass.nextInt(passGen.length())));
            }
    }
}
