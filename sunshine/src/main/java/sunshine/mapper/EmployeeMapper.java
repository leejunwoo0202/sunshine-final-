package sunshine.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sunshine.model.DTO.EmployeeDTO;
import sunshine.model.DTO.MemberDTO;
@Repository
@Component
public interface EmployeeMapper {
	public void employeeJoin(EmployeeDTO employeeDTO) throws Exception;
	public List<EmployeeDTO> employeeList();
	public EmployeeDTO employeeDetail(String emNo);
	public void employeeModifyOk(EmployeeDTO employeeDTO);
	public void employeeDelete(String emNo);
	//select 빼고는 Integer 가능 Update도 1개가 삭제가 되는 것이고
	//수정도 1개가 수정이 되는 것이기 때문이다.
	//insert update delete 는 1을 반환하기 때문에 Integer로 쓸 수 있는것.
	public EmployeeDTO selectByEmployee(String emId);

}
