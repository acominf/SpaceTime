import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    private boolean Ban = false;
    private boolean Ban2 = true;
    private boolean BanM = false;
    private boolean BanR = false;
    
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
       MovimientoNave();
       DisparaBala();
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
      Actor PR = getOneObjectAtOffset(0,0,PR.class);
      if(PR!=null)
      {
         getWorld().removeObject(PR);
         BanR = true;
      }
      if(BanR)
      {  
            for(int i=0; i<70; i++)
            { 
               getWorld().addObject(new Bala(),Greenfoot.getRandomNumber(500),550);
            }
            BanR=false;
       }
      
    } 
    public void MovimientoNave()
    {
        int y=getY();
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            y=y-2;
            setLocation(getX(),y);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y=y+2;
            setLocation(getX(),y);
        }
    }
    public void DisparaBala()
    {
        if(Ban && Greenfoot.isKeyDown("a"))
        {
           getWorld().addObject(new Bala(),getX(),getY());
           Ban =false;
        }
        if(!Ban && !Greenfoot.isKeyDown("a"))
        {
            Ban = true;
        }
    }
     public void DisparaMisil()
    {
        if(!Ban2 && !Greenfoot.isKeyDown("s"))
        {
           getWorld().addObject(new Misil(),getX(),getY());
           Ban2 =true;
        }
        if(Ban2 && Greenfoot.isKeyDown("s"))
        {
            Ban2 = false;
        }
    }
   
}
