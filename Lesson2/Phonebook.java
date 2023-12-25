package Lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Tigriferum
 */
public class Phonebook
{
    private Map<String, Set<String>> al;
    
    {
        al = new HashMap();
    }
            
    public void add(String surname, String phoneNumber)
    {
        if (!al.containsKey(surname))
        {
            al.put(surname, new HashSet<String>());
        }
        
        al.get(surname).add(phoneNumber);
    }
    
    public Set<String> get(String surname)
    {
        return al.containsKey(surname) ? al.get(surname) : new HashSet<String>();
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        for(String surname : al.keySet())
        {
            sb.append(surname);
            sb.append(": ");
            sb.append(al.get(surname));
            sb.append("\r\n");
        }
        
        return sb.toString();
    }
}
