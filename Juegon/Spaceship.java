import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{

    private boolean drag = false;
    private int rx = 0, ry = 0;
    
    public void drag(java.lang.Class cls, java.lang.Class cla)
    {
        if(Greenfoot.mouseDragged(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(!drag){
                drag = true;
                rx = getX() - mouse.getX();
                ry = getY() - mouse.getY();
            }else{
                setLocation(mouse.getX() + rx, mouse.getY() + ry);
            }
        }
        if(Greenfoot.mouseDragEnded(this))
        {
            drag = false;            
        }
        if (drag == false)
        {
            test(cls, cla);
        }
    }
   
     public void move(int n)
    {   
        int deg = Greenfoot.getRandomNumber(360);
        double rad = Math.toRadians(deg);
        int cx = (int) (n * 15 * Math.cos(rad));       
        int cy = (int) (n * 15 * Math.sin(rad)); 
       
        setLocation(getX() + cx, getY() + cy);        
    }
    
    public void test(java.lang.Class cls,java.lang.Class cla)
    {
        Actor square;
        square = getOneObjectAtOffset(0,0,cls);
        Actor lose;
        lose = getOneObjectAtOffset(0,0,cla);
        if (square != null)
        {
            move(0);
        }else if(lose != null){
            Greenfoot.stop();
            Greenfoot.setWorld(new EndGameScreen()); 
        }else{
            move(1);
        }
    }
    
    public void score(java.lang.Class clb)
    {
        Actor spaceship;
        spaceship = getOneObjectAtOffset(0,0, clb);
        if (spaceship != null)
        {
            Space.setScore(Space.getScore()+1);
            Greenfoot.delay(5);
            getWorld().removeObject(this);
        }
        
        if (Space.getScore() == 6)
        {
            Greenfoot.setWorld(new WinnerGameScreen());
            Greenfoot.stop();
        }
    }
}
