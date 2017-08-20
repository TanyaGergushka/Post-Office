package postOffice;

import java.util.ArrayList;
import java.util.Collection;

public class Picker extends PostMan{

	private ArrayList<Letter> letterList = new ArrayList<>();
	
	protected void setAgeExperience() {
		this.setAgeExperience(0);
	}
	
	public ArrayList<Letter> getLetterList() {
		return letterList;
	}
	public void takeLetters (LetterBox box){
		this.letterList.addAll((Collection<? extends Letter>) box.getLetterInBox().clone());
		box.getLetterInBox().clear();
	}
	
	public void archivåsLetter (){
		for (int i = 0; i < letterList.size(); i++) {
			PostStation.setArchive(letterList.get(i));
		//	System.out.println(PostStation.getArchive().size());
			PostStation.setStorage(letterList.get(i));
	//		System.out.println(PostStation.getStorage().size());
		}
		
	}
}
