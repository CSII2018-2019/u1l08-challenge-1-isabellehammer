import java.util.Collections;

public class U1L08 {

	public static void main(String[] args) {
	
		//reverse the order without creating a second array
		//you can assign the array values when you declare it, but program should work for... 
		//...any array (changed/added values)
		//hint: write out algorithm in pseudocode
		
		int [] array = {1, 3, 5};
		
		int i = 0;
		
		
		for(i = 0; i < array.length; i++){
			array[i] = array[array.length -i -1];
			array[array.length -i -1] = array[i];
			System.out.println(array[i]);//whatever is here needs to save, remove, and replace the number
		}
		 
		
		
		

	}


}
