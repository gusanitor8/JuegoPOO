import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WinnerGameScreen extends World
{

    //metodo constructor de la pantalla ganadora
    public WinnerGameScreen()
    {            
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
