import kareltherobot.*;
/**
 * Write a description of class WindowBot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WindowBot extends Robot implements Directions, WindowCloser
{
    

    /**
     * Constructor for objects of class WindowBot
     */
    public WindowBot(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    
    public void closeWindow(){
        if(leftIsClear()){
            putBeeper();
            move();
        }
        
    }
    
    public void work(){
        putBeeper();
        move();
        while(!nextToABeeper()){
            moveToNextWindow();
            closeWindow(); 
        }
        pickBeeper();
    }

   
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
   
    private boolean leftIsClear()
    {
        boolean result=false;
        turnLeft();
        if(frontIsClear()){
            result=true;

        }
        turnRight();
        return result;

    }
    
    public void moveToNextWindow()
    {
         while(frontIsClear()&&!leftIsClear()){
             move();
            }
            if(!frontIsClear()){
                turnRight();
            }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
}
