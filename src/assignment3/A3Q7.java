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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new city
        City squared = new City();

        // create a robot 
        Robot red = new Robot(squared, 3, 3, Direction.SOUTH);

        //create wall 
        new Wall(squared, 1, 1, Direction.WEST);
        new Wall(squared, 1, 1, Direction.NORTH);
        new Wall(squared, 1, 2, Direction.NORTH);
        new Wall(squared, 1, 2, Direction.EAST);
        new Wall(squared, 2, 1, Direction.SOUTH);
        new Wall(squared, 2, 1, Direction.WEST);
        new Wall(squared, 2, 2, Direction.EAST);
        new Wall(squared, 2, 2, Direction.SOUTH);

        new Wall(squared, 2, 4, Direction.WEST);
        new Wall(squared, 1, 4, Direction.WEST);
        new Wall(squared, 1, 4, Direction.NORTH);
        new Wall(squared, 1, 5, Direction.NORTH);
        new Wall(squared, 1, 5, Direction.EAST);
        new Wall(squared, 2, 5, Direction.EAST);
        new Wall(squared, 2, 4, Direction.SOUTH);
        new Wall(squared, 2, 5, Direction.SOUTH);

        new Wall(squared, 4, 1, Direction.WEST);
        new Wall(squared, 5, 1, Direction.WEST);
        new Wall(squared, 5, 1, Direction.SOUTH);
        new Wall(squared, 5, 2, Direction.SOUTH);
        new Wall(squared, 5, 2, Direction.EAST);
        new Wall(squared, 5, 1, Direction.SOUTH);
        new Wall(squared, 5, 1, Direction.SOUTH);
        new Wall(squared, 4, 2, Direction.EAST);
        new Wall(squared, 5, 1, Direction.SOUTH);
        new Wall(squared, 4, 1, Direction.NORTH);
        new Wall(squared, 4, 2, Direction.NORTH);

        new Wall(squared, 4, 4, Direction.NORTH);
        new Wall(squared, 4, 5, Direction.NORTH);
        new Wall(squared, 4, 5, Direction.EAST);
        new Wall(squared, 5, 6, Direction.EAST);
        new Wall(squared, 4, 5, Direction.NORTH);
        new Wall(squared, 4, 5, Direction.NORTH);
        
       











        // loop
        while (true) {
            // 
            for (int i = 1; i < 4; i = i + 1) {
                int counter = 0;
                if (counter < 4) {
                    red.move();
                    red.move();
                    red.move();


                }


            }
            red.move();


        }




    }
}
