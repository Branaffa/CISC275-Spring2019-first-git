package lab3;



public class Animal { 
	String name; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumLegs() {
		return numLegs;
	}
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	int numLegs;


}

class Dog extends Animal{

	public Dog(String name, int numLegs){ 
		this.name = name; this.numLegs = numLegs; 
		}

	public String toString() { 
		return name + ":" + numLegs; 
		}

	
}




	//a1.legs - a2.legs

