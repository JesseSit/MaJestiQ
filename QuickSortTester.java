/*
Team Name: MaJestiQ
Team Members: Matteo Wong, Jesse Sit, Yuqi Wu

  This method takes an int value l and builds an array of size l. Then you run qsort to get the runtime for one execution and add it to a counter. Reshuffle and repeat for 10000 times. Divide the counter by 10000 to get the average runtime.

*/
public class QuickSortTester{
    
    public static long test(int l){
	int[] a = QuickSort.buildArray(l, l * 10);
	long counter = 0;
	for (int x = 0; x < 10000; x++){
	    long local = System.nanoTime();
	    QuickSort.qsort(a);
	    counter += System.nanoTime() - local;
	    QuickSort.shuffle(a);
	}
	return counter / 10000;
    }
    public static void main(String[] args){
	System.out.println("Array length 1: " + test(1));
	System.out.println("Array length 10: " + test(10));
	System.out.println("Array length 50: " + test(50));
	System.out.println("Array length 100: " + test(100));
	System.out.println("Array length 250: " + test(250));
	System.out.println("Array length 500: " + test(500));
	System.out.println("Array length 750: " + test(750));
	System.out.println("Array length 1000: " + test(1000));
	System.out.println("Array length 10000: " + test(10000));
    }
}
