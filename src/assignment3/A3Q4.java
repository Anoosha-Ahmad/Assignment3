/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
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
        // TODO code application logic here\
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

        //loop
        while (true) {
            //

            while (rob.isFacingSouth() && rob.frontIsClear() == true) {
                rob.move();
                if (!rob.frontIsClear() == true) {
                    rob.turnLeft();
                    rob.move();
                    rob.turnLeft();

                }

            }
            while (rob.isFacingNorth() && rob.frontIsClear() == true) {
                rob.move();
            
                    while (rob.getStreet() == 0 && rob.getAvenue() == 3)
                        break;
                

                if (!rob.frontIsClear() == true) {
                    rob.turnRight();
                    rob.move();
                    rob.turnRight();
                }
            }

            if (!rob.frontIsClear() == true) {
                rob.turnAround();
            }
              
            }

        }

    }

