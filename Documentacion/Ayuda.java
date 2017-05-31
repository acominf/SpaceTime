import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase ayuda es la encargada de mostrar la informacion de como juego.
 * Las instrucciones de como mover la nave y como disparar.
 * 
 * @author (Miguel Vazquez ) 
 * @author (Carlos Reyna ) 
 * @version (1.0)
 */
public class Ayuda extends World
{
    private GreenfootImage Nave;



   /**
     * Constructor para los objetos de la clase Ayuda.
     * Agrega las imagenes de la informacion del juego donde se muestra las instrucciones 
     * y el objetivo del juego.
     */ 
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 550, 1); 
        addObject(new Letrero(),250,50);
        addObject(new MarvinAyuda(),100,350);
        addObject(new BotAyuda(),350,370);
        addObject(new TextAyud(),250,170);
        showText("Presiona B para Regresar al menu",250,520);
       
    }
  
}
