import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bear extends Actor
{
    GreenfootSound bearSound = new GreenfootSound("bearroar.mp3.mp3"); 
    GreenfootImage[] idleRight = new GreenfootImage[8]; 
    GreenfootImage[] idleLeft = new GreenfootImage[8]; 

    
    String facing = "right"; 
    public void Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("Downloads/Elephant Sprite/tile000" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("Downloads/Elephant Sprite/tile000" + i + ".png");
            idleLeft[i].mirrorHorizontally(); 
            idleLeft[i].scale(100, 100);
        }
        setImage(idleRight[0]); 
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
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
        
        eat();
        
        animateElephant(); 
    }
    
    public void eat()
    {
        if(isTouching(Cherry.class))
        {
            removeTouching(Cherry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCherry();
            world.increaseScore();
        }
    }
}
