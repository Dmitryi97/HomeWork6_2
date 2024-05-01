package pro.sky.homeWork6_2.Exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmployeeStorageIsFullException extends RuntimeException{
}
