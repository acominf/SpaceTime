import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.*;

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
    private boolean BanB = false;
    private boolean BanV = false;
    public String cadena;
    protected int cont = 0;
    public String Cadena = "adios";
    
    /**
     * Esta clase es la importante ya que esta es el usuario y con ella se haran muchas cosas 
     */
    public void act() 
    {
       
        // Add your action code here
       MovimientoNave();
       DisparaBala();
       Colisiones();
       //muestraPunto();
       //archivoTxt();
    }
    
    /*
    public void muestraPunto(){
        cadena = Integer.toString(cont);
        getWorld().showText("Mejor Puntaje: "+ cadena,20,50);
        
    }*/
  
    
    /*public void arcivoTxt(){
        String cadenA = "Hola";
        
        FileWriter file = null;
        try{
            file = new FileWriter("C:/Users/anggel_vkz/Desktop/Final/SpaceTime1.0/Records.txt");//Establece la ruta donde se va a guardar
            PrintWriter fWrite = new PrintWriter(file);
            
            //cadenA = Cadena;
            getWorld().showText(cadenA,250,10);
            //fWrite.println(cadena);
         }
         catch (IOException e){
             System.out.println("No pudo crearse el archivo, intenta otra ruta");
         }
         finally
         {
             try{
                 file.close();
            }
            catch(Exception e){
                System.out.println("El archivo no pudo guardarse, revisa si no esta abierto");
            }
         }
    }*/
    
    
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
