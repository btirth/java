class java4{
	public static boolean array123(int arr[]){
	
		boolean flag=false;
		if (arr.length<3){
			return flag;	
		}
		
		for (int i=0;i<arr.length-2;i++){
			if (arr[i]==1 && arr[i+1]==2 && arr[i+2]==3){
				flag = true;
			}
		}
		return flag;
	}
	
	public static void main(String[] argc){
		int a[] = {1,2,3,4};
		int b[] = {2,3,1,2,3};
		int c[] = {1,4,3,5,2,4};

		System.out.println(array123(a));
		System.out.println(array123(b));
		System.out.println(array123(c));
		
		System.out.println("\n18DCS008\n-Tirth Bharatiya");
	}
	
}