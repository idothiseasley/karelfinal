import kareltherobot.*;
/**
 * driver class WindowDrive - write a description of the class here
 * 
 * @author jair easley
 * @version 10-26-15
 */
public class WindowDrive implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(5);
        World.readWorld("windows.kwld");
        World.setTrace(true);
        World.setVisible(true);
        
        WindowBot one= new WindowBot(7, 5, East, infinity);
        one.work();
    }
}
