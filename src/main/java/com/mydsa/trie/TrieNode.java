package com.mydsa.trie;

public class TrieNode {
    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode() {
        // Assuming lowercase English letters a-z
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}