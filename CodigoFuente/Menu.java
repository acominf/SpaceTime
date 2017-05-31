import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * Esta clase solamente nos muestra las opciones creando los botones y el indicador
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 550, 1); 
        addObject(new Marvin(),70,450);
        addObject(new Titulo(), 250,100); 
        addObject(new BotonJugar(), 150,250);
        addObject(new BotonAyuda(), 250,350);
        addObject(new Indicador(),50,250);
    }
   
}
