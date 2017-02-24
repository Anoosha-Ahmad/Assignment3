/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


/**
 *
 * @author ahmaa1808
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // create city
       City winter = new City();
       
       // create a robot
       Robot karel = new Robot (winter, 0, 2, Direction.SOUTH);
       
       // create the sidewalks (walls)
       new Wall (winter, 0, 0, Direction.WEST);
       new Wall (winter, 1, 0, Direction.WEST);
       new Wall (winter, 2, 0, Direction.WEST);
       new Wall (winter, 3, 0, Direction.WEST);
       new Wall (winter, 4, 0, Direction.WEST);
       new Wall (winter, 5, 0, Direction.WEST);
       new Wall (winter, 6, 0, Direction.WEST);
       new Wall (winter, 7, 0, Direction.WEST);
       new Wall (winter, 8, 0, Direction.WEST);
       new Wall (winter, 9, 0, Direction.WEST);
       new Wall (winter, 0, 0, Direction.WEST);
       new Wall (winter, 0, 1, Direction.EAST);
       new Wall (winter, 1, 1, Direction.EAST);
       new Wall (winter, 2, 1, Direction.EAST);
       new Wall (winter, 3, 1, Direction.EAST);
       new Wall (winter, 4, 1, Direction.EAST);
       new Wall (winter, 5, 1, Direction.EAST);
       new Wall (winter, 6, 1, Direction.EAST);
       new Wall (winter, 7, 1, Direction.EAST);
       new Wall (winter, 8, 1, Direction.EAST);
       new Wall (winter, 9, 1, Direction.EAST);
       new Wall (winter, 0, 2, Direction.EAST);
       new Wall (winter, 1, 3, Direction.NORTH);
       new Wall (winter, 1, 4, Direction.NORTH);
       new Wall (winter, 1, 5, Direction.NORTH);
       new Wall (winter, 1, 6, Direction.NORTH);
       new Wall (winter, 1, 6, Direction.EAST);
       new Wall (winter, 2, 6, Direction.EAST);
       new Wall (winter, 1, 4, Direction.NORTH);
       new Wall (winter, 2, 6, Direction.SOUTH);
       new Wall (winter, 2, 5, Direction.SOUTH);
       new Wall (winter, 2, 4, Direction.SOUTH);
       new Wall (winter, 2, 3, Direction.SOUTH);
       new Wall (winter, 2, 4, Direction.SOUTH);
       new Wall (winter, 2, 3, Direction.SOUTH);
       new Wall (winter, 3, 2, Direction.EAST);
       new Wall (winter, 4, 3, Direction.NORTH);
       new Wall (winter, 4, 4, Direction.NORTH);
       new Wall (winter, 4, 5, Direction.NORTH);
       new Wall (winter, 4, 5, Direction.NORTH);
       new Wall (winter, 1, 4, Direction.NORTH);
       new Wall (winter, 4, 5, Direction.EAST);
       new Wall (winter, 4, 5, Direction.SOUTH);
       new Wall (winter, 4, 4, Direction.SOUTH);
       new Wall (winter, 4, 3, Direction.SOUTH);
       new Wall (winter, 5, 2, Direction.EAST);
       new Wall (winter, 6, 2, Direction.EAST);
       new Wall (winter, 7, 3, Direction.NORTH);
       new Wall (winter, 7, 4, Direction.NORTH);
       new Wall (winter, 7, 5, Direction.NORTH);
       new Wall (winter, 7, 6, Direction.NORTH);
       new Wall (winter, 7, 7, Direction.NORTH);
       new Wall (winter, 7, 7, Direction.EAST);
       new Wall (winter, 8, 7, Direction.EAST);
       new Wall (winter, 8, 7, Direction.SOUTH);
       new Wall (winter, 8, 6, Direction.SOUTH);
       new Wall (winter, 8, 5, Direction.SOUTH);
       new Wall (winter, 8, 4, Direction.SOUTH);
       new Wall (winter, 8, 3, Direction.SOUTH);
       new Wall (winter, 9, 2, Direction.EAST);
       new Wall (winter, 9, 2, Direction.SOUTH);
       
       // create the snow (things) on the sidewalks
       new Thing(winter, 0, 1);
       new Thing(winter, 1, 0);
       new Thing(winter, 2, 0);
       new Thing(winter, 3, 0);
       new Thing(winter, 3, 1);
       new Thing(winter, 4, 0);
       new Thing(winter, 5, 1);
       new Thing(winter, 7, 0);
       new Thing(winter, 7, 1);
       new Thing(winter, 8, 1);
       new Thing(winter, 9, 1);
       new Thing(winter, 9, 0);
       new Thing(winter, 1, 2);
       new Thing(winter, 2, 2);
       new Thing(winter, 4, 2);
       new Thing(winter, 7, 2);
       new Thing(winter, 1, 3);
       new Thing(winter, 1, 4);
       new Thing(winter, 1, 5);
       new Thing(winter, 2, 4);
       new Thing(winter, 2, 6);
       new Thing(winter, 4, 3);
       new Thing(winter, 4, 4);
       new Thing(winter, 7, 3);
       new Thing(winter, 8, 3);
       new Thing(winter, 8, 4);
       new Thing(winter, 8, 6);
       new Thing(winter, 7, 7);
       new Thing(winter, 0, 3);
       new Thing(winter, 0, 4);
       new Thing(winter, 0, 6);
       new Thing(winter, 1, 7);
       new Thing(winter, 3, 4);
       new Thing(winter, 3, 6);
       new Thing(winter, 4, 6);
       new Thing(winter, 4, 7);
       new Thing(winter, 5, 7);
       new Thing(winter, 5, 5);
       new Thing(winter, 6, 4);
       new Thing(winter, 6, 6);
       new Thing(winter, 9, 3);
       new Thing(winter, 9, 4);
       new Thing(winter, 9, 6);
       
       // did not finish the challenge
       
       
       
       
       
              
       
   
       
       
       
      }
       
               
    }

