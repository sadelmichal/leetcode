package com.michalsadel.addtwonumbers;

public class ListNode {
    private final int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode append(int value) {
        next = new ListNode(value);
        return next;
    }

    public int getListValue() {
        return Integer.valueOf(new StringBuilder(toString()).reverse().toString().replace(",", ""));
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(value);
        ListNode nextNode = next;
        while (nextNode != null) {
            result.append(",").append(nextNode.value);
            nextNode = nextNode.next;
        }
        return result.toString();
    }
}
