import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Indicador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Indicador extends Actor
{
    /**
     * Act - do whatever the Indicador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MoverIndicador();
        Eleccion();
       
    }   
    public void MoverIndicador()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(140,350);
        }
           if(Greenfoot.isKeyDown("up"))
        {
            setLocation(50,250);
        }
    }
    public void Eleccion()
    {
        if(getX() == 140 && getY() == 350)
        {
            if(Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new Ayuda());
            }
        }
    }
    
}
