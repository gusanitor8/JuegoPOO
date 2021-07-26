import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Clase que corresponde a la nave azul
public class BlueSpaceship extends Spaceship
{
    //Se ejecutan los metodos heredados de Spaceship
    public void act() 
    {
        this.drag(Blue.class, Red.class);
        this.score(Blue.class);
    }    
                  
}
