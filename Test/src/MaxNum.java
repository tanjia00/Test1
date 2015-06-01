
public class MaxNum {

	public static void main(String[] args) {
		int [] list={    2,6,1,8,20,9} ;
		 

		for(int i=0;i<list.length;i++)
		{
		if (list[i]==8)
		  {
		     System.out.println("index is " +i+"  " +"value is:"  + list[i]);
		    break;
		    }
		}
		

		int [] list1={    2,6,1,8,20,9} ;
		int max=list1[0];
		for(int i=0;i<list.length;i++)
			
		{
		if (list[i]>max)
		  {
			max=list[i];
		     
		    }
	     }
		System.out.println("max num is : " +max);
		
		
		String s= "2000+456";
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(5,8));
		
		
		String s1= "17 + 2";
		System.out.println(s1.substring(0, 2));
		System.out.println(s1.substring(3,4));
		int a= Integer.parseInt(s1.substring(0, 2));
		int b=Integer.parseInt(s1.substring(5,6));
		 int c= a+b;
		 System.out.println(c);
		 
		 String string= String.valueOf(c);
		 System.out.println(string);
		 
		 
		for(int x=1;x<=10;x++)
		{
			System.out.println(x);
		}
		
		for(int x=10;x>=1;x--)
		{
			System.out.println(x);
		}
		}
		}


	


