import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase agrega los Cometas al juego.Hereda de Enemigo.
 *
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */
public class Cometa extends Enemigo
{
    /**
     * Metodo act es llamado cuando esta corriendo el juego.Para estar en movimiento constante.
     */
    public void act() 
    {
        // Add your action code here.
        Movimiento();
    } 
     
    /**
    * Este metodo es el responsable de darle el movimiento alos cometas y los desaparece en el
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
