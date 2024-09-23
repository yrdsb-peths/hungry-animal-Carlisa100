import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bear extends Actor
{
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
        }
    }
}
