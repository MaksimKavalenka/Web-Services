package by.training.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import by.training.bean.Expression;

@WebService
public interface SOAPService {

    @WebMethod
    double getResult(@WebParam(name = "expression", mode = WebParam.Mode.IN) Expression expression);

}
