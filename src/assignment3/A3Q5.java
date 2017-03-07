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
        //loop

        //specify the variable
        for (int i = 0; i < 10; i = i + 0) {
            while (true) {
                while (wanda.canPickThing() == true) {
                    wanda.pickThing();
                    wanda.move();
                    if (wanda.getAvenue()== 1){
                        break;
                    }
                    
                    
                }
                while (wanda.getAvenue()== 2){
                    wanda.putThing();
                    wanda.turnAround();
                    wanda.move();
                    break;
                    
                }
                

            }

        }

    }

}
