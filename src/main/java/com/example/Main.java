package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Stream<String> lettersStream = Stream.of("a", "b", "c");

    Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
    Stream<Integer> scoresStream = Arrays.stream(scores);

    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");

    List<String> mySortedList = shoppingList.stream()
            .sorted()
            .map(item -> item.toUpperCase())
            .filter(item -> item.startsWith("P"))
                    .collect(Collectors.toList());
    System.out.println(mySortedList);
    //!!!!!! STREAMS can only be used once;
//STREAMS are NOT DESIGNED for storing objects, BUT for performing operations on groups of objects/elements in a functional style

   //============================== shoppingListStream.forEach(item-> System.out.println(item));//=====================
    /*Exception in thread "main"
    java.lang.IllegalStateException: stream has already been operated upon or closed
	at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
	at com.example.Main.main(Main.java:30)*/

    System.out.println(shoppingList);

  }
}
