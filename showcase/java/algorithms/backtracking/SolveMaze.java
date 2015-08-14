/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntMaze;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author DELL
 */
public class Solution {

/*
 * Aim of this program is to solve the traditional ant maze problem using backtracking technique.
 * It is assumed that the ant can move in one of the two possible directions either SOUTH or EAST.
 */
  //  private char maze[][] = {
    //     {'.', '.', '.', '.'},
    //     {'.', '.', '#', '.'},
    //     {'.', '.', '.', '.'},
    //     {'.', '#', '#', '.'}
    //  };

    private char maze[][] = {
        {'.', '.', '.', '#'},
        {'.', '#', '#', '*'},
        {'.', '#', '.', '*'},
        {'.', '.', '.', '.'}
    };

    class Coordinates implements Comparable {

        private int x, y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int x) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Coordinates moveRight() {
            return new Coordinates(this.x, this.y + 1);
        }

        public Coordinates moveDown() {
            return new Coordinates(this.x + 1, this.y);
        }

        public String toString() {
            return ("X Coordinate : " + x + ", Y Coordinate : " + y);
        }

        public int compareTo(Object obj) {
            if (obj instanceof Coordinates == false) {
                throw new ClassCastException();
            }
            Coordinates other = (Coordinates) obj;
            if ((this.x == other.getX()) && (this.y == other.getY())) {
                return 0;
            } else {
                return 1;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Coordinates == false) {
                return false;
            }
            Coordinates other = (Coordinates) obj;
            if ((this.x == other.getX()) && (this.y == other.getY())) {
                return true;
            } else {
                return false;
            }
        }
    }

    private void storeAllValidPaths(Deque<Coordinates> stack, Coordinates current) {
        int curx = current.getX();
        int cury = current.getY();
        System.out.println("Checking :" + curx + ", " + cury);
        /*
         * The order of storing the elements is from SOUTH AND EAST
         */
     //if(cury - 1 >= 0) stack.addLast(new Coordinates(curx, cury - 1));
     /*
         * The above commented section is a serious bug and it is not all needed to have.
         * First it adds elements repeatedly and it changes the direction of the ant away from the intended purpose.
         * Good Catch! The bug got eliminated!
         */
        if (curx + 1 < maze.length && maze[curx + 1][cury] != '#') {
            //System.out.println("Adding :" + (curx + 1) + ", " + cury);
            stack.addLast(new Coordinates(curx + 1, cury));
        }
        if (cury + 1 < maze.length && maze[curx][cury + 1] != '#') {
            //System.out.println("Adding :" + curx + ", " + (cury + 1));
            stack.addLast(new Coordinates(curx, cury + 1));
        }
    }

    private boolean isPromisingRight(Coordinates current) {
        int curx = current.getX();
        int cury = current.getY();
        if (cury + 1 < maze.length && maze[curx][cury + 1] != '#') {
            return true;
        }
        return false;
    }

    private boolean isPromisingDown(Coordinates current) {
        int curx = current.getX();
        int cury = current.getY();
        if (curx + 1 < maze.length && maze[curx + 1][cury] != '#') {
            return true;
        }
        return false;
    }

    public void solveMaze() {
        System.out.println("Ant started from cell [0][0]");
        /*
         * Start from the cell 0,0 and stop the movement when either end reached or no possible way to go further.
         */
        Coordinates start = new Coordinates(0, 0);
        Coordinates end = new Coordinates(maze.length - 1, maze.length - 1);
        Deque<Coordinates> stack = new LinkedList<Coordinates>();
        /*
         * store the first element in the back of the stack.
         */
        stack.addLast(start);
        /*
         * Pop the stack and put all the reachable items into the stack back.
         */
        Coordinates next = null;
        int iter_count = 0;
        do {
            try {
                next = stack.removeLast();
            } catch (NoSuchElementException e) {
                next = null;
            }

            if (null == next) {
                System.out.println("No way to go further. Stopping iteration");
                return;
            }
            storeAllValidPaths(stack, next);
            ++iter_count;
        } while (false == next.equals(end));

        if (next.equals(end)) {
            System.out.println("Successfully reached destination [" + (maze.length - 1)
                    + "][" + (maze.length - 1) + "]" + " in " + iter_count + " moves. Hurray!");
        }
    }

    public void solveMaze2() {
        Coordinates start = new Coordinates(0, 0);
        Coordinates end = new Coordinates(maze.length - 1, maze.length - 1);
        if (true == solveByRecursion(start, end)) {
            System.out.println("Yes, we have a path to reach destination.");
        } else {
            System.out.println("No, we don't have any path. Let's create a new one.");
        }
    }

    public boolean solveByRecursion(Coordinates cur, Coordinates end) {
        System.out.println(cur);
        boolean isValid = false;
        if (cur.equals(end)) {
            return true;
        }
        if (true == isPromisingRight(cur)) {
            isValid = solveByRecursion(cur.moveRight(), end);
        }
        if (true == isPromisingDown(cur)) {
            isValid = isValid | solveByRecursion(cur.moveDown(), end);
        }
        return isValid;
    }
    
    public static void main(String[] args) {
        new Solution().solveMaze2();
    }

}
