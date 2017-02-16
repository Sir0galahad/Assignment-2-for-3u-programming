/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author millc9988
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        Robot memes = new Robot(ez, 1, 1, Direction.EAST);
        new Thing(ez, 1, 2);
        new Thing(ez, 1, 3);
        new Thing(ez, 1, 4);
        new Thing(ez, 1, 5);
        new Thing(ez, 1, 6);
        new Thing(ez, 1, 7);
        new Thing(ez, 1, 8);
        new Thing(ez, 1, 9);
        new Thing(ez, 1, 10);
        new Thing(ez, 1, 11);
        //pick up 7 things
        while (memes.countThingsInBackpack() < 7) {
            memes.move();
            memes.pickThing();
        }
        //move onto the section that you arent picking up
        memes.move();
        //if you can pick up things move forward
        while (memes.canPickThing()) {
            memes.move();
        }
    }
}
