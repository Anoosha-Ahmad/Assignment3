/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author ahmaa1808
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new city 
        City major = new City();

        // create a robot
        RobotSE mae = new RobotSE(major, 0, 1, Direction.SOUTH);

        // set a counter to track the number of things moved
        major.showThingCounts(true);

        //create things
        new Thing(major, 1, 1);
        new Thing(major, 1, 1);
        new Thing(major, 1, 1);
        new Thing(major, 2, 1);
        new Thing(major, 2, 1);
        new Thing(major, 3, 1);
        new Thing(major, 3, 1);
        new Thing(major, 3, 1);
        new Thing(major, 3, 1);
        new Thing(major, 3, 1);
        new Thing(major, 4, 1);
        new Thing(major, 4, 1);
        new Thing(major, 4, 1);
        new Thing(major, 4, 1);

        // robot moves to the first group of items
        int counter = 0;
        mae.move();
        
        // robot picks all things
        while (mae.canPickThing()){
            if (mae.canPickThing()) {
            mae.pickAllThings();
            counter ++;
            }
            // turn left after picking things
            counter = mae.countThingsInBackpack();
            mae.turnLeft();
            
            //when you put things, move one space
            for (int i = 0; i < counter; i++){
                mae.putThing();
                mae.move();
                
            }
            // turn around
            mae.turnAround();
            for (int i = 0; i < counter ;){
                mae.move();
                counter--;
            }
            mae.turnLeft();
            mae.move();
                       
        }
      
        
        
                
                

            }



           


    }
        
    

