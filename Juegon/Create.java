import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
Esta clase lleva a cabo la funcion de crear instanciias de la clase Spaceship
Blue y SpaceshipRed cada cierto intervalo de tiempo
 */
public class Create extends Actor
{
    int contador = 0;
    public void act() 
    {
        creator();
    }    
    
    public void creator()
    {
        if (contador< 250){
            contador++;
        }else{
            for (int i = 0; i < 3; i++)
            {
                int n = Greenfoot.getRandomNumber(2);
                if (n == 0)
                {
                    BlueSpaceship bluespaceship = new BlueSpaceship();
                    getWorld().addObject(bluespaceship,683,0);  
                    contador = 0;                
                }else{                                
                    RedSpaceship redspaceship = new RedSpaceship();
                    getWorld().addObject(redspaceship,683,0);  
                    contador = 0;
                }
            }
        }
        
        
        
    }
}
