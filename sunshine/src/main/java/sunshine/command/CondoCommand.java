package sunshine.command;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;


public class CondoCommand {
	@NotEmpty(message = "객실번호를 입력하세요.")
	String roomNum;
	@NotEmpty(message = "객실타입을 선택하세요.")
	String roomType;
	Integer roomPrice;
	MultipartFile [] roomImage;
	@NotEmpty(message = "객실 정보를 입력하세요.")
	String roomDetail;
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
	public MultipartFile[] getRoomImage() {
		return roomImage;
	}
	public void setRoomImage(MultipartFile[] roomImage) {
		this.roomImage = roomImage;
	}
	public String getRoomDetail() {
		return roomDetail;
	}
	public void setRoomDetail(String roomDetail) {
		this.roomDetail = roomDetail;
	}
	
	
}
