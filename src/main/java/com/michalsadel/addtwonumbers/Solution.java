package com.michalsadel.addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1n = l1;
        ListNode l2n = l2;
        ListNode rootNode = null;
        ListNode currentNode = null;
        int rest = 0;
        while (l1n != null || l2n != null) {
            int sum = value(l1n) + value(l2n) + rest;
            if (sum > 9) {
                rest = 1;
            }
            if (rootNode == null) {
                rootNode = new ListNode(sum % 10);
                currentNode = rootNode;
            } else {
                currentNode = currentNode.append(sum % 10);
            }
            l1n = l1n.next;
            l2n = l2n.next;
        }
        return rootNode;
    }

    private int value(ListNode node) {
        return node != null ? node.getValue() : 0;
    }
}
