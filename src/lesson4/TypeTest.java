package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterable	it = new Iterable() {
						@Override
						public Iterator iterator() {
							return new Iterator() {
								char	item = 'a';

								@Override
								public boolean hasNext() {
									return item <= 'z';
								}

								@Override
								public Object next() {
									Object	result = item++;
									
									return result;
								}
							};
						}
					};
					
//			Iterator	i = it.iterator();
//			while (i.hasNext()) {
//				System.err.println("NExt="+i.next());
//			}

			for (Object item : it) {
				System.err.println("NExt="+item);
			}
			
			List<String>	l = new ArrayList<String>();
			
//			l.add(/*(String)*/123);
			l.add("abcde");
			
			for (String item : l) {
				System.err.println("Content: "+item);
			}
			
			Class	clmc = MyClass.class;
			
			System.err.println("Fields: "+Arrays.toString(clmc.getDeclaredFields()));
			MyClass<String,Integer>	mc = new MyClass<String,Integer>();
			MyClass<Object,?>		mc1 = new MyClass<>();
			
			mc.value = "12";
			
			String	a = /*(String)*/mc.value;
	}
}

class MyClass<T,V extends java.lang.Number> {
	T	value;	// java.lang.Object
	V	anotherValue;
	
	void print() {
		System.err.println("Value="+anotherValue.longValue());
	}
}

