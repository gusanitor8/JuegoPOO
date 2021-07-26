import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RedSpaceship extends Spaceship
{    
    public void act() 
    {
        this.drag(Red.class, Blue.class);        
        this.score(Red.class);
    }    
}
