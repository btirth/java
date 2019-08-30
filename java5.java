class java5
{
	//void StringBuffer(StringBuffer a,StringBuffer b){
	void StringBuffer(String a,String b){
		int len = a.length();
		int count = 0;
		for (int i=0;i<len-1;i++){
			if (a.charAt(i)==b.charAt(i) && a.charAt(i+1)==b.charAt(i+1)){
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		java5 s= new java5();
	//	StringBuffer first = new StringBuffer("abc");
	//	StringBuffer second = new StringBuffer("abh");
	//	s.StringBuffer(first,second);
	s.StringBuffer("abc","abc");
		
	}
}