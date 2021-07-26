import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedSpaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedSpaceship extends Spaceship
{
    /**
     * Act - do whatever the RedSpaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        this.drag(Red.class, Blue.class);        
        this.score(Red.class);
    }    
}
