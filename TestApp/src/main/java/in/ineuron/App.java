package in.ineuron;

/**
 * Hello world!
 *
 */
public class App 
{
	
	void demo() {
		System.out.println("demo1");
		System.out.println("demo1");
		System.out.println("demo1");
		System.out.println("demo1");
		demo2();
	}
	
	void demo2() {
		System.out.println("demo2");
		System.out.println("demo1");
		System.out.println("demo1");
		System.out.println("demo1");
		System.out.println("demo1");
		demo3();
	}
	
	void demo3() {
		System.out.println("demo3");
		System.out.println("demo1");
		System.out.println("demo1");
		System.out.println("demo1");
		System.out.println("demo1");
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App a=new App();
        a.demo();
    }
}
