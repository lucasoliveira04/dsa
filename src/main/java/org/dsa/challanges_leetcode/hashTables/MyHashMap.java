package org.dsa.challanges_leetcode.hashTables;

class Node {
    int key;
    int value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
class MyHashMap {

    private Node[] bucket;
    private static final int SIZE = 1000;

    public MyHashMap() {
        bucket = new Node[SIZE];
    }

    public void put(int key, int value) {
        int index = key % SIZE;

        Node atual = bucket[index];

        if (atual == null) {
            bucket[index] = new Node(key, value);
            return;
        }

        while (true) {

            // existe, atualiza o valor
            if (atual.key == key) {
                atual.value = value;
                return;
            }

            // final
            if (atual.next == null) {
                atual.next = new Node(key, value);
                return;
            }

            atual = atual.next;
        }
    }

    public int get(int key) {
        int index = key % SIZE;

        Node atual = bucket[index];

        while (atual != null) {
            if (atual.key == key) {
                return atual.value;
            }

            atual = atual.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = key % SIZE;

        Node atual = bucket[index];
        Node anterior = null;

        while (atual != null) {
            if (atual.key == key) {
                if (anterior == null) {
                    bucket[index] = atual.next;
                } else {
                    anterior.next = atual.next;
                }

                return;
            }

            anterior = atual;
            atual = atual.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */