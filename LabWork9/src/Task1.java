import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/*
убрать числа !!!!!!!!
 */


public class Task1 {

    public ArrayList<Integer> init() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.round(Math.random() * 10));
        }
        return list;
    }

    public ArrayList<Integer> newList(ArrayList<Integer> firstList) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            newList.add(firstList.get(i));
        }
        return newList;

    }

    public HashSet<Integer> uniqueNumbers(ArrayList<Integer> array) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int uNumber : array) {
            uniqueNumbers.add(uNumber);
        }
        return uniqueNumbers;
    }

    public HashMap<Integer, Integer> uniqueNumberAmounts(ArrayList<Integer> array) {
        HashMap<Integer, Integer> numbersAmount = new HashMap<>();
        for (int n : array) {
            numbersAmount.put(n, 0);
        }

        int j = 0;

            for (int i = 0; i < array.size(); i++) {
                if ( == array.get(i)) {

                }
    }
}
