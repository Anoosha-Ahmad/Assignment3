/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author ahmaa1808
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a new city
        City wells = new City();

        //create a robot
        Robot lily = new Robot(wells, 6, 6, Direction.WEST);

        //loop
        while (true) {
            // if on an avenue that is greater than 0 
            if (lily.getAvenue() > 0) {
                //move 
                lily.move();
                // otherwise break loop
            } else {
                break;
            }
        }
        // make robot turn right to face the North direction
        lily.turnLeft();
        lily.turnLeft();
        lily.turnLeft();
        while (true) {
            //if on street that is greater than 0
            while (lily.getStreet() > 0) {
                // turn right and move
                lily.move();
                break;
            }
        }




    }
}
