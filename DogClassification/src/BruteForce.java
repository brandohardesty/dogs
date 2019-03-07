import java.lang.ArrayList;
import java.lang.Math;

public class BruteForce {
	
	private int[] userInputs;
	private Dog[] dogList;
	
	BruteForce(int[] userInputs, Dog[] dogList){
		this.userInputs=userInputs;
		this.dogList=dogList;
	}
	
	private int[] compareCharacteristics() {
		ArrayList<int> comparisons=new ArrayList<int>();
		//For every dog breed
		for (Dog d : dogList) {
			//Go through all 12 characteristics
			for (int i; i<12; i++) {
				//Subtract 
				comparisons.add(Math.abs(userInputs.get(i)-(d.getAttributes()[i]));
			}
		}
		return comparisons;
	}
	
	
}
