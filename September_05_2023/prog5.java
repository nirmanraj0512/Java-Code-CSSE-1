import java.io.*;
public class prog5
{
	ToyCollection Obj[];

	public void  Order1()throws IOException
	{
		int nos;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader (is);

		System.out.println("How Many Toy Details you want to accept");
		nos=Integer.parseInt(bf.readLine());

		Obj = new ToyCollection[nos];

		for(int i=0;i<nos;i++)
		{
			Obj[i]=new ToyCollection();
			Obj[i].acceptData();
		}
		for(int i=0;i<nos;i++)
		{
			Obj[i].displayData();
		}
		Obj[0].displayTotalAmount();
	}
	public static void main(String args[]) throws IOException
	{
		//calling order
		prog5 obj=new prog5();
		obj.Order1();
	}
}