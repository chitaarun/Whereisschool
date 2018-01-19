
 class School {

	
	
	int Roll;
	
	String Name;
	
	Float Mark;
	School(int R,String N, Float M){
		
		Roll=R;
		Name=N;
		Mark=M;
	}
		School(School s){
	
			Roll=s.Roll;
			Name=s.Name;
			Mark=s.Mark;
		}	
			void display()
			
			{
				System.out.println("Roll is :"+ Roll);
				System.out.println("Name is :"+ Name);
				System.out.println("Mark is :"+ Mark);
			}
			
		
			
	public static void main (String[]args){
		
	School s1 =  School (Roll,Name,Mark); //Default constructor invoke
	
	System.out.println("Record of s1 : ");
	
	s1.display();
	
	System.out.println();
	
	School s2 = new School(s1);//Copy constructor invoke
	
	System.out.println();
	System.out.println("Record of s2 : ");
	s2.display();
	System.out.println("\nBoth are same ...........");
	
	}
 
		
	
				
	}
			

}
