import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
Clase cuyo objeto es display del nivel
 */
public class Level extends Actor
{
    public void act() 
    {
        level();
    }    
    
    public void level()
    {
        setImage(new GreenfootImage("Level : "+ Space.getLevel(), 24 , Color.WHITE, Color.BLACK));        
    }
}
