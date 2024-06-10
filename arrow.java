import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow extends Actor
{
    boolean removed = false;
    
    public arrow()
    {
        removed = false;
    }
    
    
    // When character off screen show where with arrow
    public void act()
    {
        setLocation(((Myworld) getWorld()).characterX, 20);
    }
}
