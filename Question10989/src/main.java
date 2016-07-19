import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Max = sc.nextInt();
		
		int[] num = new int[Max];
		
		for(int i=0; i<Max; i++) {
			num[i] = sc.nextInt();
		}
		
		
		quickSort(num, 0, num.length - 1);
		
		for (int i : num) {
			System.out.print(i + " ");
		}
		
	}
		
	
	
	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}
	
	
}

