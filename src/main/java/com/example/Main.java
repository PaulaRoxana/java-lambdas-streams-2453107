package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();

    Greeting greeting3 = () -> System.out.println("Hello World");
    greeting3.sayHello();

    //implementing the method from the Calculator interface using LAMBDAS
    //no need to create a new class to implement the Calculator interface
    Calculator calculator = (x, y) -> {
      Random random = new Random();
      int randomNumber = random.nextInt(50);
      return x * y + randomNumber;
    };
//calling the above method
    System.out.println(calculator.calculate(1, 2));

    IntBinaryOperator calculator2 = (x, y) -> {
      Random random = new Random();
      int randomNumber = random.nextInt(50);
      return x * y + randomNumber;
    };
//calling the above method
    System.out.println(calculator2.applyAsInt(1, 2));

  }

}
