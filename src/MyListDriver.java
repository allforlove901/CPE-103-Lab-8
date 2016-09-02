import java.util.Scanner;

public class MyListDriver {

	public static void main(String[] args) {
		
		boolean quit = false;
		MyList myList = new MyList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu of operations:");
		System.out.println("   - add........(enter the letter a)");
		System.out.println("   - find.......(enter the letter f)");
    	System.out.println("   - print......(enter the letter p)");
    	System.out.println("   - sum........(enter the letter s)");
    	System.out.println("   - quit.......(enter the letter q)");
    	
    	while(!quit){
    		System.out.println("Choose an option");
    		String input =  sc.nextLine();
    		
    		switch(input){
    		
    		case"a":
    			System.out.println("please enter a numerical value to add");
    			int store = Integer.parseInt(sc.nextLine());
        		myList.add(store);
    			System.out.println(store + " added");
    			break;
    			
    		case"f":
    			System.out.println("please enter a numerical value to find");
    			int store2 = Integer.parseInt(sc.nextLine());
    			if(myList.find(store2))
    				System.out.println("found");
    			else
    				System.out.println("not found");
    			break;
    			
    		case"p":
    			myList.print();
    			break;
    			
    		case"s":
    			myList.sum();
    			break;
    			
    		case"q":
    			System.out.println("quitting");
    			quit = true;
    			break;
    			
			default:
    			System.out.println("invalid choice");
    			break;
    		}
    	}
	}
}
