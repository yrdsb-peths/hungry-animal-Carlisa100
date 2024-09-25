import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bear extends Actor
{
    GreenfootSound bearSound = new GreenfootSound("bearroar.mp3.mp3"); 
    GreenfootImage[] idleRight = new GreenfootImage[8]; 
    GreenfootImage[] idleLeft = new GreenfootImage[8]; 
    
    String facing = "right"; 
    
    SimpleTimer animationTimer = new SimpleTimer();
    public Bear()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png" );
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally(); 
            idleLeft[i].scale(100, 100);
        }
        setImage(idleRight[0]); 
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex +1) % idleRight.length; 
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex +1) % idleLeft.length; 
        }
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        
        checkFoodCollision();
        
        animateElephant(); 
    }
    
    public void checkFoodCollision()
    {
        Actor actor = getOneIntersectingObject(Food.class); // Might be null
        if(actor != null) {
            Food food = (Food) actor;
            MyWorld world = (MyWorld) getWorld();
            
            world.increaseScore();
            getWorld().removeObject(food);
            world.spawnFood();
        }
        
    }
}
