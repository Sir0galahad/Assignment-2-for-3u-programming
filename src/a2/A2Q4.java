/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author millc9988
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        Robot memes = new Robot(ez, 4, 2, Direction.WEST);
        new Wall(ez, 1, 1, Direction.SOUTH);
        new Wall(ez, 1, 1, Direction.NORTH);
        new Wall(ez, 1, 1, Direction.EAST);
        new Wall(ez, 1, 1, Direction.WEST);
        new Wall(ez, 1, 4, Direction.SOUTH);
        new Wall(ez, 1, 4, Direction.NORTH);
        new Wall(ez, 1, 4, Direction.EAST);
        new Wall(ez, 1, 4, Direction.WEST);
        new Wall(ez, 4, 4, Direction.SOUTH);
        new Wall(ez, 4, 4, Direction.NORTH);
        new Wall(ez, 4, 4, Direction.WEST);
        new Wall(ez, 4, 4, Direction.EAST);
        new Wall(ez, 4, 1, Direction.SOUTH);
        new Wall(ez, 4, 1, Direction.NORTH);
        new Wall(ez, 4, 1, Direction.EAST);
        new Wall(ez, 4, 1, Direction.WEST);
        new Wall(ez, 2, 2, Direction.NORTH);
        new Wall(ez, 2, 2, Direction.WEST);
        new Wall(ez, 2, 3, Direction.NORTH);
        new Wall(ez, 2, 3, Direction.EAST);
        new Wall(ez, 3, 2, Direction.SOUTH);
        new Wall(ez, 3, 2, Direction.WEST);
        new Wall(ez, 3, 3, Direction.EAST);
        new Wall(ez, 3, 3, Direction.SOUTH);
        while (true) {
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            memes.move();
        }
    }
}
