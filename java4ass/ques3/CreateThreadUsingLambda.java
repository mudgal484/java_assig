package ques3;

public class CreateThreadUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable common = ()->{
			String threadname = Thread.currentThread().getName();
			System.out.println("Thread Name: "+threadname);
		};
		
		Thread t1 = new Thread(common);
		Thread t2 = new Thread(common);
		t1.start();
		t2.start();
	}

}
