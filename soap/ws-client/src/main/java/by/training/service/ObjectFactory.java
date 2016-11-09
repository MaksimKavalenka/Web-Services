
package by.training.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.training.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetResultResponse_QNAME = new QName("http://service.training.by/", "getResultResponse");
    private final static QName _GetResult_QNAME = new QName("http://service.training.by/", "getResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.training.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetResult }
     * 
     */
    public GetResult createGetResult() {
        return new GetResult();
    }

    /**
     * Create an instance of {@link GetResultResponse }
     * 
     */
    public GetResultResponse createGetResultResponse() {
        return new GetResultResponse();
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createExpression() {
        return new Expression();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.by/", name = "getResultResponse")
    public JAXBElement<GetResultResponse> createGetResultResponse(GetResultResponse value) {
        return new JAXBElement<GetResultResponse>(_GetResultResponse_QNAME, GetResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.training.by/", name = "getResult")
    public JAXBElement<GetResult> createGetResult(GetResult value) {
        return new JAXBElement<GetResult>(_GetResult_QNAME, GetResult.class, null, value);
    }

}
