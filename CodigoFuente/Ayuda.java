import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{

    /**
     * Constructor for objects of class Ayuda.
     * Muestra las instrucciones y el objetivo del juego
     */
    private GreenfootImage Nave;
    
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
