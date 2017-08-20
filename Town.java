package postOffice;

import java.util.ArrayList;

public class Town {

	
	public static ArrayList<LetterBox> letterBoxesList = new ArrayList<>();
	
	
	public Town() {
	for (int i = 0; i < 25; i++) {
		this.letterBoxesList.add(new LetterBox(i+1));
	}
	}

	public ArrayList<LetterBox> getLetterBoxesList() {
		return letterBoxesList;
	}

	
}
