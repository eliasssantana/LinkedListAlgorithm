package br.com.eliasssantana;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void addNodes(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");

        Assertions.assertEquals("[s1 -> s2 -> s3 -> s4]", linkedList.toString());
    }

}
