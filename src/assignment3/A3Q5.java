/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author Anoosha
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create city
        City tiny = new City();

        // create a robot
        RobotSE wanda = new RobotSE(tiny, 1, 1, Direction.EAST);

        // create 10 things
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        new Thing(tiny, 1, 1);
        
        // set a counter to track the number of things moved
        tiny.showThingCounts(true);
        
        //loop

        //specify the variable
        for (int i = 0; i < 10; i = i + 1) {
            
            // move one object to the sent avenue 10 times
            wanda.pickThing();
            wanda.move();
            wanda.putThing();
            wanda.turnAround();
            wanda.move();
            wanda.turnAround();

        }
        // move to the next avenue where there are all 10 things (that have been moved)
        wanda.move();






    }
}
