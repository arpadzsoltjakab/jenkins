package hu.dpc.edu;

/**
 * Hello world!
 *
 */
public class App 
{
	private String name;
	
    public static void main( String[] args )
    {
        new App().run();
    }
	
	class lowercaseclass {
		
	}

	private void run() {
		System.out.println( "Hello World! " + name.charAt(2) );
		
		for (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
			}
		}
		while(true){
			
		}
		
		if(false) return;
		
		or (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
				i++;
				j++;
				i--;
			}
		}
		
	}
}