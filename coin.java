import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class coin extends Actor
{
    int speed = 5;
    public void act() 
    {
       coin a = new coin();
       Actor i = getOneIntersectingObject(coin.class);
       move(speed);
       checkDouble(i);
       end();
    } 
    public void end(){
        if (getY() >= 599){
            getWorld().removeObject(this);
        }
    }
    
    public void checkDouble(Actor i){
        if(i!=null){
            getWorld().removeObject(i);
        }
    }
    
    public void move (int speed){
        setLocation(getX(),getY()+speed);
    }
}
