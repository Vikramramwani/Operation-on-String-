package pkg;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,c=0;
		Scanner obj = new Scanner(System.in);
		do
		{
			System.out.println("Enter Your Choice : \n");
			System.out.println("1. Reverse Number\n");
			System.out.println("2. Check pallindrome\n");
			System.out.println("3. Check Even/Odd\n");
			System.out.println("4. Check Prime\n");
			System.out.println("5. Exit\n");
			choice = obj.nextInt();
			switch(choice) 
			{
		        case 1:
		        	int n1,rv1=0;
		            System.out.println("Enter Number to be Reverse:");
		            n1 = obj.nextInt();
		            while(n1!=0)
		            {
		            	int r=n1%10;
		            	rv1=rv1*10 + r;
		            	n1=n1/10;
		            }
		            System.out.println("Reverse of Number is : "+rv1);
		            break;

		        case 2:
		        	int n2,rv2=0;
		            System.out.println("Enter number :");
		            n2 = obj.nextInt();
		            int a=n2;
		            while(n2!=0)
		            {
		            	int r=n2%10;
		            	rv2=rv2*10 + r;
		            	n2=n2/10;
		            }
		            if(a==rv2)
		            {
		            	System.out.println("Number is pallindrome!!");
		            }
		            else
		            {
		            	System.out.println("Number is not pallindrome!!");
		            }
		            break;

		        case 3:
		        	int n3 ;
	            	System.out.print("Enter Number : ");
	            	n3 = obj.nextInt();
		    		if(n3%2==0)
		    		{
		    			System.out.println("Number is even");
		    		}
		    		else
		    		{
		    			System.out.println("Number is odd");
		    		}
		    		break;
		        case 4:
		        	int n4,i,b=0;
		        	System.out.print("Enter Number : ");
	            	n4 = obj.nextInt();
		    		for(i=2 ; i<n4 ; i++)
		    		{
		    			if(n4%i==0)
		    			{
		    				b=0;
		    				break;
		    			}
		    			else
		    			{
		    				b=1;
		    			}
		    		}
		    		if(b==1)
		    		{
		    			System.out.println("Number is Prime Number");
		    		}
		    		else
		    		{
		    			System.out.println("Number is not Prime Number");
		    		}
		            break;
		        case 5:
		        	c=1;
		        	break;
		        default:
		            System.out.println("Enter Valid Choice!!!");
		            break;
			}
		}while(c!=1);
	}
}
