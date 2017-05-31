import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Misil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misil extends Bala
{
    /**
     * diparo especial de la nave que podremos obtener conforme avance el juego
     */
    public void act() 
    {
        // Add your action code here.
        super.Movimiento();
        //super.muestraPunto();
      Actor Asteroide=getOneObjectAtOffset(0,0,Asteroide.class);
      if(Asteroide!=null)
      {
          Fase1 fas=(Fase1)getWorld();
          fas.removeObject(Asteroide);
          fas.CreaAsteroides(1);
          fas.Poder();
          fas.removeObject(this);
          
          fas.muestraPunto();
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
