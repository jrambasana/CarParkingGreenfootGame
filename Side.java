import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Side here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Side extends Actor
{
    /**
     * Act - do whatever the Side wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Car.class))
        {
            this.setImage("greenfoot2.png");
        }
    }    
}
