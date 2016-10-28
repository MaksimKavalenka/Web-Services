package by.training;

import java.net.MalformedURLException;

import by.training.service.SOAPService;
import by.training.service.domain.Expression;
import by.training.service.domain.Operation;
import by.training.service.impl.SOAPServiceImplService;

public class Main {

    public static void main(final String[] args) throws MalformedURLException {

        SOAPService service = new SOAPServiceImplService().getSOAPServiceImplPort();

        Expression expression = new Expression();
        expression.setNumber1(10);
        expression.setNumber2(4);

        for (Operation operation : Operation.values()) {
            expression.setOperation(operation);
            System.out.print(expression.getNumber1());
            switch (operation) {
                case ADDING:
                    System.out.print(" + ");
                    break;
                case SUBTRACTING:
                    System.out.print(" - ");
                    break;
                case MULTIPLYING:
                    System.out.print(" * ");
                    break;
                case DIVIDING:
                    System.out.print(" / ");
                    break;
                default:
                    break;
            }
            System.out.println(expression.getNumber2() + " = " + service.getResult(expression));
        }
    }

}
