import java.util.Scanner;
class Fibonacci
{
	 public static void main(String[] args)
	 {
		 //accept how many fibonaccis needed
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.print("how many fibonaccis ? ");
		 int n=sc.nextInt();
		 int f1=0,f2=1;
		 
		 //take first two fibonaccis as 0 and 1
		 
		 System.out.print(" "+f1);
		 System.out.print(" "+f2);
		 
		 //find next fibonacci no.
		 int f=f1+f2;
		 
		 System.out.print(" "+f);
		 //already 3 fibonaccis are displayed. so count will start at 3
		 
		 int count =3;
		 while(count<n)
		 {
			 f1=f2;
			 f2=f;
			 f=f1+f2;
			 System.out.print(" " +f);
			 count++;
		 }
	 }
	
}