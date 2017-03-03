/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city
        City kw = new City();
        //create a robots, one for each situation 
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
        Robot aries = new Robot(kw, 1, 0, Direction.EAST);
        // create the walls, one for each situation 
        new Wall(kw, 0, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);

        //create the things
        new Thing(kw, 0, 2);
        new Thing(kw, 0, 3);

        // thing for siuation 2 
        new Thing(kw, 1, 5);

        // first situation: using a for loop to count <-- to stop at the object
        for (int i = 0; i < 2; i = i + 1) {
            karel.move();
        }
        // second situation
        if(aries.frontIsClear()) {
            //do something
            int counter = 0;
            // move 4 times
            for (int i = 0; i < 4; i = i + 1) {
                // move         
                aries.move();
                                   
                }
                
            
            }
                    
        } 


    }

