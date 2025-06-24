package com.mydsa.trie;

public class MyTrie {

    private final TrieNode root;

    public MyTrie() {
        root = new TrieNode();
    }

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a'; // 0 to 25
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    // Check if the word exists in the trie
    public boolean search(String word) {
        TrieNode node = traverse(word);
        return node != null && node.isEndOfWord;
    }

    // Check if any word starts with the given prefix
    public boolean startsWith(String prefix) {
        return traverse(prefix) != null;
    }

    // Helper to navigate down the trie
    private TrieNode traverse(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return null;
            }
            current = current.children[index];
        }
        return current;
    }

    // NEW: Delete a word from the Trie
    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int depth) {
        if (current == null) return false;

        if (depth == word.length()) {
            if (!current.isEndOfWord) {
                return false;
            } // Word not found
            current.isEndOfWord = false;
            return isEmpty(current);
        }

        int index = word.charAt(depth) - 'a';
        boolean shouldDeleteCurrentNode = delete(current.children[index], word, depth + 1);

        if (shouldDeleteCurrentNode) {
            current.children[index] = null;
            return !current.isEndOfWord && isEmpty(current);
        }

        return false;
    }

    private boolean isEmpty(TrieNode node) {
        for (TrieNode child : node.children) {
            if (child != null) return false;
        }
        return true;
    }

}