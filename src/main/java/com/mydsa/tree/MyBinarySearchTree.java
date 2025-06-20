package com.mydsa.tree;

public class MyBinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(TreeNode node, int value) {
        if (node == null) return false;
        if (node.value == value) return true;
        return value < node.value
            ? searchRecursive(node.left, value)
            : searchRecursive(node.right, value);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode node, int value) {
        if (node == null) return null;

        if (value < node.value) {
            node.left = deleteRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRecursive(node.right, value);
        } else {
            // Node found
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // Two children: Get inorder successor (min in right subtree)
            TreeNode minNode = findMin(node.right);
            node.value = minNode.value;
            node.right = deleteRecursive(node.right, minNode.value);
        }
        return node;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // ===== Traversals =====

    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(TreeNode node) {
        if (node == null) return;
        inOrderRecursive(node.left);
        System.out.print(node.value + " ");
        inOrderRecursive(node.right);
    }

    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(TreeNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrderRecursive(node.left);
        preOrderRecursive(node.right);
    }

    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(TreeNode node) {
        if (node == null) return;
        postOrderRecursive(node.left);
        postOrderRecursive(node.right);
        System.out.print(node.value + " ");
    }

    // Returns the minimum value in the BST
    public int min() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    // Returns the maximum value in the BST
    public int max() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    // Returns the height (max depth) of the BST
    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(TreeNode node) {
        if (node == null) return -1; // height of empty tree is -1
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }

}