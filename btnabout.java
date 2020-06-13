import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class btnabout extends Actor
{
    /**
     * Act - do whatever the btnabout wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new about()); 
        }
    }    
}
