import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1);
        Bear bear = new Bear();
        addObject(bear, 300, 300);
        
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 20, 20);
        
        createCherry();
    }
    
    public void createCherry()
    {
        Cherry cherry = new Cherry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(cherry, x, y);
    }
}
