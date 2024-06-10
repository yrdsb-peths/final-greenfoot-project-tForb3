import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform extends Actor
{
    boolean hasBeenBounced;
    int x_pos, y_pos;
    /**
     * Act - do whatever the platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(((MyWorld) getWorld()).scroll==true)
        {
            scroll(((MyWorld) getWorld()).scrollSpeed);
        }
        
        if(((MyWorld) getWorld()).fall==true)
        {
            fall(((MyWorld) getWorld()).scrollSpeed);
        }
        if(y_pos < 0)
        {
            getWorld().removeObject(this);
            return;
        }
    }
    
    protected void addedToWorld(World world)
    {
        x_pos = getX();
        y_pos = getY();
    }
    
    public void scroll(int speed)
    {
        if(speed>0)
        {
            y_pos = y_pos + speed;
            setLocation(x_pos, y_pos);
        }
    }
    
    public void fall(int speed)
    {
        if(((MyWorld) getWorld()).ended==false)
        {
            y_pos = y_pos + speed;
            setLocation(x_pos, y_pos)
        }
    }
    
    public ground()
    {
        hasBeenBounced=false;
    }
    
    public ground(boolean bouncable)
    {
        hasBeenBounced=true;
    }
}
