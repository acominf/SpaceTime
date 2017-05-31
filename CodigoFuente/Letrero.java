import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Imagen
{
    /**
     * El letrero nos servira para poder regresar al menu 
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
