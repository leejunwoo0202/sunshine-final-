package sunshine.service.shop.goods;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sunshine.command.GoodsCommand;
import sunshine.mapper.GoodsMapper;
import sunshine.model.LoginInfo;
import sunshine.model.DTO.GoodsDTO;

@Component
@Service
public class GoodsWriteService {
    @Autowired
    GoodsMapper goodsMapper;
    
    public void goodsWrite(GoodsCommand goodsCommand,
    		HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	LoginInfo loginInfo = 
    			(LoginInfo)session.getAttribute("loginInfo");
    	GoodsDTO dto = new GoodsDTO();
    	//상품번호
    	dto.setGoodsNum(goodsCommand.getGoodsNum());
    	//상품이름
    	dto.setGoodsName(goodsCommand.getGoodsName());
    	//상품가격
    	dto.setGoodsPrice(goodsCommand.getGoodsPrice());
    	//상품수량
    	dto.setGoodsAmount(goodsCommand.getGoodsAmount());
    	//상품종류
    	dto.setGoodsCategori(goodsCommand.getGoodsCategori());
    	//상품설명
    	dto.setGoodsContent(goodsCommand.getGoodsContent());
    	
    	
    	
    	//상품이미지
    	String path = "WEB-INF/view/goods/upload";
    	
    	String filePath = session.getServletContext().getRealPath(path);
    	System.out.println(session.getServletContext().getRealPath(path));
    	String goodsImage = "";
    	if(goodsCommand.getGoodsImage() != null) {
    		for(MultipartFile mf : goodsCommand.getGoodsImage()) {
    			String original = mf.getOriginalFilename();
    			
    			String originalFileExtension =
    					original.substring(original.lastIndexOf("."));
    			
    			String store = 
    					UUID.randomUUID().toString().replace("-","")
    			+originalFileExtension;
    			
    			goodsImage += store +"`";
    			
    			File file = new File(filePath + "\\" +store);
    			System.out.println("file:" + file);
    			try {
    				mf.transferTo(file);
    			}catch(IllegalStateException | IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	dto.setGoodsImage(goodsImage);
        
    	goodsMapper.goodsInsert(dto);
    	
    	
    	
    	
    	
    }
}
