package uz.pdp;

import org.junit.jupiter.api.Test;
import uz.pdp.employee.Employee;

import java.util.Map;

import static uz.pdp.employee.EmployeeMapper.EMPLOYEE_MAPPER;

class EmployeeMapperTest {

    @Test
    void fromMap() {

        Map<String, String> params = Map.of(
                "firstName", "Safixon",
                "lastName", "Abdusattorov",
                "age", "21"
        );
        Employee employee = EMPLOYEE_MAPPER.fromMap(params);
        System.out.println("employee = " + employee);
    }

    @Test
    void fromMap2() {

        Map<String, Object> params = Map.of(
                "firstName", "Safixon",
                "lastName", "Abdusattorov",
                "age", 21
        );
        Employee employee = EMPLOYEE_MAPPER.fromMap2(params);
        System.out.println("employee = " + employee);
    }
}