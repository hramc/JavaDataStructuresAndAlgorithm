package datastrcutures.linkedLists;

import lombok.Getter;
import lombok.Setter;

public class SingleLinkedList {

    public static void main (String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node headNode = singleLinkedList.generateList();
        singleLinkedList.printNodes(headNode);
        singleLinkedList.addNodeAfter(new Node(11),
                singleLinkedList.findNodeOrReturnHeadNode(3, headNode));
        singleLinkedList.addNodeAfter(new Node(12),
                singleLinkedList.findNodeOrReturnHeadNode(4, headNode));
        singleLinkedList.addNodeAfter(new Node(13),
                singleLinkedList.findNodeOrReturnHeadNode(5, headNode));
        singleLinkedList.addNodeAfter(new Node(14),
                singleLinkedList.findNodeOrReturnHeadNode(6, headNode));
        singleLinkedList.addNodeAfter(new Node(15),
                singleLinkedList.findNodeOrReturnHeadNode(7, headNode));
        singleLinkedList.printNodes(headNode);
        singleLinkedList.printNode(
                singleLinkedList.findNodeOrReturnHeadNode(3, headNode));
    }

    private Node generateList() {
        Node headNode = new Node(1);
        Node prevNode = headNode;
        for (int i=2;i<10;i++) {
            Node nextNode = new Node(i);
            prevNode.setNext(nextNode);
            prevNode = nextNode;
        }

        return headNode;
    }

    private void addNodeAfter(Node newNode, Node existingNode) {
        Node oldNext = existingNode.getNext();
        existingNode.setNext(newNode);
        newNode.setNext(oldNext);
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
    static
    class Node {
        int value;

        Node next;

        public Node(int value) {
            this.value = value;
        }

    }
}


