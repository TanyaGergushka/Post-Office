package postOffice;

import java.util.ArrayList;
import java.util.Stack;

public class LetterBox extends Data{
	
	
	private ArrayList<Letter> letterInBox = new ArrayList();
 
	public LetterBox(int number) {
		this.setNameFirst("box");
		this.setNameLast(Integer.toString(number));
	}

	public ArrayList<Letter> getLetterInBox() {
		return letterInBox;
	}

	public void setLetterInBox(Letter shipment) {
		this.letterInBox.add(shipment);
	}
	

	
}
