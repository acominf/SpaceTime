import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Clase Indicador, esta clase es para el indicar donde nos encontramos en el menu
 *por medio de un objeto.
 * 
 * @author (Miguel Vazquez) 
 * @author (Carlos Reyna) 
 * @version (1.0)
 */
public class Indicador extends Actor
{
    /**
     * Act - do whatever the Indicador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MoverIndicador();
        Eleccion();
       
    }  

    /**
    *Este metodo sirve para mover el indicador arriba y abajo en el menu.
    */ 
    public void MoverIndicador()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(140,350);
        }
           if(Greenfoot.isKeyDown("up"))
        {
            setLocation(50,250);
        }
    }
    
   /**
    *Este metodo sirve para acceder a la opcion del menu donde se encuentra el indicador.
    */
    public void Eleccion()
    {
        if(getX() == 140 && getY() == 350)
        {
            if(Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new Ayuda());
            }
        }
        if(getX() == 50 && getY() == 250)
        {
            if(Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.setWorld(new Fase1());
            }
        }
    }
}
