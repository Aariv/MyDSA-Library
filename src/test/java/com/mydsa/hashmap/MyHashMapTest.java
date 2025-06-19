package com.mydsa.hashmap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void testPutAndGet() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        assertEquals(1, (int)map.get("apple"));
        assertEquals(2, (int)map.get("banana"));
        assertEquals(3, (int)map.get("cherry"));
    }

    @Test
    public void testOverwriteValue() {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("key", "value1");
        assertEquals("value1", map.get("key"));

        map.put("key", "value2");
        assertEquals("value2", map.get("key"));
    }

    @Test
    public void testRemove() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        assertEquals(1, (int)map.remove("one"));
        assertNull(map.get("one"));
        assertFalse(map.containsKey("one"));

        assertEquals(2, (int)map.get("two"));
    }

    @Test
    public void testContainsKey() {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(10, "ten");

        assertTrue(map.containsKey(10));
        assertFalse(map.containsKey(5));
    }

    @Test
    public void testSizeAndIsEmpty() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());

        map.put("a", 1);
        map.put("b", 2);
        assertFalse(map.isEmpty());
        assertEquals(2, map.size());

        map.remove("a");
        assertEquals(1, map.size());
    }

    @Test
    public void testNullKeyAndValue() {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put(null, "nullValue");
        map.put("key", null);

        assertEquals("nullValue", map.get(null));
        assertNull(map.get("key"));

        assertTrue(map.containsKey(null));
        assertTrue(map.containsKey("key"));
    }

    @Test
    public void testResize() {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        int elements = 100;

        for (int i = 0; i < elements; i++) {
            map.put(i, "val" + i);
        }

        assertEquals(elements, map.size());

        for (int i = 0; i < elements; i++) {
            assertEquals("val" + i, map.get(i));
        }
    }
}