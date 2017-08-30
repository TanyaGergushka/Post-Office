package postOffice;

public class Data {

	private String nameFirst;
	private String nameLast;

	public String getNameFirst() {
		return nameFirst;
	}

	protected void setNameFirst(String name) {
		if (isDataValid(name)) {
			this.nameFirst = name;
		}
	}

	public String getNameLast() {
		return nameLast;
	}

	protected void setNameLast(String name) {
		if (isDataValid(name)) {
			this.nameLast = name;
		}
	}

	protected boolean isDataValid(String name) {
		if (name != null && !name.isEmpty()) {
			return true;
		}
		return false;
	}
}
