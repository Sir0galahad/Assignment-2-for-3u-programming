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
        Robot memes = new Robot(ez, 48, 75, Direction.EAST);
        while (memes.getAvenue() < 0) {
            if (memes.getDirection() == Direction.NORTH) {
                memes.turnLeft();
                memes.turnLeft();
                memes.turnLeft();
            }
            if (memes.getDirection() == Direction.SOUTH) {
                memes.turnLeft();
            }
            if (memes.getDirection() == Direction.WEST) {
                memes.turnLeft();
                memes.turnLeft();
            }
            memes.move();
        }
        while (memes.getAvenue() > 0) {
            if (memes.getDirection() == Direction.NORTH) {
                memes.turnLeft();
            }
            if (memes.getDirection() == Direction.SOUTH) {
                memes.turnLeft();
                memes.turnLeft();
                memes.turnLeft();
            }
            if (memes.getDirection() == Direction.EAST) {
                memes.turnLeft();
                memes.turnLeft();
            }
            memes.move();
            }
            while (memes.getStreet() < 0) {
                if (memes.getDirection() == Direction.EAST) {
                    memes.turnLeft();
                    memes.turnLeft();
                    memes.turnLeft();
                }
                if (memes.getDirection() == Direction.WEST) {
                    memes.turnLeft();
                }
                memes.move();
            }
            while (memes.getStreet() > 0) {
                if (memes.getDirection() == Direction.WEST) {
                    memes.turnLeft();
                    memes.turnLeft();
                    memes.turnLeft();
                }
                if (memes.getDirection() == Direction.EAST) {
                    memes.turnLeft();
                }
                memes.move();
            }
        }
    }
