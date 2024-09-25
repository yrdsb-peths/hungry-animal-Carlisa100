import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bear extends Actor
{
<<<<<<< Updated upstream
=======
    GreenfootSound bearSound = new GreenfootSound("bear-roar.mp3"); 
    GreenfootImage[] idle = new GreenfootImage[8]; 
    
    public void Elephant()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("Downloads/Elephant Sprite/tile000" + i + ".png"); 
        }
        setImage(idle[0]); 
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = imageIndex + 1 % idle.length; 
    }
    
>>>>>>> Stashed changes
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
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
