// WildStang Fall Software Week 3 Assignment 1

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// We're now doing fizzbuzz extreme! Create your own object "Widget" that will handle each combination
// of phrases and numbers to be divisible by, and use them to run the same exercise as before for an
// unknown number of phrases. Use the "Widget" constructor to configure the available numbers and
// phrases. Then call a function in widget to fill in the answers array the same as before for every
// number from 1 until a given parameter length.
// E.G. normal Fizzbuzz would have the phrases array {"Fizz", "Buzz"} and numbers array of {3,5}


// overall code goes below
int length = 80; // this could be any number
int[] numbers = new int[]{3,5,7,9}; // this could be any length of positive interger numbers
String[] phrases = new String[]{"Fizz", "Buzz", "Mozz", "Wazz"}; // this could have any number of phrases
String[] answers = new String[length];






//code for your object goes below
public class Widget {
	private int fizz;
	private string buzz
	
	public Widget(int newFizz, string newBuzz){
		fizz = newFizz
		buzz = newBuzz
		}
	
	public int getFizz() {
		return fizz;
	}
		
	public int getBuzz(){
		return buzz;
		
	}
	public void setFizz(int newFizz) {
		fizz = newFizz
	}
	public void setBuzz(String newBuzz){
		buzz = newBuzz;
	}
}
