package sunshine.model.DTO;

public class CondoDTO {
	String roomNum;
	String roomType;
	Integer roomPrice;
	String roomImage;
	String roomDetail;
	
	String originalFileName; 
	String storeFileName; 
	String fileSize;
	
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getStoreFileName() {
		return storeFileName;
	}
	public void setStoreFileName(String storeFileName) {
		this.storeFileName = storeFileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Integer getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(Integer roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomImage() {
		return roomImage;
	}
	public void setRoomImage(String roomImage) {
		this.roomImage = roomImage;
	}
	public String getRoomDetail() {
		return roomDetail;
	}
	public void setRoomDetail(String roomDetail) {
		this.roomDetail = roomDetail;
	}
	
	
}
