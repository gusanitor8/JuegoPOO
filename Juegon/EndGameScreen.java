import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EndGameScreen extends World
{

    //Metodo constructor de la pantalla GameOver
    public EndGameScreen()
    {            
        super(1366, 768, 1); 
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.BLACK);
        bg.fillRect(0,0,getWidth(), getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif", 60);
        bg.setFont(f);
        bg.setColor(Color.WHITE);
        String message = "GAME OVER";
        bg.drawString(message, getWidth()/2 - message.length()*20, getHeight()/2);
    }
}
