import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Nave
{
    /**
     * Objeto que ayudara a la nave a destruir los enemigos 
     */
    public void act() 
    {
      Movimiento();
      ColisionBala();
      //muestraPunto();
    }
 
           
        
       
    public void Movimiento()
    {
        int y=getY();
        y=y-2;
        setLocation(getX(), y);
        if(isAtEdge())
        {
           // getWorld().removeObject(this);
           setLocation(500,550);
        }
    }
    
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
          fas.Fases();
          
          fas.muestraPunto();
          
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
