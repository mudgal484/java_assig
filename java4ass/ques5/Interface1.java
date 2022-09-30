package ques5;

public interface Interface1 {
		
void show();
	
	public default void display() {
		System.out.println("From Interface 1");
	}
	
}
