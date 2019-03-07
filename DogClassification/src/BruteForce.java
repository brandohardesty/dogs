import java.util.ArrayList;

public class BruteForce {
	
	private int[] userInputs;
	private Dog[] dogList;
	
	BruteForce(int[] userInputs, Dog[] dogList){
		this.userInputs=userInputs;
		this.dogList=dogList;
	}
	
	private ArrayList<Integer> compareCharacteristics() {
		ArrayList<Integer> comparisons=new ArrayList<Integer>();
		//For every dog breed
		for (Dog d : dogList) {
			//Go through all 12 characteristics
			for (int i = 0; i<12; i++) {
				//Subtract 
				comparisons.add(Math.abs(userInputs[i]-(d.getAttributes()[i])));
			}
		}
		return comparisons;
	}
	
	
}
