package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("michel");
		ll.add("Steve");
		ll.add("Mark");
		
		System.out.println(ll);
		
		ll.addFirst("Hayden");	
		System.out.println(ll);
		
		ll.addLast("Gilli");
		System.out.println(ll);
		
//		ll.get(0);
		System.out.println(ll.get(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.remove(0);
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		ll.set(0, "warner");
		System.out.println(ll);
		
		ll.addFirst("smith");
		System.out.println(ll);
		
		//for loop
		System.out.println("***********Using For Loop");
		for(int i=0;i<ll.size();i++){
			
			System.out.println(ll.get(i));
		}
		
		//using advance for loop
		System.out.println("**********Using Advance For Loop");
		for(String str:ll){
			System.out.println(str);
		}
		
		
		//using iterator
		System.out.println("********Using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//using while loop
		System.out.println("*******Using while loop");
		int num=0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
		
		
	}

}
