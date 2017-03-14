/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city
        City kw = new City();

        // create a robot
        Robot karel = new Robot(kw, 0, 3, Direction.WEST);

        // create the square made up of walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);

        // loop
        // specify the variable - repeat loop 8 times 
        for (int i = 0; i < 8; i = i + 1) {

            //move (three times) and then turn left ( when robot is at corner)
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();

        }

    }

}
