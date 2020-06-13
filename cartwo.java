import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class cartwo extends parent
{
    int speed = 4;
    public void act() 
    {
       cartwo a = new cartwo();
        Actor i = getOneIntersectingObject(parent.class);
        move(speed);
        checkDouble(i);
        end();
    }    
}
