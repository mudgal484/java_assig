package Test;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaProvidedInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Predicate<Integer> mature = (i)->{
			return i>=18?true:false;
		};
		
		System.out.println(mature.test(20));
		
		//Consumer
		ArrayList<Integer> list = new ArrayList<Integer>();
		Consumer<Integer> consume = (i)->{
			list.add(i);
		};
		
		consume.accept(1);
		consume.accept(2);
		
		for(Integer x :list) {
			System.out.println(x);
		}
		
		//Supplier
		Supplier<String> supply = ()->{
			return new String("Hello");
		};
		
		System.out.println(supply.get());

		
	}

}
