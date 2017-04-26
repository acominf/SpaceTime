import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase1 extends World
{

    /**
     * Constructor for objects of class Fase1.
     * 
     */
    public Fase1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 550, 1); 
        addObject(new Nave(),250,500);
    }
}
