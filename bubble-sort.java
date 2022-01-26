public class exam {

    public static void main(String[] args) {

    	int[] arr = {5, 2, 3, 4, 1};
    	
    	// bubble sort
    	for(int j=0; j<arr.length-1; j++) {
    		for(int i=0; i<arr.length-1-j; i++) {
    			if(arr[i] > arr[i+1]) {
        			int temp = arr[i];
        			arr[i] = arr[i+1];
        			arr[i+1] = temp;
        		}
    		}
    	}
    	
    	for(int i=0; i<arr.length; i++) {
    		System.out.printf("%d ", arr[i]);
    	}

    }
}
