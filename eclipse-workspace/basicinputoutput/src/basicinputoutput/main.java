package basicinputoutput;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Scanner sc1=new Scanner(System.in);
			       int n=sc1.nextInt();
			      
			      String[] str = new String[n];
			      Scanner sc2=new Scanner(System.in);
			     for(int i=0;i<=n;i++)
			     {
			       str[i]=sc2.nextLine();
			     }
		      for(int i=0;i<=n;i++)
		     {	
		       System.out.println(str[i]);
			   
		     }

			}

	}


