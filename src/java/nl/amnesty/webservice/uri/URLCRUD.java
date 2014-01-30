/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.uri;

import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ed
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class URLCRUD {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public long create(@WebParam(name = "Protocol") String protocol,
            @WebParam(name = "Username") String username,
            @WebParam(name = "Password") String password,
            @WebParam(name = "Domain") String domain,
            @WebParam(name = "Port") int port,
            @WebParam(name = "Query") String query,
            @WebParam(name = "Fragment") String fragment) {
        //TODO write your implementation code here:
        long urlid = 123456789;
        return urlid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "read")
    public long read(@WebParam(name = "URLid") long urlid) {
        //TODO write your implementation code here:
        return urlid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(@WebParam(name = "URLid") long urlid,
            @WebParam(name = "Protocol") String protocol,
            @WebParam(name = "Username") String username,
            @WebParam(name = "Password") String password,
            @WebParam(name = "Domain") String domain,
            @WebParam(name = "Port") int port,
            @WebParam(name = "Query") String query,
            @WebParam(name = "Fragment") String fragment) {
        //TODO write your implementation code here:
        return urlid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(@WebParam(name = "URLid") long urlid) {
        //TODO write your implementation code here:
        return urlid;
    }
    */
}
