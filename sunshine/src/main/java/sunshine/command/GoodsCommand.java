package sunshine.command;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class GoodsCommand {
     String goodsNum;
     String goodsName;
     String goodsPrice;
     String goodsAmount;
     String goodsCategori;
     String goodsContent;
     MultipartFile[] goodsImage;
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
	public MultipartFile[] getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(MultipartFile[] goodsImage) {
		this.goodsImage = goodsImage;
	}
     
}
