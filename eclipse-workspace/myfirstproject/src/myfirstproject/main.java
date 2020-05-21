package myfirstproject;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt;
	      String[] str = new String[n];
	     for(int i=0;i<n;i++)
	     {
	       str[i]=sc.nextLine();
	     }
	     for(int i=0;i<n;i++)
	     {
	       System.out.println(str[i]);
	     }
	}

}

