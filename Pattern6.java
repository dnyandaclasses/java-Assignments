class Pattern6
{
	public static void main(String args[])
	{
		int i,j,a=1;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a);
				if(a==1)
				{
					a=0;
				}
				else
				{
					a=1;
				}
			}
			a=1;
			System.out.println();
		}
	}
}