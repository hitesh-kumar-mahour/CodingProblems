package gfg;

class Index{
	int n;
	int x;
	int y;

	Index(int i, int m, int n){
		this.n=i;
		this.x=i/n;
		this.y=i%n;	
	}
}
public class BinarySearchSortedMatrix {

	// matrix m*n row sorted a[i][0]>=a[i-1][n-1] with duplicates
	// count target present in matrix
	
	
	//O(log(m*n))

	//1,2,3,4,5,6
	

	public static void main(String[] args) {
		int m=5,n=4;
		int[][] a = {  //0 1 2 3
						{1,2,3,4},//0
						{4,4,4,4},//1 
						{5,6,6,6},//2 
						{6,6,6,6},//3 
						{6,6,7,7} //4
					};
		
		int k=5;
		
		Index l = find_left(a, k, 0, m*n-1);

		Index r = find_right(a, k, 0, m*n-1);

		int ans = r.n+1-l.n;

		System.out.println(ans);
		
	}

	private static Index find_left(int[][] a, int k, int b, int e) {
		
		if(e<b)
			return null;
		
		
		Index mid = new Index((b+e)/2, a.length,a[0].length);
		
		if(a[mid.x][mid.y]==k){
			 Index left = find_left(a,k,b,mid.n-1);
			if(left == null)
				return mid;
			else 
				return left;
		}
		
		else if(a[mid.x][mid.y]>k){
			return  find_left(a,k,b,(b+e)/2-1);
		}
		else 
			return find_left(a,k,(b+e)/2+1,e);
	
	}
	
	private static Index find_right(int[][] a, int k, int b, int e) {
		
		if(e<b)
			return null;
		
		
		Index mid = new Index((b+e)/2, a.length,a[0].length);
		
		if(a[mid.x][mid.y]==k){
			 Index right = find_right(a,k,(b+e)/2+1,e);
			if(right == null)return mid;
			else return right;
		}
		
		else if(a[mid.x][mid.y]>k){
			return  find_right(a,k,b,(b+e)/2-1);
		}
		else 
			return find_right(a,k,(b+e)/2+1,e);
	
	}
	

}
