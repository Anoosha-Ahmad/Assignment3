package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmaa1808
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a new city
        City wells = new City();
        //Create a robot
        Robot lily = new Robot(wells, 5, 1, Direction.EAST);
        //Create the hurdles 
        new Wall(wells, 5, 1, Direction.SOUTH);
        new Wall(wells, 5, 2, Direction.SOUTH);
        new Wall(wells, 5, 3, Direction.SOUTH);
        new Wall(wells, 5, 4, Direction.SOUTH);
        new Wall(wells, 5, 5, Direction.SOUTH);
        new Wall(wells, 5, 6, Direction.SOUTH);
        new Wall(wells, 5, 7, Direction.SOUTH);
        new Wall(wells, 5, 8, Direction.SOUTH);
        new Wall(wells, 5, 9, Direction.SOUTH);
        new Wall(wells, 5, 1, Direction.EAST);
        new Wall(wells, 5, 2, Direction.EAST);
        new Wall(wells, 5, 4, Direction.EAST);
        new Wall(wells, 5, 7, Direction.EAST);

        //Create the finish line (Thing)
        new Thing(wells, 5, 9);

        //loop
        while (true) {
            //ask robot if karel hit the wall
            //did karel hit a wall
            //if yes, jump over the hurdle
            if (!(lily.frontIsClear()) == true) {
                lily.turnLeft();
                lily.move();
                lily.turnLeft();
                lily.turnLeft();
                lily.turnLeft();
                lily.move();
                lily.turnLeft();
                lily.turnLeft();
                lily.turnLeft();
                lily.move();
                lily.turnLeft();


                //if no, keep on moving 


            } else if (lily.frontIsClear() == true) {
                lily.move();
            }
            // stop when robot reaches the finish line
            if (lily.canPickThing()) {
                break;

            }


        }




    }
}
