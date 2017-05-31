import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.*;

/**
 * Write a description of class Fase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase1 extends World
{
    /**
     * Se crea la Fase 1 donde tendremos las primeras interacciones del juego 
     * 
     */
    public Vida Objvida;
    int c=3;
    int cont = 0;
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
        //Fases();
        
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
            int y = Greenfoot.getRandomNumber(150);
            addObject(A,x,y);
        }
        
    }
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
    public void CreaAlien(int num)
    {
        for(int i=0;i<num;i++)
        {
            Alien Al = new Alien();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(400);
            addObject(Al,x,y);
        }
        
    }
     public void CreaCometa(int num)
    {
        for(int i=0;i<num;i++)
        {
            Cometa C = new Cometa();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(150);
            addObject(C,x,y);
        }
    }
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
    public void IncrementaV()
    {
        c=3;
        DibujaVidas();
    }
    public void Fases()
   {
        cont++;
        if(cont==1 && cont < 70)
        {
            addObject(new VerdeB(),300,25);
        }
        else
        {
            if(cont > 70 && cont < 221)
            {
                 addObject(new AmarillaB(),380,25);
                 CreaAsteroides(1);
                 
            }
            else
            {
                if(cont >221)
                 {
                   addObject(new RojaB(),460,25);
                   CreaAsteroides(2);
                   CreaAlien(1);
                 }
            }
        }
        
    }
    public void muestraPunto()
    {
        String cadenA = "200";
        int numero;
        
        showText("Puntos: " + cont, 200,15);
        showText("+" + 1, 220,225);
        cont+= 1;
        showText("",220,225);
        
        try{
            //Abro el stream, el fichero debe existir
            FileReader fr=new FileReader("C:/Users/anggel_vkz/Desktop/SpaceTime1.0/Records.txt");
            //Leemos el fichero y lo mostramos por pantalla
            int valor = fr.read();
            
            //System.out.print("\n");
            while(valor!=-1){
                //System.out.print((char)valor);
                valor=fr.read();
            }
            
            //Cerramos el stream
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
        
        if(cont > (numero = Integer.parseInt(cadenA))){
                cadenA = Integer.toString(cont);
        }
        
         
                
        FileWriter file = null;
        try{
            file = new FileWriter("C:/Users/anggel_vkz/Desktop/SpaceTime1.0/Records.txt");//Establece la ruta donde se va a guardar
            PrintWriter fWrite = new PrintWriter(file);

            showText("Mejor Puntaje: "+ cadenA,90,50);
            fWrite.println(cadenA);
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
         
    }
}

