import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (Budi Rochman Setyawan) 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        btnplay btnplay = new btnplay();
        addObject(btnplay,196,365);
        btnabout btnabout = new btnabout();
        addObject(btnabout,163,481);
        btnplay.setLocation(145,375);
        btnabout.setLocation(87,485);
        btnplay.setLocation(138,388);
    }
}
