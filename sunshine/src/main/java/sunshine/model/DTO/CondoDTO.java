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
	
	StartEndPageDTO startEndPageDTO;
	
	
	
	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}
	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}
	
	//생성자
	public CondoDTO(String roomNum, String roomType, Integer roomPrice, String roomImage, String roomDetail,
			String originalFileName, String storeFileName, String fileSize) {
		super();
		this.roomNum = roomNum;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomImage = roomImage;
		this.roomDetail = roomDetail;
		this.originalFileName = originalFileName;
		this.storeFileName = storeFileName;
		this.fileSize = fileSize;
	}
	public CondoDTO() {}; //생성자를 임의로 만들어주면 default생성자 만들기
	
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
