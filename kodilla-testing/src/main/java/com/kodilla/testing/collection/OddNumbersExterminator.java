package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(ArrayList<Integer> numbers) {

        List<Integer> euqalsNumbers = new ArrayList<Integer>();

        for(Integer n : numbers) {
            if(n % 2 == 0) {
                euqalsNumbers.add(n);
            }
        }

        return euqalsNumbers;
    }
}
