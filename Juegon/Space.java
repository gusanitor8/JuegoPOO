import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Space extends World
{
    
    //Getters y setters de la variable que lleva el puntaje del usuario       
    private static int score = 0;
    
    //Variable que lleva cuenta del nivel
    private static int level = 1;
    
    //metodo que debuelve el nivel actual
    public static int getLevel()
    {        
        if (score != 0){
            if(score%10 == 0){
                level = score/10;                 
            }
        }
        return level;
    }
    
    public static int getScore()
    {
        return score;
    }
    
    public static void setScore(int i)
    {
        score = i;
    }
    
    //Metodo creador de la clase Space
    public Space()
    {            
        super(1366, 768, 1); 
        prepare();
        setScore(0);
        Greenfoot.playSound("theme.mp3");
        for (int i = 0; i<=2; i++)
        {
            createB();
            createR();
        }
    }
    
    //Metodo para crear un objeto de la clase BlueSpaceship
    public void createB()
    {
        BlueSpaceship bluespaceship = new BlueSpaceship();
        addObject(bluespaceship,683,0);
        //bluespaceship.score();
    }
    
    //Metodo para crear un objeto de la clase RedSpaceship
    public void createR()
    {
        RedSpaceship redspaceship = new RedSpaceship();
        addObject(redspaceship,683,0);
    }
    
    //Prepara el mundo para poner cada objeto en su lugar correspondiente
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
        
        Level level = new Level();
        addObject(level, 77,67);
        
        //instancia de la clase Create
        Create create = new Create();
        addObject(create,0,0);

    }
}
