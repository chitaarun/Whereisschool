package class_Meterials;

public class Satish {
int a=75,b=25, z ;
public int getData()
{
	
	int a =75;
	return a ;
	
}

public void Sum()
{
	int a =75, b=25, z;
	z = a+b;
	System.out.println("The value of the sum is" + z);
	
}
	
public void Sum1 (int x,int y){ 
    // int a =75, b =25, z ;
 

    //This.a =x
    //This.b =y

a =x ;
b =y ;
z = a+b ;
System.out.println("This value of sum1 is " + z);

}

Satish objSum1 = new Satish();

 objSum1.Sum();

	

	public static void main (String[]args){
		Satish m = new Satish ();
		
	System.out.println("Hi bai value of a is =" +m .a);
	System.out.println("Hi bai value of a is =" +m.getData());
	
	m.Sum ();
	m.Sum1 (7,9);
	
	
}

}