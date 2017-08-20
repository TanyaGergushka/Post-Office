package postOffice;

import java.util.Stack;

public class LetterBox extends Data{
	
	
	private Stack<AbsShipments> letterInBox = new Stack<>();
 
	public LetterBox(int number) {
		this.setNameFirst("box");
		this.setNameLast(Integer.toString(number));
	}

	public Stack<AbsShipments> getLetterInBox() {
		return letterInBox;
	}

	public void setLetterInBox(AbsShipments shipment) {
		this.letterInBox.push(shipment);
	}
	

	
}
