package questionfour;
import java.util.Scanner;

public class FileManage {
	public   FileManage  (){
		Scanner input= new Scanner(System.in);
		FileManage[] listofstudent = new FileManage[2];
		int i = 0;
		do{
			FileManage st1 = new FileManage();
			System.out.println("enter your fname");
			st1.setFname(input.next());
			System.out.println("enter your lname");
			st1.setFname(input.next());
			st1.setFname(null);
			listofstudent[i]=st1;
			System.out.println(st1.toString());
			i++;

		}while(i<=listofstudent.length-1);
	}

	private void setFname(String next) {
		
		
	}
	
}

