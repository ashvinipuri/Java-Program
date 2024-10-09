package collection;

public class Emp 
{
private int empNo;
private String name;
private double salary;


public void emp() {
	empNo=0;
    name = null;
	salary=0.0;
	
}


public Emp(int empNo, String name, double salary) {
	super();
	this.empNo = empNo;
	this.name = name;
	this.salary = salary;
}


public int getEmpNo() {
	return empNo;
}


public void setEmpNo(int empNo) {
	this.empNo = empNo;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Emp [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
}


  // contructor default,cons,para cons,getter,setter,tostring


}
