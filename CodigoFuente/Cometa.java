import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cometa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cometa extends Enemigo
{
    /**
     * un enemigo especial que rara vez aparecera 
     */
    public void act() 
    {
        // Add your action code here.
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
