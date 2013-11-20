package ph.edu.apc.package1;
import java.io.Serializable;

public class Student extends Object implements Runnable, Serializable{
	private String name;
	private String id;
	public void run(){
		for(int j=0;j<10;j++){System.out.println("j="+j); try {Thread.sleep(500);} 
		catch (InterruptedException e) { e.printStackTrace();}
		
		}	
		
		try{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(800);
		} catch (InterruptedException e){ e.printStackTrace();}
		
	}
	Student(){
		System.out.println("Student");	
		//new Student();
	}
	
	Student(int v1){
		//FOR ANIMATION and for Frames
		this("Hello");
		
		Thread t = new Thread(this);
		t.start();
		Thread t2 = new Thread(this);
		t2.start();	

		System.out.println("Student id:"+v1);
		
		try{
			for(int i=0;i<10;i++){System.out.println("i="+i); Thread.sleep(500);}
			//for(int j=0;j<10;j++){System.out.println("j="+j); Thread.sleep(500);}	
			System.out.println("Main Thread");
			Thread.sleep(500);
		}
		catch (Exception e){e.printStackTrace();}
	}
	
	Student(String s1){
		System.out.println("Student:"+s1);	
	}
	
	public static void main(String[] args) {
		//new Student();
		new Student(123);
	}
}
