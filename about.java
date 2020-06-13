import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class about here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class about extends World
{

    public about()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        btnback btnback = new btnback();
        addObject(btnback,64,550);
    }
}
