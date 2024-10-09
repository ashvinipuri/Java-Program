package module6;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="100";
      String str1="200";
      String str2="100.77";
      String str3="200.88";
      System.out.println("totoal is"+(str+str1)); //total without wrapper class
      System.out.println("total is"+(Integer.parseInt(str)+// total integer 
    		  Integer.parseInt(str1)));
      
System.out.println("=========================");  //   total with double 
System.out.println("total is"+(Double.parseDouble(str2)+
		Double.parseDouble(str3)));
   

System.out.println("=========================");          // total with float
System.out.println("total is"+(Float.parseFloat(str2)+
		Float.parseFloat(str3)));
   
System.out.println("=========================");          
System.out.println(Byte.MAX_VALUE);                  // 127
System.out.println(Short.MAX_VALUE);
System.out.println(Integer.MAX_VALUE);
System.out.println(Long.MAX_VALUE);

System.out.println(Byte.MIN_VALUE);          // -128
     
   
	}
}
