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

        // pick and move things
        while (true) {
            mae.move();
            mae.pickAllThings();
            mae.turnLeft();

            int counter = 0;
            counter = counter++;
            for (int i = 1; i < 4; i = i + 1) {

                mae.putThing();
                mae.move();

            }



            counter = counter--;

            mae.turnAround();
            mae.move();




        }
    }
}
