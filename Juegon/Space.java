import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    private static int score = 0;
    
    public static int getScore()
    {
        return score;
    }
    
    public static void setScore(int i)
    {
        score = i;
    }
    
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 
        prepare();
       
        for (int i = 0; i<=2; i++)
        {
            createB();
            createR();
        }
    }
    
    public void createB()
    {
        BlueSpaceship bluespaceship = new BlueSpaceship();
        addObject(bluespaceship,683,0);
        bluespaceship.score();
    }
    
    public void createR()
    {
        RedSpaceship redspaceship = new RedSpaceship();
        addObject(redspaceship,683,0);
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Cuadro Rojo
        Red red = new Red();
        addObject(red,246,404);
        red.setLocation(232,384);
       
        
        //Cuadro Azul
        Blue blue = new Blue();
        addObject(blue,1128,396);
        blue.setLocation(1134,384);
        
        //Score Board
        Score score = new Score();
        addObject(score, 77,47);

    }
}
