import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel; 
    int level = 1; 
    
    public MyWorld()
    {    
        super(600, 400, 1, false);
        
        Bear bear = new Bear();
        addObject(bear, 300, 300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 20, 30);
        
        createCherry();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void createCherry()
    {
        Cherry cherry = new Cherry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(cherry, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void spawnCherry()
    {
        Cherry cherry = new Cherry();
        cherry.setSpeed(level);
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0; 
        addObject(cherry, x, y); 
    }
}
