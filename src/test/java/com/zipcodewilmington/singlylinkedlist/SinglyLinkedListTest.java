package com.zipcodewilmington.singlylinkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    private SinglyLinkedList list;

    @Before
    public void setUp() {
        list = new SinglyLinkedList();
    }

    @Test
    public void testInsertIntoEmptyList() {

        list.insert(10);


        assertEquals(10, list.get(0));
    }



    @Test
    public void testInsertAtEnd() {

        list.insert(5);
        list.insert(10);
        list.insert(20);


        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
        assertEquals(20, list.get(2));
    }
    @Test
    public void testRemove() {


        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);


        list.remove(0);


        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    public void testContains1() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        assertTrue(list.contains(20));
    }

    @Test
    public void testContains() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        assertFalse(list.contains(40));
    }

    @Test
    public void testFindWhenElementDoesNotExist() {

        list.insert(10);
        list.insert(20);
        list.insert(30);

        assertEquals(-1, list.find(40));
    }


    @Test
    public void copytest() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        SinglyLinkedList copiedList = list.copy();


        assertEquals(10, copiedList.get(0));
        assertEquals(20, copiedList.get(1));
        assertEquals(30, copiedList.get(2));
    }

    @Test
    public void testSort() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(30);
        list.insert(10);
        list.insert(20);

        list.sort();


        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    public void testGet() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);

        assertEquals(10, list.get(0));
    }

    @Test
    public void testSize() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(20);
        list.insert(30);
        assertEquals(2, list.size());
    }
}
