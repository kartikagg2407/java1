package backtracking;
public class ratInMaze{
    static void display(int[][] sol){
        for (int i=0 ;  i<sol.length ; i++){
            for (int j=0 ; j<sol[0].length ; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // System.out.println();
        // System.out.println();
    }
    static boolean raim(char[][] maze , int[][] sol , int i , int j){
        if (i == 3 && j == 3){
            sol[3][3] = 1;
            display(sol);
            return true;
        }
        if (i<4 && j<4 && j>=0 && i>=0 && sol[i][j] !=1 && maze[i][j] !='*'){
            sol[i][j] = 1;
            //right
            raim(maze, sol, i, j+1);
            //down
            raim(maze, sol, i+1, j);
            //up
            raim(maze, sol, i-1, j);
            //left
            raim(maze, sol, i, j-1);
            //backtracking
            sol[i][j] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze = {
                        {'0','*','0','*'},
                        {'0','*','0','0'},
                        {'0','0','0','0'},
                        {'*','*','0','0'}};
        int[][] sol = new int[4][4];
        int i = 0;
        // int n = 4;
        int j = 0;
        raim(maze, sol, i, j);
    }
}