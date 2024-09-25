import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cherry extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y );
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() <= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
