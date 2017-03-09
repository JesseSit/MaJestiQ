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
	System.out.println("Array length 10: " + test(10));
	System.out.println("Array length 50: " + test(50));
	System.out.println("Array length 100: " + test(100));
	System.out.println("Array length 250: " + test(250));
	System.out.println("Array length 500: " + test(500));
	System.out.println("Array length 750: " + test(750));
	System.out.println("Array length 1000: " + test(1000));
    }
}
