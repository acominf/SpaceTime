import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poder extends Actor
{
    /**
     * Act - do whatever the Poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void Movimiento()
    {
        int y=getY();
        y=y+2;
        setLocation(getX(), y);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
