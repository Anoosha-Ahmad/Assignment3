/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author ahmaa1808
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a city
        City wells = new City();
        // Create a robot
        Robot lily = new Robot (wells, 1,1, Direction.EAST); 
        // Create a row of things (path)
        new Thing(wells, 1, 2);
        new Thing(wells, 1, 3);
        new Thing(wells, 1, 4);
        new Thing(wells, 1, 5);
        new Thing(wells, 1, 6);
        new Thing(wells, 1, 7);
        new Thing(wells, 1, 8);
        new Thing(wells, 1, 9);
        new Thing(wells, 1, 10);
        new Thing(wells, 1, 11);
        
        //turn on thing labels
        wells.showThingCounts(true);
        
        ////loop
     while(true){
            // if there are things
        //      pick only the first seven up
            while(lily.canPickThing()){
                lily.pickThing();
                  }
            //move and pick up the first seven items in the backpack
                lily.move();
                if(lily.countThingsInBackpack()== 7){
                    break;
                }                                   
                }
       
        
               
     
            // if there are things
        //       do not pick them up, instead, move foward to the end of row
            while(lily.canPickThing()){
                lily.move(); 
            }
    }
}

                
            
            

            
               
                             
                
               
    
                
    
        
            