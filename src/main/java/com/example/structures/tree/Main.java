package com.example.structures.tree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTreeA = new BinaryTree();

        binaryTreeA.add(2);
        binaryTreeA.add(5);
        binaryTreeA.add(8);
        binaryTreeA.add(9);
        binaryTreeA.add(3);

        BinaryTree binaryTreeB = new BinaryTree();

        binaryTreeB.add(1);
        binaryTreeB.add(3);
        binaryTreeB.add(6);
        binaryTreeB.add(2);
        binaryTreeB.add(5);
        binaryTreeB.add(9);

        System.out.println("Binary TreeA");
        System.out.println("traverseInOrder");
        binaryTreeA.traverseInOrder(binaryTreeA.root);
        System.out.println("traversePreOrder");
        binaryTreeA.traversePreOrder(binaryTreeA.root);
        System.out.println("traversePostOrder");
        binaryTreeA.traversePostOrder(binaryTreeA.root);

        System.out.println("Binary TreeB");
        System.out.println("traverseInOrder");
        binaryTreeB.traverseInOrder(binaryTreeB.root);
        System.out.println("traversePreOrder");
        binaryTreeB.traversePreOrder(binaryTreeB.root);
        System.out.println("traversePostOrder");
        binaryTreeB.traversePostOrder(binaryTreeB.root);
    }
}
