import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Enemigo es una clase abstracta que sobreescriben sus sub clases, hereda de actor.
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */
public abstract class Enemigo extends Actor
{
    /** 
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }
    /**
     * Metodo abstracto movimiento para sobrescribir en otras clases
     */
    abstract public void Movimiento();
        
}
