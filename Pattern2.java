/*   Author : Dnyanda Engineering Classes
     Description:     
	7654321
	765432
	76543
	7654
	765
	76
	7

*/
class Pattern2
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
