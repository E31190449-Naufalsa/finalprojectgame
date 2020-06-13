import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class main extends World
{
    public main()
    {    
        super(500, 800, 1); 
        prepare();
    }
    private void prepare()
    {
        car car = new car();
        addObject(car,312,554);
    }
    public void act(){
        if (Greenfoot.getRandomNumber(500)<2){
            addObject(new carone(),Greenfoot.getRandomNumber(250)+175,0);
        }
        if (Greenfoot.getRandomNumber(100)<1){
            addObject(new cartwo(),Greenfoot.getRandomNumber(250)+175,0);
        }
        if (Greenfoot.getRandomNumber(300)<1){
            addObject(new carthree(),Greenfoot.getRandomNumber(250)+175,0);
        }
        if (Greenfoot.getRandomNumber(300)<1){
            addObject(new coin(),Greenfoot.getRandomNumber(250)+175,0);
        }
    }
}
