package module5;

public class ForDemo {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			 //System.out.println(i);  if we write here syso it will first print 5 then break
			if(i==5)
				//break;
				continue; //if we write here  continue  it will  print upto 4 then continue after 5 5 it will not print
			System.out.println(i); //if we write here syso it will  print upto 4 then break 
		}
	}

}
