package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a.length);
//		System.out.println(a[3]);  //array index out of bound exception
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(11.22);
		al.add("John");
		
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		for(int i =0; i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		al.add("max");
		
		System.out.println(al.size());
		
		ArrayList<String> as = new ArrayList<String>();
		
//		as.add(10);
		
		ArrayList<E> ar1 = new ArrayList<E>();
		ar1.add(0, null);
		ar1.add(1, null);
		
		for(int i=0;i<ar1.size();i++){
			System.out.println(ar1.get(i));
		}
		
		//How to define user defined array list
		
		Employee e1 = new Employee(1, "john", "java");
		Employee e2 = new Employee(2, "Mick", "C++");
		Employee e3 = new Employee(3, "Max", "C");
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		Iterator<Employee> it= ar2.iterator();
		
		while(it.hasNext()){
			
			Employee emp = it.next();
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.dept);
		}
		
		
		//addAll
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("iron man");
		ar3.add("stealth");
		ar3.add("Plain");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Locky");
		ar4.add("xman");
		ar4.add("Dwen");
		
		ar3.addAll(ar4);
		
		for(int i=0;i<ar3.size();i++){
			System.out.println(ar3.get(i));
		}
		
		
		//removeAll
		
		ar3.removeAll(ar4);
		for(int i=0;i<ar3.size();i++){
			System.out.println(ar3.get(i));
		}
		
		//retainAll
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("kim");
		ar5.add("con");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("kim");
		ar6.add("xion");
		
		ar5.retainAll(ar6);
		for(int i=0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		
		
	}

}
