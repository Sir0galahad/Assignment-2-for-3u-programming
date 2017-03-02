/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author millc9988
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        Robot memes = new Robot(ez, 5, 5, Direction.EAST);
        //getting robot to 0 on the x axis
        while (memes.getAvenue() < 0) {
            while (!(memes.getDirection() == Direction.EAST)) {
                memes.turnLeft();
            }
            memes.move();
        }
        while (memes.getAvenue() > 0) {
            while (!(memes.getDirection() == Direction.WEST)) {
                memes.turnLeft();
            }
            memes.move();
        }
        
        //getting robot to 0 on y axis
        while (memes.getStreet() < 0) {
            while (!(memes.getDirection() == Direction.SOUTH)) {
                memes.turnLeft();
            }
            memes.move();
        }
        while (memes.getStreet() > 0) {
            while (!(memes.getDirection() == Direction.NORTH)) {
                memes.turnLeft();
            }
            memes.move();
        }
    }
}
