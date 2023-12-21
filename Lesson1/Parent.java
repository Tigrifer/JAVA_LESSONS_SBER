package Lesson1;

public abstract class Parent
{
    private String Name;
    
    static
    {
        System.out.println("Parent:static 1");
    }
    
    // non-static
    {
        System.out.println("Parent:instance 1");
    }
    
    static
    {
        System.out.println("Parent:static 2");
    }
    
    public Parent()
    {
        System.out.println("Parent:constructor");
    }
    
    // non-static
    {
        System.out.println("Parent:instance 2");
    }
    
    public Parent(String name)
    {
        Name = name;
        System.out.println("Parent:name-constructor");
    }
}