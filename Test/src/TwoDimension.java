
public class TwoDimension
{
	public static void main(String[]args) {

        int [][]a={{1,3,6}, 
        		{34,23,12},
        		{12,67}};
                  
for(int i=0;i<a.length;i++)
{
            for(int j=0;j<a[i].length;j++)
                  {
                 System.out.print(a[i][j]+" ");
                  }
System.out.println();

}

int []list={20,67,3,31,23};
int max=list[0];
for(int i=1;i<list.length;i++)
{
if(max<list[i])
      {
         max=list[i];
       }
 }
System.out.println("Maximun value is : " +max);
for(int i=10;i>=0;i=i-2)
{
      System.out.println(i);
    }
for(int i=2;i<=10;i=i+2)
{
      System.out.println(i);
    }
String []element={"red","blue", "green","purple","orange","pink"};
System.out.println("third element is : " +element[2]);
	}
}
