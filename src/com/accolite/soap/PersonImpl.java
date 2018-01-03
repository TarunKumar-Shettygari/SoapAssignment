package com.accolite.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="com.accolite.soap.Person")
public class PersonImpl implements Person {
	
	List<Person1> persons=new ArrayList<Person1>();
	int id=1;
	
	@Override
	public void createPerson(@WebParam(name="name") String name,@WebParam(name="age") int age) {
		Person1 p=new Person1(id,name,age);
		id++;
		persons.add(p);
	}

	@Override
	public void deletePerson(@WebParam(name="id") int id) {
		for(Person1 p:persons) {
			if(p.getId()==id) {
				persons.remove(p);
				return;
			}
		}
		
	}

	@Override
	public Person1 getPerson(@WebParam(name="id") int id) {
		for(Person1 p:persons) {
			if(p.getId()==id) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void modifyPerson(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="age") int age) {
		for(Person1 p:persons) {
			if(p.getId()==id) {
				if(name!=null)
					p.setName(name);
				if(age!=0)
					p.setAge(age);
				return;
			}
		}
		
	}

}
