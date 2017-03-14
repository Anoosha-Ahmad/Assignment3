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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create new city
        City kw = new City();

        // create a robot
        RobotSE tom = new RobotSE(kw, 2, 2, Direction.SOUTH);

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

        // move close to the wall
        tom.move();

        // loop
        while (true) {

            // check all walls to see if there are exits 
            // if front is clear turn right
            if (tom.frontIsClear() == true) {
                tom.turnRight();

                // if path is clear (when robot finds exit), move through exit and stop
                if (tom.frontIsClear() == true) {
                    tom.move();
                    break;
                }

                // if way is not clear, move on to check the next wall
            } else if (!(tom.frontIsClear() == true)) {
                tom.turnLeft();
                tom.move();

            }
        }

    }

}
