import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       MovimientoNave();
       Dispara();
    } 
    
    public void MovimientoNave()
    {
        int y=getY();
        

        if(Greenfoot.isKeyDown("right"))
        {
            //if(!isAtEdge())
                move(2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            //if(!isAtEdge())
                move(-2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            y=y-2;
            setLocation(getX(),y);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y=y+2;
            setLocation(getX(),y);
        }
      
    }
    
    public void Dispara()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            getWorld().addObject(new Bala(),getX(),getY());
        }
    }
}
