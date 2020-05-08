// Vikas Bhat
// Check if the given points in 2d array falls on a straight line
// O(n) Time complexity 
// O(1) Space complexity

public class CheckStraightLine {

    
	public static boolean checkStraightLine(int[][] coordinates) {
        int[] a = coordinates[1];
        int[] b = coordinates[0];
        float slopee = helper(a, b);

        for (int i = 1; i < coordinates.length; i++) {
            int[] c = coordinates[i];
            int[] d = coordinates[0];
            float s = helper(c, d);
            if (slopee != s) return false;
        }
        return true;
    }

    private static float helper(int[] a, int[] b) {
        if ((a[0] - b[0]) == 0) return 0;
        return (float)(a[1] - b[1]) / (a[0] - b[0]);
    }
    
    
	public static void main(String[] args) {
        CheckStraightLine checkStraightLine=new CheckStraightLine();
        int [][] arr= new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));
    }
}