
package org.camelcookbook.ws.payment_service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-02-10T06:27:40.954Z
 * Generated source version: 3.0.2
 */

@WebFault(name = "fault", targetNamespace = "http://ws.camelcookbook.org/payment-service/types")
public class FaultMessage extends Exception {
    
    private org.camelcookbook.ws.payment_service.types.Fault fault;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, org.camelcookbook.ws.payment_service.types.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public FaultMessage(String message, org.camelcookbook.ws.payment_service.types.Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public org.camelcookbook.ws.payment_service.types.Fault getFaultInfo() {
        return this.fault;
    }
}