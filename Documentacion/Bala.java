import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Clase Bala hereda de nave, esta clase es donde se generan las balas que dispara la nave.
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */
public class Bala extends Nave
{
    /**
     * Metodo principal act aqui se estaran mandando a llamar a los demas metodos de la clase.
     */
    public void act() 
    {
      Movimiento();
      ColisionBala();
    }
           
        
    /**
     * Metodo Movimietno, este metodo permite el movimiento de la bala por el mundo
     */   
    public void Movimiento()
    {
        int y=getY();
        y=y-2;
        setLocation(getX(), y);
        if(isAtEdge())
        {
           // getWorld().removeObject(this);
           setLocation(0,0);
        }
    }
    
    /**
     * Metoo ColisionBala este metodo verifica si la bala colisiona con algun otro objeto del
     * juego y si es el caso lo destruye.
     */
    public void ColisionBala()
    {
      Actor Asteroide=getOneObjectAtOffset(0,0,Asteroide.class);
      if(Asteroide!=null)
        {
          Fase1 fas=(Fase1)getWorld();
          fas.removeObject(Asteroide);
          fas.CreaAsteroides(1);
          Greenfoot.playSound("enem.mp3");
          fas.Poder();
          fas.removeObject(this);
          
      }
      else 
      {
           Actor Alien=getOneObjectAtOffset(0,0,Alien.class);
           if(Alien!=null)
           {
              Fase1 fase=(Fase1)getWorld();
          
              fase.CreaAsteroides(1);
              Greenfoot.playSound("enem.mp3");
              fase.Poder();
              fase.removeObject(this);

           }   
      }
      
    }
}
