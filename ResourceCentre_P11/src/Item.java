
public class Item {
	private String assetTag;
	private String description;
	private String dueDate;
	private boolean isAvailable;

	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}
	public String toString() {
		
		// Write your codes here
//		String ItemInfo = String.format("%-10s %-30s %-10s %-10s %-20s\n", chromebookList.get(i).getAssetTag(),
//				chromebookList.get(i).getDescription(), 
//				ResourceCentre.showAvailability(chromebookList.get(i).getIsAvailable()),
//				chromebookList.get(i).getDueDate(),chromebookList.get(i).getOs());
		return null;
	}
	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}

