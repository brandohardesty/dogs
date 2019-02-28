import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Dog> readData(File file) {
		ArrayList<String> lines = new ArrayList<String>();
		ArrayList<Dog> dogs = new ArrayList<Dog>();

		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				lines.add(reader.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] parts;
		for(String i: lines) {
			parts = i.split(",");
			int[] partsI = new int[parts.length];
			for(int j = 0; j<parts.length;j++) {
				partsI[j] = Integer.parseInt(parts[j]);
			}
			dogs.add(new Dog(partsI));
		}
		
		return dogs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
