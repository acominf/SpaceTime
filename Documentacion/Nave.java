import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Nave, en esta clase se crea el personaje principal,
 * aqui se crea la nave y las obciones de movimiento asi como de disparar la nave.
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */

public class Nave extends Actor
{
    private boolean Ban = false;
    private boolean Ban2 = true;
    private boolean BanM = false;
    private boolean BanR = false;
    private boolean BanB = false;
    private boolean BanV = false;
    /**
     * Metodo principal act aqui se estaran mandando a llamar a los demas metodos.
     */
    public void act() 
    {
        // Add your action code here
       MovimientoNave();
       DisparaBala();
       Colisiones();
    } 
    
    /**
     * Metodo MovimientoNave, este metodo sirve para realizar los movimientos de la nave 
     * en las distintas direcciones, asi como acelerar el movimiento si se presiona la 
     * tecla espacio.
     */
    public void MovimientoNave()
    {
        int y=getY();
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            if(Greenfoot.isKeyDown("space"))
            {
              move(10);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            if(Greenfoot.isKeyDown("space"))
            {
              move(-10);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            y=y-2;
            setLocation(getX(),y);
            if(Greenfoot.isKeyDown("space"))
            {
               setLocation(getX(),y-10);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y=y+2;
            setLocation(getX(),y);
            if(Greenfoot.isKeyDown("space"))
            {
               setLocation(getX(),y+10);
            }
        }
    }
    
    /**
     * Metodo DisparaBala este metodo es el que permite que la nave dispare las balas  
     * una ves que se presione la tecla a.
     */
    public void DisparaBala()
    {
        if(Ban && Greenfoot.isKeyDown("a"))
        {
           getWorld().addObject(new Bala(),getX(),getY());
           Greenfoot.playSound("piu.mp3");
           Ban =false;
        }
        if(!Ban && !Greenfoot.isKeyDown("a"))
        {
            Ban = true;
        }
       
    }
    
    /**
     * Metodo DisparaMisil este metodo es el que permite que la nave dispare los misiles  
     * una ves que se presione la tecla s, siempre y cuando haya obtenido antes 
     * el poder misil. 
     */
     public void DisparaMisil()
    {
        if(!Ban2 && !Greenfoot.isKeyDown("s"))
        {
           getWorld().addObject(new Misil(),getX(),getY());
           Greenfoot.playSound("Misil.mp3");
           Ban2 =true;
        }
        if(Ban2 && Greenfoot.isKeyDown("s"))
        {
            Ban2 = false;
        }
    }
    
    /**
     * Metodo Colisiones, este metodo verifica si las posiciones de la nave coinciden con 
     * las de los objetos presentes en el juego si es asi realiza la opcion correspodiente. 
     * 
     *  
     */
    public void Colisiones()
    {
         Actor PM = getOneObjectAtOffset(0,0,PM.class);
      if(PM!=null)
      {
         getWorld().removeObject(PM);
         BanM = true;
      }
      if(BanM)
      {  
            DisparaMisil();
      }
       Actor PV = getOneObjectAtOffset(0,0,PV.class);
      if(PV!=null)
      {
         getWorld().removeObject(PV);
         BanM = true;
      }
      if(BanV)
      {  
            Fase1 fas = (Fase1)getWorld();
            fas.IncrementaV();
      }
      Actor PR = getOneObjectAtOffset(0,0,PR.class);
      if(PR!=null)
      {
         getWorld().removeObject(PR);
         BanR = true;
      }
      if(BanR)
      {  
            for(int i=0; i<10; i++)
            { 
               getWorld().addObject(new Bala(),Greenfoot.getRandomNumber(500),550);
            }
            BanR=false;
       }
      Actor PB = getOneObjectAtOffset(0,0,PB.class);
      if(PB!=null)
      {
         getWorld().removeObject(PB);
         BanB = true;
      }
      if(BanB)
      {
         Fase1 fa=(Fase1)getWorld();
         fa.CreaCometa(4);
         BanB=false;
      }
      Actor Asteroide=getOneObjectAtOffset(0,0,Asteroide.class);
      if(Asteroide!=null)
      {
          Fase1 fas=(Fase1)getWorld();
          fas.removeObject(this);
          fas.DisminuyeVida();
          fas.addObject(new Nave(),250,500);
      }
      else
      {
           Actor Alien=getOneObjectAtOffset(0,0,Alien.class);
          if(Alien!=null)
          {
             Fase1 fas=(Fase1)getWorld();
             fas.removeObject(this);
             fas.DisminuyeVida();
             fas.addObject(new Nave(),250,500);
           }
           else
           {
                Actor Cometa =getOneObjectAtOffset(0,0,Cometa.class);
                if(Cometa!=null)
                {
                  Greenfoot.playSound("finJuego.mp3");
                  Greenfoot.stop();
                  Greenfoot.setWorld(new Menu());
                }
            }
      } 
    }
    
}
