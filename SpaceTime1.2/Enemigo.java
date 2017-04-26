import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Movimiento();
    }
    public void Movimiento()
    {
        int y=getY();
        y=y+1;
        setLocation(getX(), y);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
        
}
