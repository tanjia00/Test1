
public class MaxMin {

	public static void main(String[] args) {
		
		int [] a={34,2,3,65,21};
		
		int min=a[0];
		int max=a[0];
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
		if(min>a[i])
		{
			min=a[i];
		
				
		}
		
	 else if (max<a[i])
		{
		max=a[i];	
		}
	 else if(a[i]==21)
	 {
		int extractElemn=a[i];
		 System.out.println("index of extract element"+i);
		 System.out.println("Extract number is:" +extractElemn);
	 }
		}
		
		System.out.println("Minimum number is:" +min);
		System.out.println("Maximum number is:" +max);
		//System.out.println("Extract number is:" +extractElemn);
		
		
		int []mynum = new int [5];
		mynum[0]=45;
		mynum[1]=78;
		mynum[2]=55;
		int fiesrNum=mynum[0];
		
		System.out.println(fiesrNum);
		

		Object abc[][]={{1,5,7},
				         {"abc",123,"kll"},
				          {"tanjia","t5678",789}
				         };
		for(int i=0;i<abc.length;i++)
		{
			for (int j=0;j<abc[i].length;j++)
					{
				 System.out.print( abc[i][j] +" ");
					}
			System.out.println();
		
		}
		
		 for(int i=1;i<=50;i++)
         {
               System.out.println(i);
             }
		
	}

	
}
