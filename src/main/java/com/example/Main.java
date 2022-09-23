package com.example;

import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World 2");
      }
    };
    greeting2.sayHello();

    Greeting greeting3 = () -> System.out.println("Hello World 3");
    greeting3.sayHello();

//implementing calculate method using a LAMBDA
    Calculator calculator = (int x, int y) -> {
      Random random = new Random();
      int randomNo = random.nextInt(50);
      return x*y+randomNo;
    };

// calling the calculate method;
    System.out.println(calculator.calculate(2, 3));

  }

}
