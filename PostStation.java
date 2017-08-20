package postOffice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;



public class PostStation {

	private static ArrayList<PostMan> postMans = new ArrayList<>();
	private static ArrayList<Picker> picker = new ArrayList<>();
	private static ArrayList<AbsShipments> storage = new ArrayList<>();
	private static ArrayList <AbsShipments> archive = new ArrayList<>() ;
	
	public PostStation() {
		for (int i = 0; i < 5; i++) {
			setPicker(new Picker());
			setPostMans(new PostMan());
		}
		
	}
	
public static ArrayList<PostMan> getPostMans() {
	return postMans;
}

	public void setPostMans(PostMan postMans) {
		this.postMans.add(postMans);
	}

	public ArrayList<Picker> getPicker() {
		return picker;
	}

	public void setPicker(Picker picker) {
		this.picker.add(picker);
	}

	public static ArrayList<AbsShipments> getStorage() {
		return storage;
	}
	public static void setStorage(AbsShipments storage) {
		PostStation.storage.add(storage);
	}
	public static ArrayList<AbsShipments> getArchive() {
		return archive;
	}
	
	public static void setArchive(AbsShipments archive) {
		PostStation.archive.add(archive);
	}
	
	public static void fullStorage (){
		int start = 0;
		int stop = 5;
		if (PostStation.storage.size() <= 50){
			for (int i = 0; i < picker.size(); i++) {
				for (int j = start; j < stop; j++) {
//					System.out.println(Town.letterBoxesList.get(j).getLetterInBox().size());
//					System.out.println(picker.get(i).getLetterList().size());
					picker.get(i).takeLetters(Town.letterBoxesList.get(j));
//					System.out.println(Town.letterBoxesList.get(j).getLetterInBox().size());
//					System.out.println(picker.get(i).getLetterList().size());
//					System.out.println();
				}
				
				start += 5;
				stop += 5;
			picker.get(i).archivåsLetter();
	//			System.out.println("**********");
			}
		}
		
		
	}
	
	public static void sentOut (){
		if (PostStation.getStorage().size() > 50){			
		int countLetters = PostStation.getStorage().size() / PostStation.getPostMans().size();
//		System.out.println(PostStation.getStorage().size() +" " + PostStation.getPostMans().size()  );
		int start = 0;
		int stop = countLetters;
		for (int i = 0; i < PostStation.getPostMans().size(); i++) {
			System.out.println(PostStation.getStorage().size());
			System.out.println(PostStation.getPostMans().get(i).getCountShipments());
			System.out.println(PostStation.getPostMans().get(i).getShipmentsList().size());
			for (int j = start; j < stop; j++) {
				
				
			
				PostStation.getPostMans().get(i).setShipmentsList(PostStation.getStorage().get(j));
				PostStation.storage.remove(j);
				PostStation.getPostMans().get(i).setCountShipments(PostStation.getPostMans().get(i).getCountShipments()+1);
				System.out.println(PostStation.getStorage().size());
				System.out.println(PostStation.getPostMans().get(i).getCountShipments());
				System.out.println(PostStation.getPostMans().get(i).getShipmentsList().size());
		} 
			start += countLetters;
			stop +=  countLetters;
			System.out.println("*****");
		}
	}
}
}
	