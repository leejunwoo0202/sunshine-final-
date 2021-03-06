package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.LoginInfo;
import sunshine.model.DTO.GoodsDTO;
import sunshine.model.DTO.MemOrderDTO;
import sunshine.model.DTO.PaymentDTO;

@Component
@Repository
public interface GoodsMapper {

	
	public Integer goodsInsert(GoodsDTO dto);
	   
	public List<GoodsDTO> getGoodsList(GoodsDTO dto);
	
	public Integer getGoodsCount(GoodsDTO goodsDTO);

	public void goodsDelete(String goodsNum);

	public void goodsUpdate(GoodsDTO dto);

	public <List>LoginInfo selectMem(String loginId);
	
	public void getGoodsListNum(String goodsNum);

	public void paymentInsert(MemOrderDTO memOrderDTO);

	public void paymentInsertPro(MemOrderDTO memOrderDTO);
	
	public String mOrderNum();

	public List<PaymentDTO> getPaymentList(String memId);

	public int getPaymentCount(PaymentDTO paymentDTO);

	

	
	
	
}
