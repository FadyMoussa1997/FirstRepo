import java.util.Scanner;
public class Jaggedassignment {
	public static void main(String[] args) {
		
		
		int [] [] students ;
		students = new int [25] [] ;
		
		int index = 0 ;
		int choice ;
		int numofexams ;
		Scanner sc = new Scanner (System.in) ;
		
		do {
			System.out.println("1- input grades for the studnet") ;
			System.out.println("2- display the exam average by student") ;
			System.out.println("3- display the exam average by exam") ;
			System.out.println("4- display the current class average for all exams") ;
			System.out.println("5- exit") ;
			choice = sc.nextInt();
			
			if (choice==1) {
				System.out.println("please select student (1,25)") ;
				index = sc.nextInt();
				System.out.println("now select number of exams") ;
				numofexams = sc.nextInt();
				students [index] = new int [numofexams] ;
				for (int i = 0 ; i < numofexams ; i++) {
					System.out.println("input grade") ;
					students [index] [i] = sc.nextInt();
					
				}
				}
			else if (choice==2) {
				System.out.println("please select student (1,25)") ;
				index = sc.nextInt();
				int sum = 0 ;
				int average =0;
				for (int j = 0 ; j < students[index].length ; j++) {
					sum = sum + students [index][j] ;
					average = sum / students[index].length ;
						
				}
				System.out.println("the sum of all this grades is "+sum) ;
				System.out.println("the average of all grades for the "+index +" student is "+average) ;
			}
			else if (choice==3) {
				System.out.println("please select student (1,25)") ;
				index = sc.nextInt();
				System.out.println("please select exam number") ;
				int examnum ;
				examnum = sc.nextInt() ;
				System.out.println("grade for student "+index+ " and exam "+examnum+ " is "+students[index][examnum]) ;
				
			}
			
			
		}while (choice!=5) ;
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}


}
