/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a new city
        City castle =new City();
        
        //create a robot
        Robot R = new Robot(castle, 0, 0, Direction.EAST); 
        
        //create the castle (walls)
        new Wall(castle, 1, 1, Direction.WEST);
        new Wall(castle, 1, 1, Direction.NORTH);
        new Wall(castle, 1, 1, Direction.EAST);
        new Wall(castle, 1, 1, Direction.SOUTH);
        //second box
        new Wall(castle, 1, 4, Direction.WEST);
        new Wall(castle, 1, 4, Direction.NORTH);
        new Wall(castle, 1, 4, Direction.EAST);
        new Wall(castle, 1, 4, Direction.SOUTH);
        // third box
        new Wall(castle, 4, 1, Direction.WEST);
        new Wall(castle, 4, 1, Direction.NORTH);
        new Wall(castle, 4, 1, Direction.EAST);
        new Wall(castle, 4, 1, Direction.SOUTH);
        // forth box
        new Wall(castle, 4, 4, Direction.WEST);
        new Wall(castle, 4, 4, Direction.NORTH);
        new Wall(castle, 4, 4, Direction.EAST);
        new Wall(castle, 4, 4, Direction.SOUTH);
        //big box 
        new Wall(castle, 2, 2, Direction.NORTH);
        new Wall(castle, 2, 2, Direction.WEST);
        new Wall(castle, 3, 2, Direction.WEST);
        new Wall(castle, 3, 2, Direction.SOUTH);
        new Wall(castle, 3, 3, Direction.SOUTH);
        new Wall(castle, 3, 3, Direction.EAST);
        new Wall(castle, 2, 3, Direction.EAST);
        new Wall(castle, 2, 3, Direction.NORTH);
        
                  
        //loop
        while(true){
            //move around 1/4 of the castle (loop-repeated)
            R.move();
            R.move();
            R.turnLeft();
            R.turnLeft();
            R.turnLeft();
            R.move();
            R.turnLeft();
            R.move();
            R.turnLeft();
            R.move();
            R.turnLeft();
            R.turnLeft();
            R.turnLeft();
            R.move();
            R.move();
            R.turnLeft();
            R.turnLeft();
            R.turnLeft();
                               
            }
            
            
            
            
           
         
        }
    
        
        
                
        
    }

