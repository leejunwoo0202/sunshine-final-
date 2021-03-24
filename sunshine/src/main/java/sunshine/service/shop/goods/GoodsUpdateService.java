package sunshine.service.shop.goods;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sunshine.command.GoodsCommand;
import sunshine.mapper.GoodsMapper;
import sunshine.model.DTO.GoodsDTO;

@Component
@Service
public class GoodsUpdateService {

	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand,
			HttpSession session, String goodsImage1) {
		GoodsDTO dto = new GoodsDTO();
		System.out.println("goodsNum:"+goodsImage1);
		
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setGoodsAmount(goodsCommand.getGoodsAmount());
		dto.setGoodsCategori(goodsCommand.getGoodsCategori());
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsImage(goodsImage1); 
		
		String path = "WEB-INF/view/goods/upload";
    	
    	String filePath = session.getServletContext().getRealPath(path);
    	System.out.println(session.getServletContext().getRealPath(path));
    	String goodsImage = "";
    	System.out.println("acxdvd" + goodsCommand.getGoodsImage()[0].getOriginalFilename() + "svxsvs");
    	if(!goodsCommand.getGoodsImage()[0].getOriginalFilename().equals("") 
    			&& goodsCommand.getGoodsImage()[0].getOriginalFilename() != null) {
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
    		dto.setGoodsImage(goodsImage);    		
    	}
		
		goodsMapper.goodsUpdate(dto);
		
		
	}
	
}
