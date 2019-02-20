package def;

public class EmployeeSoultion {

	public static Employee employeeWithSecondLowestAge(Employee[] e){
		
		for(int i=0; i<e.length; i++){
			for(int j=i+1; j<e.length; j++){
				if(e[i].age<e[j].age){
					Employee temp = e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
		}
		return e[e.length-2];
		
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"aaa",22);
		Employee e2 = new Employee(2,"bbb",33);
		Employee e3 = new Employee(3,"ccc",55);
		Employee e4 = new Employee(4,"ddd",44);
		
		Employee[] e = {e1,e2,e3,e4};
		
		Employee x = employeeWithSecondLowestAge(e);
		
		System.out.println(x.id +" "+x.name+" "+x.age);
	}

}
