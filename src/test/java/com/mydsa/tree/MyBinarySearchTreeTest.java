package com.mydsa.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyBinarySearchTreeTest {

    @Test
    public void testInsertAndSearch() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        assertTrue(bst.search(50));
        assertTrue(bst.search(30));
        assertTrue(bst.search(80));
        assertFalse(bst.search(10));
        assertFalse(bst.search(100));
    }

    @Test
    public void testDeleteLeafNode() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        assertTrue(bst.search(5));
        bst.delete(5);
        assertFalse(bst.search(5));
    }

    @Test
    public void testDeleteNodeWithOneChild() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(2);  // left child of 5

        assertTrue(bst.search(5));
        bst.delete(5);
        assertFalse(bst.search(5));
        assertTrue(bst.search(2));
    }

    @Test
    public void testDeleteNodeWithTwoChildren() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        assertTrue(bst.search(50));
        bst.delete(50);
        assertFalse(bst.search(50));
        // Either 60 or 70 should become new root depending on min from right
        assertTrue(bst.search(60));
        assertTrue(bst.search(70));
    }

    @Test
    public void testInOrderTraversal() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);

        System.out.print("InOrder: ");
        bst.inOrder(); // Expected: 10 20 30 40 50 60 70
    }

    @Test
    public void testPreOrderTraversal() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);

        System.out.print("PreOrder: ");
        bst.preOrder(); // Expected: 40 20 60
    }

    @Test
    public void testPostOrderTraversal() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);

        System.out.print("PostOrder: ");
        bst.postOrder(); // Expected: 20 60 40
    }

    @Test
    public void testMinMax() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(70);

        assertEquals(10, bst.min());
        assertEquals(70, bst.max());
    }

    @Test
    public void testHeight() {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        assertEquals(-1, bst.height()); // empty tree

        bst.insert(50);
        assertEquals(0, bst.height()); // just root

        bst.insert(30);
        bst.insert(70);
        assertEquals(1, bst.height());

        bst.insert(20);
        bst.insert(10);
        assertEquals(3, bst.height()); // unbalanced left-heavy tree
    }
}