package recursion;

public class Maze {
public static int maze(int i, int j, int n, int m) {
	
	if(i == n || j == n) {
		return 0;
	}
	if(i == n-1 || j == n-1) {
		return 1;
	}
	int right = maze(i,j+1,n,m);
	int down = maze(i+1,j,n,m);
	return right+down;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		System.out.println(maze(0,0,n,m));
	}

}
