import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    GreenfootImage g1; 
    int score = 1;
    int damage = 0;
        
    MouseInfo m = Greenfoot.getMouseInfo();
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        movement();
               
        Actor actor = getOneIntersectingObject(Home.class);
        
        if( ((getOneIntersectingObject(Home.class) != null ) || 
             (getOneIntersectingObject(Side.class) != null ) || 
             (getOneIntersectingObject(Brick.class) != null) || 
             (getOneIntersectingObject(Side.class) != null )   ) &&  (damage < 100) )
        {
          Background.counter.add(1);
          Greenfoot.playSound("c4_beep2.wav");
          damage++;
        }
        
        /*Actor actor3 = getOneObjectAtOffset(0, 0, Sensor.class);
        if(actor3 != null)
        {
           GreenfootImage g1 = new GreenfootImage("You Win" , 40, Color.WHITE, Color.BLUE);
           setImage(g1);
           setLocation(300,200);
           Greenfoot.stop();
        }*/
       
        
        if (damage > 0 && damage<40)
        {
            setImage(new GreenfootImage("Damaged Car 1.png"));
        }
        else if (damage>=40 && damage<75)
        {
            setImage(new GreenfootImage("Damaged Car 2.png"));
        }
        else if (damage>=75 && damage<100)
        {
            setImage(new GreenfootImage("Damaged Car 3.png"));
        }
        else if (damage >= 100)
        {
            int x = this.getX();
            int y = this.getY();
            //getWorld().removeObject(this);
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion, x, y); 
        }
    }
    
    public void movement(){
      
        if(Greenfoot.isKeyDown("up"))
         setLocation(getX(), getY() - 1);
         
        if(Greenfoot.isKeyDown("down"))
         setLocation(getX(), getY() + 1);
                  
        if (Greenfoot.isKeyDown("left"))
         setLocation(getX() - 1, getY());
        
        if (Greenfoot.isKeyDown("right"))
         setLocation(getX() + 1, getY());
               
        if (Greenfoot.isKeyDown ("a"))  
         turn(-1);
        if (Greenfoot.isKeyDown ("s"))  
         turn(1);
                
        }
    
}
