import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase agrega los Aliens al juego.Hereda de Enemigo.
 * 
 */
public class Alien extends Enemigo
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
    * Este metodo es el responsable de darle el movimiento alos aliens de un
    * lado a otro de la pantalla.
    */
    public void Movimiento()
    {
       move(1);
       if(isAtEdge())
       {
           turnTowards(0,getY());
       }
      
    }
    
}
