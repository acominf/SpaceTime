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
        super(500, 550, 1); 
        Nave N = new Nave();
        addObject(N,250,500);
        int Pm=Greenfoot.getRandomNumber(9);
        if(Pm==7)
        {
          addObject(new PM(),Greenfoot.getRandomNumber(500),50);
        }
        if(Pm==4)
        {
          addObject(new PR(),Greenfoot.getRandomNumber(500),50);
        }
        CreaAsteroides(10);
    }
    public void CreaAsteroides(int num)
    {
        for(int i=0;i<num;i++)
        {
            Asteroide A = new Asteroide();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(50);
            addObject(A,x,y);
        }
        
    }
}
