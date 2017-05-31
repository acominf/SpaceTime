import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Enemigo
{
    /**
     * Este enemigo es el mas comun
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
