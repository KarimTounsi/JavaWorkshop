package pl.karim.javaWorkshop.restController;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.karim.javaWorkshop.exceptions.ObjectNotFoundException;


@ControllerAdvice(basePackages = "pl.karim.javaWorkshop.restController")
public class ExceptionHandlerRestController {

    @ResponseBody
    @ExceptionHandler({ObjectNotFoundException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String objectNotFoundStatus(ObjectNotFoundException ex) {
        return ex.getMessage();
    }


}
