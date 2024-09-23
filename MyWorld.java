import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1);
        Bear bear = new Bear();
        addObject(bear, 300, 300);
        
        Cherry cherry = new Cherry();
        addObject(cherry, 300, 0);
    }
}
