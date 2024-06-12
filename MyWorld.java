import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    boolean bStarted, started = false;
    boolean once;
    int transparency = 0;
    int scrollSpeed;
    boolean scroll;
    boolean fall;
    boolean ended;
    boolean killed;
    int height = 0;
    int characterX;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 400, 1, false);
        
        addObject(new platform(), 56, 317);
        addObject(new character(false), 56,200);
        setPaintOrder(counter.class, character.class, platform.class, bullet.class);
        setBackground("title.jfif");
        getBackground().setTransparency(255);
        once = true;
        started = false;
        height = 0;
        fall = false;
        ended = false;
        killed = false;
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000) > 998 & started==true)
            {
                int x = Greenfoot.getRandomNumber(300);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new enemy1(), x, y);
            }
    
        if (Greenfoot.getRandomNumber(1000) > 998 & started==true)
            {
                int x = Greenfoot.getRandomNumber(300);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new enemy2(), x, y);
            }
        
       
        // click mouse button to start game    
        if(bStarted==false & Greenfoot.mouseMoved(this))
            {
                bStarted = true;
            }
        
        if(started==false & bStarted==true)
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            if(Greenfoot.mouseClicked(this))
            {
                if(mouse.getX()>=50 & mouse.getX()<=145
                && mouse.getY()>=150 & mouse.getY()<=230)
                {
                    started = true;
                }
            }
        }
        
        // Move to beggining of game
        if(started==true & once==true)
        {
            setBackground("paper.png");
            cleanup();
            once = false;
            setLevel(1);
        }
        if(fall)
        {
            end();
        }
        if(killed)
        {
            end();
        }
}

    public void cleanup()
    {
        removeObjects(getObjects(character.class));
        removeObjects(getObjects(platform.class));
    }
    
    public void setLevel(int level)
    {
        switch(level)
        {
            case 1: gamePlay(); break;
        }
    }
    
    // Start of game
    public void gamePlay()
    {
        addObject(new character(), getWidth()/2, 300);
        addObject(new platform(false), 28,391);
        addObject(new platform(false), 83,391);
        addObject(new platform(false), 83+55,391);
        addObject(new platform(false), 83+55+55,391);
        addObject(new platform(false), 83+55+55+55,391);
        addObject(new platform(false), 83+55+55+55+55,391);
        
        addObject(new platform(), Greenfoot.getRandomNumber(300), 250);
        addObject(new platform(), Greenfoot.getRandomNumber(300), 150);
        addObject(new platform(), Greenfoot.getRandomNumber(300), 50);
        addObject(new counter(), 253, 385);
    }
    
    public void end()
    {
        cleanup();
        started=false;
        bStarted=false;
        addObject(new platform(), 56, 317);
        addObject( new character(false), 56, 200);
        
        setBackground("title.jfif");
        getBackground().setTransparency(255);
        once = true;
        started = false;
        height = 0;
        fall = false;
        killed = false;
        ended = false;
    }
}
