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
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        Robot memes = new Robot(ez, 4, 2, Direction.WEST);
        //setting up the road
        new Wall(ez, 1, 1, Direction.WEST);
        new Wall(ez, 1, 2, Direction.EAST);
        new Wall(ez, 2, 1, Direction.WEST);
        new Wall(ez, 2, 2, Direction.EAST);
        new Wall(ez, 3, 1, Direction.WEST);
        new Wall(ez, 3, 2, Direction.EAST);
        new Wall(ez, 4, 1, Direction.WEST);
        new Wall(ez, 4, 2, Direction.EAST);
        new Wall(ez, 5, 1, Direction.WEST);
        new Wall(ez, 5, 2, Direction.EAST);
        new Wall(ez, 6, 1, Direction.WEST);
        new Wall(ez, 6, 2, Direction.EAST);
        new Wall(ez, 7, 1, Direction.WEST);
        new Wall(ez, 7, 2, Direction.EAST);
        new Wall(ez, 8, 1, Direction.WEST);
        new Wall(ez, 8, 2, Direction.EAST);
        new Wall(ez, 9, 1, Direction.WEST);
        new Wall(ez, 9, 2, Direction.EAST);
        new Wall(ez, 10, 1, Direction.WEST);
        new Wall(ez, 10, 2, Direction.EAST);
        new Wall(ez, 10, 3, Direction.SOUTH);
        new Wall(ez, 4, 3, Direction.EAST);
        new Wall(ez, 10, 3, Direction.EAST);
        new Wall(ez, 1, 3, Direction.EAST);
        new Wall(ez, 9, 4, Direction.SOUTH);
        new Wall(ez, 9, 5, Direction.SOUTH);
        new Wall(ez, 9, 6, Direction.SOUTH);
        new Wall(ez, 9, 7, Direction.SOUTH);
        new Wall(ez, 9, 8, Direction.SOUTH);
        new Wall(ez, 9, 8, Direction.EAST);
        new Wall(ez, 8, 1, Direction.WEST);
        new Wall(ez, 8, 2, Direction.EAST);
        new Wall(ez, 9, 1, Direction.WEST);
        new Wall(ez, 9, 2, Direction.EAST);
        new Wall(ez, 8, 4, Direction.NORTH);
        new Wall(ez, 8, 5, Direction.NORTH);
        new Wall(ez, 8, 6, Direction.NORTH);
        new Wall(ez, 8, 7, Direction.NORTH);
        new Wall(ez, 8, 8, Direction.NORTH);
        new Wall(ez, 8, 8, Direction.EAST);
        new Wall(ez, 7, 3, Direction.EAST);
        new Wall(ez, 6, 3, Direction.EAST);
        new Wall(ez, 5, 4, Direction.SOUTH);
        new Wall(ez, 5, 4, Direction.NORTH);
        new Wall(ez, 5, 5, Direction.SOUTH);
        new Wall(ez, 5, 5, Direction.NORTH);
        new Wall(ez, 5, 6, Direction.SOUTH);
        new Wall(ez, 5, 6, Direction.NORTH);
        new Wall(ez, 5, 6, Direction.EAST);
        new Wall(ez, 3, 4, Direction.SOUTH);
        new Wall(ez, 3, 5, Direction.SOUTH);
        new Wall(ez, 3, 6, Direction.SOUTH);
        new Wall(ez, 3, 7, Direction.SOUTH);
        new Wall(ez, 3, 7, Direction.EAST);
        new Wall(ez, 2, 4, Direction.NORTH);
        new Wall(ez, 2, 5, Direction.NORTH);
        new Wall(ez, 2, 6, Direction.NORTH);
        new Wall(ez, 2, 7, Direction.NORTH);
        new Wall(ez, 2, 7, Direction.EAST);

    }
}
