package org.dsa.challanges_leetcode.hashTables;

public class MyHashSet {

    private boolean[] dados;

    public MyHashSet() {
        dados = new boolean[1000001];
    }

    public void add(int key) {
        dados[key] = true;
    }

    public void remove(int key) {
        dados[key] = false;
    }

    public boolean contains(int key) {
        return dados[key];
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(2);

        System.out.println(set.contains(1));
        System.out.println(set.contains(3));

        set.add(2);

        System.out.println(set.contains(2));

        set.remove(2);

        System.out.println(set.contains(2));
    }

}
