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
        RobotSE lisa = new RobotSE(house, 1, 1, Direction.EAST);

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
            //if robots front is clear ---> move and pick all things in way
            // move if clear
            while (lisa.frontIsClear() == true) {
                lisa.pickAllThings();
                lisa.move();
            }

            // pick all things in way
            while (lisa.canPickThing()) {
                lisa.pickAllThings();
            }

            // when robot is on avenue 1, move to the next street 
            while (lisa.getAvenue() == 1) {
                lisa.pickAllThings();
                lisa.turnLeft();
                lisa.move();
            }

            //when front isn't clear ---> turn arouund 
            while (!lisa.frontIsClear() == true) {
                lisa.turnAround();

            }

            //rob faces North to return back to its original position after picking up all things
            if (lisa.getStreet() == 3 && lisa.getAvenue() == 4) {
                lisa.turnRight();

                break;

            }
        }
        //rob moves back to its original position after picking up all things
        // while front is clear ---> move
        while (lisa.frontIsClear() == true) {
            lisa.move();
            // while front isn't clear ---> turn left
            if (!lisa.frontIsClear() == true) {
                lisa.turnLeft();
                // when rob arrives at original spot & posistion--> stop
                if (lisa.getStreet() == 1 && lisa.getAvenue() == 1) {
                    lisa.turnLeft();
                    break;
                }

            }

        }
    }
}
