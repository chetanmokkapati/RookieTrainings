
public class MakeMath {
	public static void main(String []args) {
		// create an array with 4 indexes
		int myArray[] = new int[4];
		for (int i=0; i<myArray.length;i++){
			myArray[i] = i;
			System.out.println(myArray[i] + "");
		}
		
		// create a for loop that while i is less than the 
		// yourArray.length, then it will set the element to i at 
		// the index of yourArray that is equal to i
		// During this, print your array
		
		System.out.println("onto next");
		for(int i=0; i<myArray.length; i++){
			myArray[i] = i + 1;
			System.out.println(myArray[i] + "");
		}
		// for each in yourArray, add 1
		// During this, print yourArray
		
		System.out.println("onto next");
		int x=0;
		for (int i=0; i<myArray.length; i++){
			if( x<myArray[i] ){
				System.out.println(x + "");
				x=x+1;
		}
		}
		// create an integer x with value 0
		// while x is less than yourArray, add one to x
		// during this, print x
		
		System.out.println("onto next");
		for(int i=0; i<myArray.length; i++){
			if(myArray[i]<0)
				System.out.println("blah");
			else if(myArray[i]<1)
				System.out.println("bleh");
			else if(myArray[i]<2)
				System.out.println("blooh");
			else
				System.out.println("raaaaawr");
		}
		// for each element in yourArray
		// if each is less than 0 print blah
		// else if each is less than 1 print bleh
		// else if each is less than 2 print blooh
		// else print raaaaawr

		System.out.println("Done!");
		
		// after running, it should look something like:
		// 0
		// 1
		// 2
		// 3
		// onto next
		// 1
		// 2
		// 3
		// 4
		// onto next
		// 0
		// 1
		// 2
		// 3
		// onto next
		// bleh
		// blooh
		// raaaaawr
		// raaaaawr
		// Done!
	}
}
