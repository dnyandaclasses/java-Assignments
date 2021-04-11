class Pattern7
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				if(i>1)
				{
					if(j==i)
					{
						for(int k=j-1;k>=1;k--)
						{
							System.out.print(k);
						}			
					}
				}
				
			}
			
			System.out.println();
		}
	}
}