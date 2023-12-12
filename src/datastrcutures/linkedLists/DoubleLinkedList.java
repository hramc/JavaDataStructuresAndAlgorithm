package datastrcutures.linkedLists;

import lombok.Getter;
import lombok.Setter;

public class DoubleLinkedList {

    public static void main (String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        Node headNode = doubleLinkedList.generateList();
        doubleLinkedList.printNodes(headNode);
        doubleLinkedList.addNodeAfter(new Node(11),
                doubleLinkedList.findNodeOrReturnHeadNode(3, headNode));
        doubleLinkedList.addNodeBefore(new Node(12),
                doubleLinkedList.findNodeOrReturnHeadNode(4, headNode));
        doubleLinkedList.addNodeAfter(new Node(13),
                doubleLinkedList.findNodeOrReturnHeadNode(5, headNode));
        doubleLinkedList.addNodeAfter(new Node(14),
                doubleLinkedList.findNodeOrReturnHeadNode(6, headNode));
        doubleLinkedList.addNodeBefore(new Node(15),
                doubleLinkedList.findNodeOrReturnHeadNode(7, headNode));
        doubleLinkedList.printNodes(headNode);
        doubleLinkedList.printNode(
                doubleLinkedList.findNodeOrReturnHeadNode(3, headNode));
    }

    private Node generateList() {
        Node headNode = new Node(1);
        Node prevNode = headNode;
        for (int i=2;i<10;i++) {
            Node nextNode = new Node(i);
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
            prevNode = nextNode;
        }

        return headNode;
    }

    private void addNodeAfter(Node newNode, Node existingNode) {
        Node oldNext = existingNode.getNext();
        existingNode.setNext(newNode);
        newNode.setPrev(existingNode);
        newNode.setNext(oldNext);
        oldNext.setPrev(newNode);
    }

    private void addNodeBefore(Node newNode, Node existingNode) {
        Node oldPrev = existingNode.getPrev();
        oldPrev.setNext(newNode);
        newNode.setPrev(oldPrev);
        newNode.setNext(existingNode);
        existingNode.setPrev(newNode);
    }

    private void printNodes(Node headNode) {
        Node node = headNode;
        while (node!=null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    private void printNode(Node node) {
        System.out.println("Node value >> " + node.getValue());
    }

    private Node findNodeOrReturnHeadNode(int value, Node headNode) {
        Node node = headNode;
        while (node!=null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNext();
        }
        return headNode;
    }

    @Getter
    @Setter
    static class Node {
        int value;

        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}

