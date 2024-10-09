package ArrayJava;

public class TestPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // creating an  array of object
		//int[] arr=new int[5];
		Person []arr =new Person[5];
		arr[0]=new Person("Adi",25,'M');
		arr[1]=new Person("priya",25,'F');
		arr[2]=new Person("Ash",25,'F');
		arr[3]=new Person("om",23,'M');
		arr[4]=new Person("viki",22,'F');
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getName()+" is "+arr[i].getAge()+"yrs old and gender is "+arr[i].getGender());
		}
	}

}
