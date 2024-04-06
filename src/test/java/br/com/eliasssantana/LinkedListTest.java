package br.com.eliasssantana;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void addStringNodes(){

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");

        Assertions.assertEquals("[s1 -> s2 -> s3 -> s4]", linkedList.toString());
    }

    @Test
    public void addIntNodes(){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        Assertions.assertEquals("[1 -> 2 -> 3 -> 4]", linkedList.toString());
    }

}
