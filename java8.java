class java8{
	public static void main(String[] args){
		char Stu_ans[][] = {
			{'A','B','C','A','D','E','C','B','A','B'},
			{'B','A','C','D','D','E','C','A','A','B'},
			{'A','C','B','D','A','E','B','D','E','D'},
			{'D','E','C','A','B','E','B','B','A','B'},
			{'C','E','B','A','E','B','A','C','D','A'},
			{'C','A','A','D','C','A','B','A','E','D'},
			{'C','A','B','E','D','A','B','C','A','B'},
			{'A','B','C','D','E','A','E','A','B','B'}	
		};
		char ans[] = {'A','B','C','A','D','D','C','B','A','B'};
		int[] marks = {0,0,0,0,0,0,0,0};
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(Stu_ans[i][j]==ans[j]){
					marks[i]++;
				}
			}
		}
		for(int i=0;i<8;i++){
			System.out.println("Student:"+(i+1)+" => marks:"+marks[i]);
		}
		System.out.println("\n18DCS008\n-Tirth Bharatiya");
	}
}