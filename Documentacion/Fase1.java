import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase Fase 1 tiene herencia de la clase World y es la encargada de generar los distintos 
 *objetos que estaran en el juego.
 * 
 * @author (Miguel Vazquez ) 
 * @author (Carlos Reyna ) 
 * @version (1.0)
 */
public class Fase1 extends World
{
    
    public Vida Objvida;
    int c=3;
    
    /**
     * Constructor donde se crea la Fase 1 aqui tendremos las primeras interacciones del juego 
     * 
     */
    public Fase1()
    {   
        super(500, 550, 1); 
        Objvida=new Vida();
        Nave N = new Nave();
        addObject(N,250,500);
        Poder();
        CreaAsteroides(5);
        CreaAlien(3);
        DibujaVidas();
        //showText("Vidas:",50,10);
        //showText("Puntaje:",150,10);
        //showText("Mejor Puntaje:700000",350,10);
    }
    
    /**
     * Este metodo nos sirve para estar creando los asteroides que iran saliendo 
     * Recibe un numero que indica la cantidad de asteroides a crear 
     */
    public void CreaAsteroides(int num)
    {
        for(int i=0;i<num;i++)
        {
            Asteroide A = new Asteroide();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(100);
            addObject(A,x,y);
        }
        
    }
    
    
    /**
     * Metodo Poder este metodo muestra los distintos poderes que tendra el jugador
     */
    public void Poder()
    {
        int Pm=Greenfoot.getRandomNumber(200);
        if(Pm==7)
        {
          addObject(new PM(),Greenfoot.getRandomNumber(500),50);
          
        }
        if(Pm==4)
        {
          addObject(new PR(),Greenfoot.getRandomNumber(500),50);
        }
        if(Pm==11)
        {
            addObject(new PB(),Greenfoot.getRandomNumber(500),50);
        }
        if(Pm==22)
        {
            addObject(new PV(),Greenfoot.getRandomNumber(500),50);
        }
    }
    
    /**
     * Este metodo crea los aliens en el juego en distintas posiciones
     */
    public void CreaAlien(int num)
    {
        for(int i=0;i<num;i++)
        {
            Alien Al = new Alien();
            int x = Greenfoot.getRandomNumber(500);
            int y = Greenfoot.getRandomNumber(300);
            addObject(Al,x,y);
        }
        
    }
    
    /**
     * En este metodo se crea al cometa que destruira la nave en caso de que colisionen.
     */
     public void CreaCometa(int num)
    {
        for(int i=0;i<num;i++)
        {
            Cometa C = new Cometa();
            int x = Greenfoot.getRandomNumber(500);
            int y = Greenfoot.getRandomNumber(10);
            addObject(C,x,y);
        }
    }
    
    /**
     * Este metodo agrega las vidas en el juego.
     */
      public void DibujaVidas()
    {
        
        if(c==3)
        {
           
            addObject(new Vida(),50,25);
            addObject(new Vida(),90,25);
            addObject(new Vida(),130,25);
           
        }
       
        else
        {
            if(c==2)
            {
                
                addObject(new Vida(),50,25);
                addObject(new Vida(),90,25);
                addObject(new VidaMenos(),130,25);
            }
            else
            {
               if(c==1)
               {
               
                  addObject(new Vida(),50,25);
                  addObject(new VidaMenos(),90,25);
                  addObject(new VidaMenos(),130,25);
               }
            }
        }
    }
    
    /**
     * Este metodo nos disminuye las vidas de la nave jugador y cuando las vidas llegan a cero
     * nos saca del juego y nos regresa al menu principal.
     */
     public void DisminuyeVida()
    {
        c--;
       
        if(c==0)
        {
            Greenfoot.playSound("finJuego.mp3");
            Greenfoot.setWorld(new Menu());
            Greenfoot.stop();
        }
        DibujaVidas();
    }
    
    /**
     * Metodo incrementa vidas sirve para incrementar la vida de la nave cuando esta
     * tomo el poder de incremetar vida.
     */
    public void IncrementaV()
    {
        c=3;
        DibujaVidas();
    }
}

