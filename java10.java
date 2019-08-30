class java9{
	public static void main(String[] args){
		//given points are
		double[][] points = {
			{-1,3},{-1,-1},{1,1},{2,0.5},{2,-1},{3,3},{4,2},{4,-0.5}
		};     
		
		double a=10000;   //any random number for max distance
		
		//closest points are
		double[][] b = {
			{0,0},{0,0}
		};
		
		//find the closest points
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i!=j){
					double x1 = points[i][0];
					double x2 = points[j][0];
					double y1 = points[i][1];
					double y2 = points[j][1];
				
					double distance = Math.hypot(x1-x2, y1-y2);
		
					//if distance is smaller than a then change closest points
					if(distance<a){
						a = distance;
						b[0][0] = x1;
						b[0][1] = y1;
						b[1][0] = x2;
						b[1][1] = y2;
					}
				}
				
			}
		}
		
		//print the closest points
		System.out.println("The closest two points are "+"("+b[0][0]+","+b[0][1]+") and ("+b[1][0]+","+b[1][1]+").");
		System.out.println("\n-Tirth Bharatiya\n18DCS008");
	}
}