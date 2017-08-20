package postOffice;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoPostOffice {

	public static void main(String[] args) {
		Town sofia = new Town();
		Parcel parcel = new Parcel();
		parcel.setBreakable(false);
		parcel.setBigSize(40, 60, 50);
		parcel.setTax();
		System.out.println(parcel.getTax());
		Letter letter = new Letter();
		letter.setTax();
		System.out.println(letter.getTax());

		for (int i = 0; i < 50; i++) {
			Citizen citizen = new Citizen();
			citizen.sendingALetterToBox();
			citizen.sendingAShipmentToPostOffice();
		}
		for (int i = 0; i < Town.letterBoxesList.size(); i++) {
			System.out.print(Town.letterBoxesList.get(i).getLetterInBox().size() + " ");

		}

		System.out.println();
		System.out.println(PostStation.getStorage().size());

		System.out.println(PostStation.getArchive().size());
//		for (int i = 0; i < PostStation.getArchive().size(); i++) {
//			if (PostStation.getArchive().get(i) instanceof Parcel) {
//				System.out.println(((Parcel) PostStation.getArchive().get(i)).isBigSize());
//			}
//		}

//		for (int i1 = 0; i1 < PostStation.getArchive().size(); i1++) {
//			System.out.println((PostStation.getArchive().get(i1)).getTax());
//
//		}
		
		PostStation postNew = new PostStation();
		postNew.fullStorage();
		postNew.sentOut();
	}

}
