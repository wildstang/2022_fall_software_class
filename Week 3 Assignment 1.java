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
int widgetCount = 4





//code for your object goes below
public class Widget {
	private int divisor;
	private String response;
	
	public Widget(int myDivisor, String myResponse) {
		divisor = myDivisor;
		divisor = myResponse;
	}
	
	public String giveResponse(int num) {
		if num % divisor == 0 {
			return response;
		} else {
			return "";	
		}
	}
}

// Innitialize empty Widget array
Widget[] widgets = new Widget[widgetCount];

// Populate Widget Array
for (int i = 0; i < widgetCount; i++) {
	widgets[i] = new Widget(numbers[i], answers[i]);
}

//1 2  3   4  5    6
//1 2 FIZZ 4 BUZZ FIZZ

for (int num = 1; i <= length; num++) {
	String response = "";
		
	// Add widget responses if the number is divisible by widgets divisor
	for (int i = 0; i < widgetCount; i++) {
		response += widgets[i].giveResponse(num);
	}
	
	// No widget added their response
	if response.count == 0 {
		response = (String) 9;
	}
	
	// Add response to the answers
	answers[num - 1] =  response;
}

