import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class carthree extends parent
{
    int speed = 2;
    public void act() 
    {
       carthree a = new carthree();
        Actor i = getOneIntersectingObject(parent.class);
        move(speed);
        checkDouble(i);
        end();
    }    
}
