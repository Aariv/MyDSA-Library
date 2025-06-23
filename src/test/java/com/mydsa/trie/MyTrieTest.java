package com.mydsa.trie;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTrieTest {

    @Test
    public void testInsertAndSearch() {
        MyTrie trie = new MyTrie();
        trie.insert("apple");

        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));     // partial word, not inserted
        assertFalse(trie.search("banana"));
    }

    @Test
    public void testStartsWith() {
        MyTrie trie = new MyTrie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("ape");

        assertTrue(trie.startsWith("ap"));
        assertTrue(trie.startsWith("app"));
        assertTrue(trie.startsWith("ape"));
        assertFalse(trie.startsWith("bat"));
    }

    @Test
    public void testMultipleWords() {
        MyTrie trie = new MyTrie();
        String[] words = {"cat", "can", "car", "dog", "dove"};

        for (String word : words) {
            trie.insert(word);
        }

        for (String word : words) {
            assertTrue(trie.search(word));
        }

        assertFalse(trie.search("cattle"));
        assertFalse(trie.search("dov"));
        assertTrue(trie.startsWith("do"));
        assertFalse(trie.startsWith("z"));
    }

    @Test
    public void testEmptyInput() {
        MyTrie trie = new MyTrie();
        assertFalse(trie.search(""));
        assertFalse(trie.startsWith(""));

        trie.insert("");
        assertTrue(trie.search(""));
        assertTrue(trie.startsWith(""));
    }

    @Test
    public void testOverwriteWord() {
        MyTrie trie = new MyTrie();
        trie.insert("abc");
        trie.insert("abc");  // Re-inserting same word

        assertTrue(trie.search("abc"));
        assertTrue(trie.startsWith("ab"));
        assertFalse(trie.search("ab"));
    }

    @Test
    public void testDeleteSingleWord() {
        MyTrie trie = new MyTrie();
        trie.insert("hello");

        assertTrue(trie.search("hello"));

        assertTrue(trie.delete("hello")); // should delete completely
        assertFalse(trie.search("hello"));
        assertFalse(trie.startsWith("hell"));
    }

    @Test
    public void testDeletePrefixPreservesOthers() {
        MyTrie trie = new MyTrie();
        trie.insert("app");
        trie.insert("apple");

        assertTrue(trie.search("app"));
        assertTrue(trie.search("apple"));

        assertTrue(trie.delete("apple")); // should not affect "app"

        assertTrue(trie.search("app"));
        assertFalse(trie.search("apple"));
        assertTrue(trie.startsWith("app"));
    }

    @Test
    public void testDeleteNonExistentWord() {
        MyTrie trie = new MyTrie();
        trie.insert("abc");
        assertFalse(trie.delete("abcd"));
        assertTrue(trie.search("abc"));
    }

    @Test
    public void testDeleteWordThatIsPrefixOfAnother() {
        MyTrie trie = new MyTrie();
        trie.insert("a");
        trie.insert("ab");
        trie.insert("abc");

        assertTrue(trie.delete("ab"));

        assertTrue(trie.search("a"));
        assertFalse(trie.search("ab"));
        assertTrue(trie.search("abc"));
    }
}