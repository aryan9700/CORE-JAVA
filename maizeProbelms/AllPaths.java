package maizeProbelms;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
       // allpath("", board, 0, 0);
       int[][] path=new int[board.length][board[0].length];
        allpathPrint("", board, 0, 0,path , 1);
        
    }
    static void allpath(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            //maze.length=[1d] maze[0].length =[2d]
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        //I am considering this block in my path
        maze[r][c]=false;
        if ( r < maze.length-1 ){
            allpath(p + 'D',maze , r+1, c);
        }
        if ( c < maze[0].length-1 ){
            allpath(p + 'R',maze , r, c+1);
        }
        if ( r > 0 ){
            allpath(p + 'U',maze , r-1, c);
        }
        if ( c > 0 ){
            allpath(p + 'L',maze , r, c-1);
        }
        //this line is where the function will be over
        //so before the function get remove also remove the changes done by that function
        maze[r][c]=true;
    }
    static void allpathPrint(String p,boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int[] arr: path){
                path[r][c]=step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if ( r < maze.length-1 ){
            allpathPrint(p + 'D',maze , r+1, c, path, step+1);
        }
        if ( c < maze[0].length-1 ){
            allpathPrint(p + 'R',maze , r, c+1, path, step+1);
        }
        if ( r > 0 ){
            allpathPrint(p + 'U',maze , r-1, c, path, step+1);
        }
        if ( c > 0 ){
            allpathPrint(p + 'L',maze , r, c-1, path, step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
