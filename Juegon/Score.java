import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
Clase cuyo objeto es un display del puntaje
 */
public class Score extends Actor
{

    public void act() 
    {
        score();
    }    
    
    public void score()
    {
        setImage(new GreenfootImage("Score : "+ Space.getScore(), 24 , Color.WHITE, Color.BLACK));
        
    }
        
}
