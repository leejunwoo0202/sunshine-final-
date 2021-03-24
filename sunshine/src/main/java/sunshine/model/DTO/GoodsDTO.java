package sunshine.model.DTO;

import java.io.File;
import java.sql.Timestamp;

public class GoodsDTO {
     String goodsNum;
     String goodsName;
     String goodsPrice;
     String goodsAmount;
     String goodsCategori;
     String goodsContent;
     String goodsImage;
     File goodsImage1;
     String ipAddr;
     Timestamp goodsRegister;
     Long readCount;
     String userId;
     
     StartEndPageDTO startEndPageDTO;

     
     
     public GoodsDTO() {
		// TODO Auto-generated constructor stub
	}
     
	public GoodsDTO(String goodsNum, String goodsName, String goodsPrice, String goodsAmount, String goodsCategori,
			String goodsContent, String goodsImage, String ipAddr, Timestamp goodsRegister, Long readCount,
			String userId) {
		super();
		this.goodsNum = goodsNum;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsAmount = goodsAmount;
		this.goodsCategori = goodsCategori;
		this.goodsContent = goodsContent;
		this.goodsImage = goodsImage;
		this.ipAddr = ipAddr;
		this.goodsRegister = goodsRegister;
		this.readCount = readCount;
		this.userId = userId;
	}

	public String getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsAmount() {
		return goodsAmount;
	}

	public void setGoodsAmount(String goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public String getGoodsCategori() {
		return goodsCategori;
	}

	public void setGoodsCategori(String goodsCategori) {
		this.goodsCategori = goodsCategori;
	}

	public String getGoodsContent() {
		return goodsContent;
	}

	public void setGoodsContent(String goodsContent) {
		this.goodsContent = goodsContent;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Timestamp getGoodsRegister() {
		return goodsRegister;
	}

	public void setGoodsRegister(Timestamp goodsRegister) {
		this.goodsRegister = goodsRegister;
	}

	public Long getReadCount() {
		return readCount;
	}

	public void setReadCount(Long readCount) {
		this.readCount = readCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}

	public File getGoodsImage1() {
		return goodsImage1;
	}

	public void setGoodsImage1(File goodsImage1) {
		this.goodsImage1 = goodsImage1;
	}

    
     
     
     
}
     
