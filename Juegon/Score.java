import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        score();
        //
    }    
    
    public void score()
    {
        setImage(new GreenfootImage("Score : "+ Space.getScore(), 24 , Color.WHITE, Color.BLACK));
    }
}
