import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    boolean removed;
    public bullet()
    {
        removed = false;
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(foundEnemy1())
        {
            kill1();
        }
        if(foundEnemy2())
        {
            kill2();
        }

        if(removed)
        {
            return;
        }
        
        move();
    }
    
    public void move()
    {
        if(getY()<=0)
        {
            removed = true;
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX(), getY()-10);
    }
    
    public boolean foundEnemy1()
    {
        Actor enemy1 = getOneObjectAtOffset(0, 0, enemy1.class);
        return enemy1 != null;
    }
    
    public boolean foundEnemy2()
    {
        Actor enemy2 = getOneObjectAtOffset(0, 0, enemy2.class);
        return enemy2 != null;
    }
    
    public void kill1()
    {
        Actor enemy1 = getOneObjectAtOffset(0, 0, enemy1.class);
        if(enemy1 != null)
        {
            getWorld().removeObject(enemy1);
        }
    }
    
    public void kill2()
    {
        Actor enemy2 = getOneObjectAtOffset(0, 0, enemy2.class);
        if(enemy2 != null)
        {
            getWorld().removeObject(enemy2);
        }
    }
    
}
