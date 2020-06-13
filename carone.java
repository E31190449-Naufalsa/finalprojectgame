import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class carone extends parent
{
    int speed = 4;
    public void act() 
    {
       carone a = new carone();
       Actor i = getOneIntersectingObject(parent.class);
       move(speed);
       checkDouble(i);
       end();
    }    
}
