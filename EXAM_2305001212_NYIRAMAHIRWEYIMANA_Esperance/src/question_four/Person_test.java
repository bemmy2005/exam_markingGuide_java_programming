package question_four;
//your reg number is wrong 2305001214, but on this project it is 2305001212
import java.util.Scanner;

public class Person_test {
	private static final Object s1 = null;


		public static void main(String[]args){
			Scanner input=new Scanner(System.in);
			int i=16;
			do{
		     Person p1=new Person ();
			System.out.println("enter your name");
			s1.name(input.next());
			System.out.println("enter your age");
			p1.setAge(input.next());
		
		    Person person=p1;
			i++;}while(i<16);
			System.out.println(p1 .toString());
			}
	}
			
			
			
		



		}
}
		
		
		
	




}


