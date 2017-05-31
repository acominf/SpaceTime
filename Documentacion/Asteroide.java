import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase agrega los asteroides al juego.Hereda de Enemigo
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */
public class Asteroide extends Enemigo
{
    /**
     * Metodo act es llamado cuando esta corriendo el juego.
     */
    public void act() 
    {
        
     Movimiento();
     
    }    

    /**
    * Este metodo es el responsable de darle el movimiento alos asteroides y los desaparece en el
    * borde inferior de la pantalla.
    */
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
