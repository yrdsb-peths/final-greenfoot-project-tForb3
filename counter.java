import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    GreenfootImage image = new GreenfootImage(100,10);
    public counter()
    {
        setImage(image);
    }
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        image.clear();
        image.drawString(((MyWorld) getWorld()).height + " doodles.", 10,10);
        setImage(image);
    }
}
