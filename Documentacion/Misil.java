import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Clase Misil hereda de Bala, esta clase es donde se generan los misiles que dispara la nave cuando obtiene el
 *poder misil (PM).
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */
public class Misil extends Bala
{
    /**
     * Metodo act en este metodo se sobre escribe el de la clase padre para poder mover el misil
     * y que este destruya a los aliens en caso de que colisione con uno de ellos.
    */
    public void act() 
    {
        // Add your action code here.
        super.Movimiento();
      Actor Asteroide=getOneObjectAtOffset(0,0,Asteroide.class);
      if(Asteroide!=null)
      {
          Fase1 fas=(Fase1)getWorld();
          fas.removeObject(Asteroide);
          fas.CreaAsteroides(1);
          fas.Poder();
          fas.removeObject(this);
      }
      else
     {
         Actor Alien =getOneObjectAtOffset(0,0,Alien.class);
         if(Alien!=null)
         {
            Fase1 fas=(Fase1)getWorld();
            fas.removeObject(Alien);
            fas.CreaAlien(1);
            fas.CreaAsteroides(1);
            fas.Poder();
            fas.removeObject(this);
         }
      }
    }    
}
