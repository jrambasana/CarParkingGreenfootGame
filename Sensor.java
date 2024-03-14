import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sensor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sensor extends Actor
{
    
    /**
     * Act - do whatever the Sensor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor actor1 = getOneObjectAtOffset(0, 0, Car.class);
        if(actor1 != null){
            getWorld().removeObjects(getWorld().getObjects(Home.class));
            getWorld().removeObjects(getWorld().getObjects(Car.class));
            getWorld().removeObjects(getWorld().getObjects(Tree.class));
            getWorld().removeObjects(getWorld().getObjects(Side.class));
            getWorld().removeObjects(getWorld().getObjects(Brick.class));
            getWorld().showText("     ",45, 340);
            getWorld().showText("       ",526, 357);
            
            Greenfoot.playSound("win.wav");
            setImage("You-Win.png");
            setLocation(250,150);
            setRotation(0);

            Greenfoot.stop();
        }
    }    
}
