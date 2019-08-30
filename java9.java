import java.util.Arrays;
class java9{
	public static void main(String[] args){
		int Sudoku[][] = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
				  {6, 7, 2, 1, 9, 5, 3, 4, 8},
				  {1, 9, 8, 3, 4, 2, 5, 6, 7},
				  {8, 5, 9, 7, 6, 1, 4, 2, 3},
				  {4, 2, 6, 8, 5, 3, 7, 9, 1},
				  {7, 1, 3, 9, 2, 4, 8, 5, 6},
				  {9, 6, 1, 5, 3, 7, 2, 8, 4},
				  {2, 8, 7, 4, 1, 9, 6, 3, 5},
				  {3, 4, 5, 2, 8, 6, 1, 7, 9}};
		int[] n = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(Sudoku[i][j]);
			}
			System.out.print("\n");
		}
		boolean flag=true;
		for(int x[]:Sudoku){
			Arrays.sort(x);
			for(int j=0;j<9;j++){
				if(x[j]!=n[j]){
					flag=false;
					break;
				}
			}
			
		}
		if(flag==true){
			int[] y={0,0,0,0,0,0,0,0,0};
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					y[j] = Sudoku[j][i];
				}
				Arrays.sort(y);
				for(int k=0;k<9;k++){
					if(y[k]!=n[k]){
						flag=false;
						break;
					}
				}
			}

		}
		if(flag==false){
			System.out.println("Answer is wrong!!");
		}
		else{
			System.out.println("Correct Answer!!");
		}
		System.out.println("\n18DCS008\n-Tirth Bharatiya");
		
		
	}
}