/*   Author : Dnyanda Engineering Classes
     Description:     
	1234567
	 234567
	  34567
	   4567
	    567
	     67
	      7
	     67
	    567
	   4567
	  34567
	 234567
	1234567 
*/
class Pattern5
{
	public static void main(String args[])
	{
		int i,j,a=1,s=0;
		for(i=1;i<=13;i++)
		{
			if(i<=7)
			{
				for(int k=1;k<=s;k++)
				{
					System.out.print(" ");		
				}
				for(j=a;j<=7;j++)
				{
					System.out.print(j);
					
				}
				a++;
				s++;
			}
			else
			{
				s--;
				for(int k=1;k<=s-1;k++)
				{
					System.out.print(" ");
				}
				a--;
				for(j=(a-1);j<=7;j++)
				{
					System.out.print(j);
				}	
			}
		
			System.out.println();
			
				
		}
	}
}
