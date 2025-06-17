import java.util.*;
class nQueens{
    static boolean isSafe(int[][] mat,int row, int col) {
        int n = mat.length;
        for (int i = 0; i < row; i++)
            if (mat[i][col] == 1)
                return false;
        for (int i = row - 1, j = col - 1; 
             		i >= 0 && j >= 0; i--, j--)
            if (mat[i][j] == 1)
                return false;
        for (int i = row - 1, j = col + 1;
             		j < n && i >= 0; i--, j++)
            if (mat[i][j] == 1)
                return false;
        return true;
    }
    static boolean placeQueens(int row, int[][] mat) {
        int n = mat.length;
        if (row == n)
            return true;
        for (int i = 0; i < n; i++) {
            if (isSafe(mat, row, i)) {
                mat[row][i] = 1;
                if (placeQueens(row + 1, mat))
                    return true;
                mat[row][i] = 0;
            }
        }
        return false;
    }
    static List<Integer> nQueen(int n) {
        int[][] mat = new int[n][n];
        if (placeQueens(0, mat)) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1) {
                        ans.add(j + 1);
                    }
                }
            }
            return ans;
        } 
      	else
            return Collections.singletonList(-1);
    }
    public static void main(String[] args) {
        int n = 4;
        List<Integer> ans = nQueen(n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}