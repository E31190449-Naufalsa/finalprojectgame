import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class car extends Actor
{
    int score = 0;
    public void act() 
    {
       getWorld().showText("Score : "+ score, 50, 20);
       checkKey();
       end();
       addscore();
    }    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>=175){
                setLocation(getX()-4, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<=425){
                setLocation(getX()+4, getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY()+4);
        }
    }
    public void end(){
        if(isTouching(parent.class)){
            setImage("mobilmeledak.png");
            getWorld().showText("Game Over\nScore : "+ score, 300, 300);
            Greenfoot.stop();
        }
    }
    public void addscore(){
        if(isTouching(coin.class)){
            score = score + 30;
            removeTouching(coin.class);
        }
    }
}
