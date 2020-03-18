package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

        @Before
        public void startTest() {
            System.out.println("Początek testu");
        }

        @After
        public void endTest() {
            System.out.println("Koniec testu");
        }

        @Test
        public void testOddNumbersExterminatorEmptyList(ArrayList<Integer> numbers) {
            if (numbers==null) {
                System.out.println("Brak zawartości");
            }
        }

        @Test
        public void testOddNumbersExterminatorNormalList() {

            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            System.out.println(OddNumbersExterminator.exterminate(numbers));
        }
    }


