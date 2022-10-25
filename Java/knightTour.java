// Java program for Knight Tour problem
class KnightTour {
    static int N = 8;

    /* A utility function to check if i,j are
    valid indexes for N*N chessboard */
    static boolean isSafe(int x, int y, int sol[][])
    {
        return (x >= 0 && x < N && y >= 0 && y < N
                && sol[x][y] == 0);
    }

    /* A utility function to print solution
    matrix sol[N][N] */
    static void printSolution(int sol[][])
    {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + "\t");
            System.out.println();
        }
    }
    
    
    static boolean solve(int[][]board,int c,int i,int j)
    {
        //System.out.println(c);
        if(c>64) return true;
        if(c==64)
        {
            printSolution(board);
            return true;
        }
        
        
        
        
        int movex[]={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int movey[]={ 1, 2, 2, 1, -1, -2, -2, -1 };
        
        for(int k=0;k<8;k++)
        {
                int i1=i+movex[k];
                int j1=j+movey[k];
                if(c==63)
                {
                    i1=i+2;
                    j1=j-1;
                }
                if(isSafe(i1,j1,board))
                {
                    board[i][j]=c+1;
                    if(solve(board,c+1,i1,j1))
                    return true;
                    else board[i][j]=0;
                }
        }
        
        /*if(solve(board,c+1,i+2,j+1)) return true;
        if(solve(board,c+1,i+2,j-1)) return true;
        if(solve(board,c+1,i-2,j+1)) return true;
        if(solve(board,c+1,i-2,j-1)) return true;
        if(solve(board,c+1,i+1,j+2)) return true;
        if(solve(board,c+1,i-1,j+2)) return true;
        if(solve(board,c+1,i+1,j-2)) return true;
        if(solve(board,c+1,i-1,j-2)) return true;*/
        
        //board[i][j]=0;
        return false;
    }
    
    static boolean solveKT()
    {
        int board[][]=new int[N][N];
        //board[0][0]=1;
        return solve(board,0,0,0);
    }

    /* Driver Code */
    public static void main(String args[])
    {
        // Function Call
        solveKT();
    }
}
// This code is contributed by Abhishek Shankhadhar
