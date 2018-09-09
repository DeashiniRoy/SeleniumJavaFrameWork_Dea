package demo;

public class ExceptionHandlin_Demo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void demo() throws Exception{
			
			//try{
				System.out.println("Hello World...\n");
				int i = 1/0;
				System.out.println("Completed");
			//}catch(Exception e){
			//	System.out.println(e.getMessage());
			//	System.out.println(e.getCause());
			//	e.printStackTrace();
				
			//}
			
		}
		
		

	}


