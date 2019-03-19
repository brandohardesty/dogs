import java.lang.ArrayList;
import java.lang.Math;

public class BruteForce {
	
	private int[] userInputs;
	private Dog[] dogList;
	ArrayList<Integer> comparisons;
	
	BruteForce(int[] userInputs, Dog[] dogList){
		this.userInputs=userInputs;
		this.dogList=dogList;
		this.comparisons=new ArrayList<Integer>();
	}
	
	private static compareCharacteristics() {
		//For every dog breed
		for (Dog d : dogList) {
			//Go through all 12 characteristics
			for (int i=0; i<12; i++) {
				//Subtract user dog characteristic from user inputs and take the absolute value
				comparisons.add(Math.abs(userInputs[i]-(d.getAttributes()[i])));
			}
		}
	}
	
	private void bubbleSort(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1]){
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
	            }
	} 
	
	private int findBestMatch() {
		compareCharacteristics();
		bubbleSort((Array)characteristics);
	}
	
}
