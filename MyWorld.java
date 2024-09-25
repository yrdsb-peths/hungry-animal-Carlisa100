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
        addObject(scoreLabel, 40, 30);
        
        spawnFood();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void spawnFood() {
        int rand = Greenfoot.getRandomNumber(2);
        Food food;
        if(rand == 0) {
            food = new Apple();
        } else {
            food = new Cherry();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void increaseScore20()
    {
        score = score + 20; 
        scoreLabel.setValue(score);
    }

    public void level()
    {
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
}
