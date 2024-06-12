import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy1 extends Actor
{
    /**
     * Act - do whatever the enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public enemy1()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void enemyAnimate()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        lookCharacter();
        kill1();
        enemyAnimate();
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
            Actor enemy1 = getOneObjectAtOffset(0, 0, enemy1.class);
        }
    }
}
