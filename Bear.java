import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bear extends Actor
{
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
    }
    
    public void eat()
    {
        if(isTouching(Cherry.class))
        {
            removeTouching(Cherry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCherry();
            world.increaseScore();
            bearSound.play(); 
        }
    }
}
