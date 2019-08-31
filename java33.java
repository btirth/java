import java.util.*;
import java.io.*;

public class java33{
	public static void main(String[] args){
		int i = 10;
		Integer I = new Integer(i);
		
		System.out.println();
		Double D = Double.valueOf("1.0");
		System.out.println(D);
		
		System.out.println();
		Integer I2 = Integer.valueOf("1111", 2); 
        System.out.println(I2); 
        Integer I1 = Integer.valueOf("1111", 4); 
        System.out.println(I1); 
		
		Integer Int2 = new Integer(10);
		System.out.println(Int2);
		System.out.println();
		System.out.println("ByteValue: "+Int2.byteValue()); 
        System.out.println("ShortValue: "+Int2.shortValue()); 
        System.out.println("IntValue: "+Int2.intValue()); 
        System.out.println("LongValue: "+Int2.longValue()); 
        System.out.println("FloatValue: "+Int2.floatValue()); 
        System.out.println("DoubleValue: "+Int2.doubleValue());
	
		System.out.println("\n-18DCS008\nTirth Bharatiya");
	}
}