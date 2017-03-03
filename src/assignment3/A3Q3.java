/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new city
        City house = new City();
        //create a new robot 
        RobotSE rob = new RobotSE(house, 1, 1, Direction.EAST);
        // create litter (things)
        new Thing(house, 1, 2);
        new Thing(house, 2, 2);
        new Thing(house, 2, 3);
        new Thing(house, 3, 1);
        new Thing(house, 3, 4);
        new Thing(house, 2, 4);
        // create the walls for the room
        new Wall(house, 1, 1, Direction.NORTH);
        new Wall(house, 1, 2, Direction.NORTH);
        new Wall(house, 1, 3, Direction.NORTH);
        new Wall(house, 1, 4, Direction.NORTH);
        new Wall(house, 1, 1, Direction.WEST);
        new Wall(house, 2, 1, Direction.WEST);
        new Wall(house, 3, 1, Direction.WEST);
        new Wall(house, 3, 1, Direction.SOUTH);
        new Wall(house, 3, 2, Direction.SOUTH);
        new Wall(house, 3, 3, Direction.SOUTH);
        new Wall(house, 3, 4, Direction.SOUTH);
        new Wall(house, 1, 4, Direction.EAST);
        new Wall(house, 2, 4, Direction.EAST);
        new Wall(house, 3, 4, Direction.EAST);
        //loop 
        while (true) {
            //if robots front is clear move and pick all things in way
            // move if clear
            while (rob.frontIsClear() == true) {
                rob.pickAllThings();
                rob.move();
            }

            // pick all things in way
            while (rob.canPickThing()) {
                rob.pickAllThings();
            }
            while (rob.getAvenue() == 1) {
                rob.turnLeft();
                rob.move();
                rob.turnLeft();
                rob.pickAllThings();
                rob.move();
            }



            //turn arouund 

            while (!rob.frontIsClear() == true) {
                rob.turnAround();

            }
            // move to next street

            if (rob.getStreet() == 3 && rob.getAvenue() == 4) {
                rob.turnRight();

                break;

            }
        }
        if (rob.frontIsClear() == true) {
            rob.move();
            
            rob.turnLeft();












        }
    }
}
