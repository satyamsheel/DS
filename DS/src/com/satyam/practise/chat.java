package satyamPractise;
 
import java.text.SimpleDateFormat;
import java.util.*;
public class chat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="";
		System.out.println("Hello There!!");
		System.out.println("Ask a Question or just type   bye   to exit");
		//What is the time?
		//What is the date today?
		//Start Timer
		//How are you?
		//Hello        How are you?       I am also good    OR    I am not good
		while(a!="bye") {
			 a=sc.nextLine();
			 if(a.equals("What is the time?")) {
				 String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
				 System.out.println("The time is "+timeStamp);
			 }
			 else if(a.equals("What is the date today?")) {
				 String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
				 System.out.println("The Date is "+timeStamp);
			 }
			 else if(a.equals("Start Timer")) {
				 long startTime = System.currentTimeMillis();
				 System.out.println("Tell me when to stop");
				 System.out.println("Type   Stop  to stop timer");
				 String in=sc.next();
				 
				 if(in.equals("Stop")) {
					 long endTime = System.currentTimeMillis();
					 long timeElapsed=endTime-startTime;
					 System.out.println("Time elapsed in milliseconds is: "+timeElapsed);
				 }
			 }else if(a.equals("Hello")) {
				 System.out.println("Hi there");
			 }else if(a.equals("How are you?")) {
				 System.out.println("I am good. What about you?");
				 String aa=sc.nextLine();
				 if(aa.equals("I am also good")) {
					 System.out.println("Glad to hear that");
				 }else if(aa.equals("I am not good")) {
					 System.out.println("I am always here to listen to you");
				 }
			 }
			 else {
				 System.out.println("Oops! I didn't get that");
			 }
		}
		System.out.println("Bye! Have a good day");
		sc.close();
	}

}
