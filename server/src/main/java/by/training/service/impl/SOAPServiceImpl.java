package by.training.service.impl;

import javax.jws.WebService;

import by.training.bean.Expression;
import by.training.enumeration.Operation;
import by.training.service.SOAPService;

@WebService(endpointInterface = "by.training.service.SOAPService")
public class SOAPServiceImpl implements SOAPService {

    @Override
    public double getResult(final Expression expression) {
        double number1 = expression.getNumber1();
        double number2 = expression.getNumber2();
        Operation operation = expression.getOperation();

        switch (operation) {
            case ADDING:
                return number1 + number2;
            case SUBTRACTING:
                return number1 - number2;
            case MULTIPLYING:
                return number1 * number2;
            case DIVIDING:
                if (number2 == 0) {
                    throw new IllegalArgumentException("Divider cannot be equal 0");
                }
                return number1 / number2;
            default:
                return 0;
        }
    }

}
