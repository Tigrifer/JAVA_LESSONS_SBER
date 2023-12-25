package Lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Lesson2.Phonebook;

/**
 *
 * @author Tigriferum
 */
public class Main
{
    
    public static void main(String[] args)
    {
        String[] strings = new String[]
        {
            "One",
            "Two",
            "Three",
            "Some",
            "Bang!",
            "Easy...",
            "Bang!",
            "Goodbye",
            "Stand up",
            "Standup",
            "Standup",
            "Stand up",
            "Stand up",
            "Standup",
            "some"
        };
        
        Map<String, Integer> hm = new HashMap();
        
        for(String word : strings)
        {
            Integer count = hm.containsKey(word) ? 
                            (hm.get(word) + 1) :
                            1;
            hm.put(word, count);
        }
        
        System.out.println(hm);
        
        
        
        
        // ==========PHONE BOOK==========
        System.out.println();
        System.out.println();
        System.out.println("==========PHONE BOOK==========");
        Phonebook phBook = new Phonebook();
        
        phBook.add("McDoogle", "+13 559431654");
        System.out.println(phBook);
        phBook.add("McAlister", "+13 11111134");
        phBook.add("McDoogle", "+1 2222222123");
        phBook.add("McDoogle", "+1 2222222123");
        System.out.println(phBook);
        
        System.out.println(phBook.get("McDoogle"));
    }
}
