import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class btnplay extends Actor
{
    public void act() 
    {
       if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new main());
        }
    }    
}
