import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase poder, en esta clase se agregan los poderes al juego que obtendra el jugador
 *
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
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

    /**
    * Este metodo sirve para dar el movimiento alos objetos de tipo poder.
    *Una vez que el objeto llega al final de la pantalla este desaparece.
    */
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
