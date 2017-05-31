import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Letrero, esta clase colocar la imagen del texto de regresa en el escenario de ayuda.
 * 
 * @author (Miguel Vazquez ) 
 * @author (Carlos Reyna ) 
 * @version (1.0)
 */
public class Letrero extends Imagen
{
    /**
     * El letrero nos servira para poder regresar al menu 
     */
    public void act() 
    {
        // Add your action code here.
        Regresa();
    }
    
    /**
     * Este metodo, nos regresa al menu principal.
     */
    public void Regresa()
    {
         if(Greenfoot.isKeyDown("b"))
            {
                Greenfoot.setWorld(new Menu());
            }
    }
}
