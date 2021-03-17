//package sunshine.service.condo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import sunshine.command.CondoCommand;
//import sunshine.model.DTO.CondoDTO;
//
//@Component
//@Service
//public class CondoRegistService {
//
//	@Autowired
//	CondoRegistMapper condoRegistMapper;
//	public void execute(CondoCommand condoCommand) {
//		CondoDTO condoDTO = new CondoDTO();
//		Integer result = null;
//		condoDTO.setRoomNum(condoCommand.getRoomNum());
//		condoDTO.setRoomType(condoCommand.getRoomType());
//		condoDTO.setRoomPrice(condoCommand.getRoomPrice());
//		condoDTO.setRoomimage(condoCommand.getRoomimage());
//		condoDTO.setRoomDetail(condoCommand.getRoomDetail());
//		
//		result = condoRegistMapper.insertCondo(condoDTO);
//	}
//}
