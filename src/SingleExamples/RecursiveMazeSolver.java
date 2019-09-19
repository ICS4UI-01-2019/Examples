/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleExamples;

/**
 *
 * @author lamon
 */
public class RecursiveMazeSolver {

    static final char WALL = 'W';
    static final char START = 'S';
    static final char END = 'E';
    static final char AVAILABLE = '.';
    static final char SEARCHED = 'X';
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a maze to solve
        // W - Wall
        // S - Start
        // E - End
        // . - Unexplored
        // X - Explored
        char[][] maze = {{'W','W','W','W','W','W','W'},
                         {'W','.','W','.','.','.','.'},
                         {'W','.','W','W','.','W','W'},
                         {'W','.','.','.','.','.','W'},
                         {'W','.','W','.','W','W','W'},
                         {'W','.','W','.','.','.','E'},
                         {'W','S','W','W','W','W','W'}};
        
        // variabls for where the start is
        int startRow = 6;
        int startCol = 1;
        
        // can we solve the maze?
        boolean solved = solveMaze(maze, startRow, startCol);
        System.out.println("Solved: " + solved);
    }

    private static boolean solveMaze(char[][] maze, int playerRow, int playerCol) {
        // are we at a invalid point? (off the maze)
        if(playerRow < 0 || playerRow >= maze.length || playerCol < 0 || playerCol >= maze[0].length){
            return false;
        }
        // is this a spot a wall
        else if(maze[playerRow][playerCol] == WALL){
            return false;
        }
        // is this a spot we have already tried?
        else if(maze[playerRow][playerCol] == SEARCHED){
            return false;
        }
        // did you find the finish?
        else if(maze[playerRow][playerCol] == END){
            printMaze(maze);
            return true;
        }
        // im at a valid spot, say i have visited it
        maze[playerRow][playerCol] = SEARCHED;
        // try all of the directions
        // if north works
        boolean north = solveMaze(maze,playerRow-1,playerCol);
        if(north){
            return true;
        }
        
        // see if east works
        // if east works
        boolean east = solveMaze(maze,playerRow,playerCol+1);
        if(east){
            return true;
        }
        
        // see if south works
        // if south works
        boolean south = solveMaze(maze,playerRow+1,playerCol);
        if(south){
            return true;
        }
        
        // see if west works
        // if west works
        boolean west = solveMaze(maze,playerRow,playerCol-1);
        if(west){
            return true;
        }
        
        // if I have reached this point, I have no solution here
        // set to unsearched
        maze[playerRow][playerCol] = AVAILABLE;
        // say I haven't found an answer to back track
        return false;
        
    }

    private static void printMaze(char[][] maze) {
        for(int row = 0; row < maze.length;row++){
            for(int col=0; col < maze[row].length; col++){
                System.out.print(maze[row][col] + " ");
            }
            System.out.println("");
        }
    }
    
    
}
