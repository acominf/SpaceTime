import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Actor
{
    /**
     * Act - do whatever the Letrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Regresa();
    }
    public void Regresa()
    {
         if(Greenfoot.isKeyDown("b"))
            {
                Greenfoot.setWorld(new Menu());
            }
    }
}
