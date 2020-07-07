package leetcodeDSA.structures;

import leetcodeDSA.structures.Node;

interface LinkedListMethods {
    void addFirst(int value);
    void addLast(int value);
    void addAtIndex(int value, int index);
    Node removeFirst();
    Node removeLast();
    String printValues() throws ClassNotFoundException;
    Node peekHead();
    Node peekTail();
    Node peekAtIndex(int index);
    int size();
    boolean isEmpty();
}
