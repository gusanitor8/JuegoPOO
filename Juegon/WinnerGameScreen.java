import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinnerGameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinnerGameScreen extends World
{

    /**
     * Constructor for objects of class WinnerGameScreen.
     * 
     */
    public WinnerGameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.GREEN);
        bg.fillRect(0,0,getWidth(), getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif", 60);
        bg.setFont(f);
        bg.setColor(Color.WHITE);
        String message = "YOU WIN";
        bg.drawString(message, getWidth()/2 - message.length()*20, getHeight()/2);
    }
}
