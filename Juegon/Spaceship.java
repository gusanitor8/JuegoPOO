import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spaceship extends Actor
{

    private boolean drag = false;
    private int rx = 0, ry = 0;
    
    //metodo que le da las naves la propiedad para ser arrastrada por el mouse 
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

    //Metodo que determina la direccion en la que se mueve cada nave
     public void move(int n)
     {   
        int deg = Greenfoot.getRandomNumber(360);
        double rad = Math.toRadians(deg);
        int cx = (int) (n * 15 * Math.cos(rad));       
        int cy = (int) (n * 15 * Math.sin(rad)); 
       
        setLocation(getX() + cx, getY() + cy);        
     }
    
    /*Metodo que determina bajo que condiciones se van a mover los objetos spaceship
      y como     
     */
    public void test(java.lang.Class cls,java.lang.Class cla)
    {
        Actor square;
        square = getOneObjectAtOffset(0,0,cls);
        Actor lose;
        lose = getOneObjectAtOffset(0,0,cla);
        if (square != null)
        {
            move(0);
            //hace que la nave se detenga si esta en el cuadrado de su color correspondiente
        }else if(lose != null){
            // Si una nave toca un cuadrado de un color que no corresponde el juego acaba
            Greenfoot.stop();
            Greenfoot.setWorld(new EndGameScreen()); 
        }else{
            //Si no se cumple ninguna de las condiciones anteriores la nave se mueve con normalidad
            move(1);
        }
    }
    
    /*Metodo que hace que las instancias de los objetos Spaceship desaparezcan
     y sumen al contador de puntaje, ademas de desplegar la pantalla de ganador
     */
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
            Greenfoot.stop();
            Greenfoot.setWorld(new WinnerGameScreen());  
            
        }
    }
}
