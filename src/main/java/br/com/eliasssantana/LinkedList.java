package br.com.eliasssantana;

import java.util.StringJoiner;

public class LinkedList<T> {
    Node head;

    private class Node {
        final T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    @Override
    public String toString(){
        StringJoiner stringJoiner = new StringJoiner(" -> ","[", "]");
        Node currentNode = head;
        while (currentNode != null){
            stringJoiner.add(currentNode.data.toString());
            currentNode = currentNode.next;
        }
        return stringJoiner.toString();
    }
}