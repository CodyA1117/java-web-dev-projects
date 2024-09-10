package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {

        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. "
                + "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing "
                + "that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


        HashMap<Character, Integer> characterCounts = new HashMap<>();


        char[] charactersInString = text.toCharArray();

        for (char i : charactersInString){
            if (!characterCounts.containsKey(i)){
                characterCounts.put(i, 1);
            }
            else {
                int j = characterCounts.get(i);
                characterCounts.replace(i, j + 1 );
            }
        }
//        System.out.println(characterCounts);
        for(Map.Entry<Character, Integer> printchar: characterCounts.entrySet()){
            System.out.println(printchar.getKey() + " : " + printchar.getValue());
        }

    }
}





