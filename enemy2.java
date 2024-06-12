import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy2 extends Actor
{
    /**
     * Act - do whatever the enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        lookCharacter();
        kill1();
    }
    
    public void lookCharacter()
    {
        if(isTouching(character.class))
        {
            removeTouching(character.class);
            killed();
        }
        else
        {
            move(1);
        }
    }
    
    public void killed()
    {
        ((MyWorld) getWorld()).killed = true;
    }
    
    public void kill1()
    {
        int x = getX();
        
        if(x==getWorld().getWidth()-1)
        {
            Actor enemy2 = getOneObjectAtOffset(0, 0, enemy2.class);
        }
    }

}
