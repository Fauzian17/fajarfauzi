import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class s here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  object1 extends Actor
{
    /**
     * Act - do whatever the s wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
     move(3);
         if(Greenfoot.getRandomNumber(100)<10)
         {
            turn(Greenfoot.getRandomNumber(90)-45); 
         }
     
    }
}