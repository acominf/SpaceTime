import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Enemigo
{
    /**
     * Un enemigo que aparecera en la fase 2
     */
    public void act() 
    {
        // Add your action code here.
        Movimiento();
    }    
    public void Movimiento()
    {
       move(1);
       if(isAtEdge())
       {
           turnTowards(0,getY());
       }
      
    }
    
}
