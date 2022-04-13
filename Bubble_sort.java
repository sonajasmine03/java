package javaPrograms;

public class Bubble_sort {
	static void bubblesort(int[] arr) {
		int n =arr.length;
		int temp =0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap elements
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,60,35,2,45,320,5};
		System.out.println("Array before bubble sort");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		bubblesort(arr);
		//sorting array elements using bubble sort
		System.out.println("Array after bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		

	}

}
