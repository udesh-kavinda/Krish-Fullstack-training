class test {
	{
		System.out.println("Empty block executed");
	}
	
	 test()
	{
		System.out.println("Constructor block executed");
	}

    
        static
	{
		System.out.println("Static block executed");
	}
	
    

}

public class ExecuteOder{
    public static void main(String[] args) {

		test t = new test();
        
    }
}