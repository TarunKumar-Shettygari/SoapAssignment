package com.accolite.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface Person {
	@WebMethod void createPerson(@WebParam(name="name") String name,@WebParam(name="age") int age);
	@WebMethod void deletePerson(@WebParam(name="id") int id);
	@WebMethod Person1 getPerson(@WebParam(name="id") int id);
	@WebMethod void modifyPerson(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="age") int age);
	
}
