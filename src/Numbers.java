import java.math.BigDecimal;


public class Numbers {
	//Working with Numbers
	
	byte b 		= 1;
	short s 	= 10;
	int i 		= 10;
	long l 		= 100L;
	float f 	= 150.5f;
	double deed 	= 150.5d;
	
	//Helper Class
	double doubleValue 	= 156.5d;
	Double doubleObj 	= new Double(doubleValue);
	
	//now you can call these methods
	byte myByteValue 	= doubleObj.byteValue();
	int myIntValue		= doubleObj.intValue();
	float myFloatValue	= doubleObj.floatValue();
	String myString		= doubleObj.toString();
	
	//For best numeric precision, create BigDecimal object from a String
	double d = 1115.37;
	String ds = Double.toString(d);
			
	BigDecimal bd = new BigDecimal(ds);
	public void printPayment() {
		System.out.println(bd.toString());  //1115.37
	}
}
