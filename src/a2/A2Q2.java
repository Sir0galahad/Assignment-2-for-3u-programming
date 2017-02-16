/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author millc9988
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        Robot memes = new Robot(ez, 1, 1, Direction.EAST);
        new Wall(ez, 1, 1, Direction.SOUTH);
        new Wall(ez, 1, 2, Direction.SOUTH);
        new Wall(ez, 1, 3, Direction.SOUTH);
        new Wall(ez, 1, 4, Direction.SOUTH);
        new Wall(ez, 1, 5, Direction.SOUTH);
        new Wall(ez, 1, 6, Direction.SOUTH);
        new Wall(ez, 1, 7, Direction.SOUTH);
        new Wall(ez, 1, 8, Direction.SOUTH);
        new Wall(ez, 1, 9, Direction.SOUTH);
        new Wall(ez, 1, 10, Direction.SOUTH);
        new Wall(ez, 1, 11, Direction.SOUTH);
        new Wall(ez, 1, 12, Direction.SOUTH);
        new Wall(ez, 1, 13, Direction.SOUTH);
        new Wall(ez, 1, 14, Direction.SOUTH);
        new Wall(ez, 1, 15, Direction.SOUTH);
        new Wall(ez, 1, 16, Direction.SOUTH);
        new Wall(ez, 1, 4, Direction.EAST);
        new Wall(ez, 1, 7, Direction.EAST);
        new Wall(ez, 1, 5, Direction.EAST);
        new Wall(ez, 1, 2, Direction.EAST);
        new Wall(ez, 1, 9, Direction.EAST);
        new Wall(ez, 1, 15, Direction.EAST);
        new Wall(ez, 1, 12, Direction.EAST);
        new Wall(ez, 1, 17, Direction.EAST);
        new Wall(ez, 1, 19, Direction.EAST);
        new Wall(ez, 1, 21, Direction.EAST);
        new Wall(ez, 1, 23, Direction.EAST);
        new Wall(ez, 1, 24, Direction.EAST);
        new Wall(ez, 1, 26, Direction.EAST);
        new Wall(ez, 1, 28, Direction.EAST);
        new Wall(ez, 1, 30, Direction.EAST);
        new Wall(ez, 1, 32, Direction.EAST);
        new Thing(ez, 1, 33);
        while (true) {
            if (memes.frontIsClear()) {
                memes.move();
            }
            else{
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            }
            if (memes.canPickThing()) {
                break;
            }
        }
    }
}
