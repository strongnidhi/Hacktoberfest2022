import java.util.*;

public class n_queens
{
    boolean isSafe(int r,int c,int[][]board)
    {
        int n=board[0].length;
        for(int i=0;i<r;i++)
        {
            if(board[i][c]==1) return false;
            int j1=r-i+c;
            int j2=c-(r-i);
            if(j1<n&&board[i][j1]==1) return false;
            if(j2>=0&&board[i][j2]==1) return false;
        }
        return true;
    }
    void nqueen(int r,int n,int board[][])
    {
        if(r==n) 
        {
            System.out.println();
            for(int i=0;i<n;i++)
            {
                System.out.println();
                for(int j=0;j<n;j++)
                {
                    if(board[i][j]==1) System.out.print("  Q");
                    else System.out.print("  _");
                }
            }
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(r,i,board))
            {
                board[r][i]=1;
                nqueen(r+1,n,board);
                
                
                board[r][i]=0;
            }
        }
        
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n_queens ob=new n_queens();
        int board[][]=new int[n][n];
        ob.nqueen(0,n,board);
                System.out.println("No more possible solution");
    }
}
