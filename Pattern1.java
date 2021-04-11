/*   Author : Dnyanda Engineering Classes
     Description:     
	1
	12
	123
	1234
	12345
	123456
	1234567
	123456
	12345
	1234
	123
	12
	1

*/
class Pattern1
{
	public static void main(String args[])
	{
		int i,j,a=0;
		for(i=1;i<=13;i++)
		{
			if(i<=7)
			{
				a++;
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
						
			}
			else
			{
				a--;
				for(j=1;j<=a;j++)
				{
					System.out.print(j);
				}	
			}
			System.out.println();
		}
	}
}
