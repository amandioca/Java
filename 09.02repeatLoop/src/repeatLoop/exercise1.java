package repeatLoop;

public class exercise1 {
	
	public static void main(String[] args) throws InterruptedException 	{
		int n;
		
		for(n = 1000; n < 2000; n++)	{
			
			if(n % 11 == 5) {
				System.out.print(n + "\n");
				
				Thread.sleep(500);
			}
		}	
	}
}
