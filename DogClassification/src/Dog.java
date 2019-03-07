
public class Dog {
	private int[] attributes;
	private String breed;
	
	public Dog(String breed, int[] attributes) {
		this.attributes = attributes;
		this.breed = breed;
		
	}
	public int[] getAttributes() {
		return attributes;
	}
	public String getBreed() {
		return breed;
	}

}
