import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueSpaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueSpaceship extends Spaceship
{
    /**
     * Act - do whatever the BlueSpaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    
    public void act() 
    {
        this.drag(Blue.class, Red.class);
        this.score(Blue.class);
    }    
           
    public void score()
    {
        Actor spaceship;
        spaceship = getOneObjectAtOffset(0,0,Blue.class);
        if (spaceship != null)
        {
            Space.setScore(Space.getScore()+1);
            Greenfoot.delay(5);
            getWorld().removeObject(this);
        }
    }
}
