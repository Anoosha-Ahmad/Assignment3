/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class repeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // create new city
        City kw = new City();
        // create a robot
        RobotSE rob = new RobotSE(kw, 3, 1, Direction.SOUTH);
        //create rectangular room with walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        
        // loop
        while (true){
        
        // check all walls to see if there are exits 
            // if front is not clear, turn left 
            if (rob.frontIsClear()== true) {
            rob.turnLeft();
            
            if (rob.frontIsClear()== true ) {
                rob.move();
            
            
            
                    }
            
            // if front is not clear, move to check next wall for exit 
        else if (!rob.frontIsClear() == true) {
            rob.turnRight();
            rob.move();
        } 
        }
                
            
            
            
        }
         

    }
}
