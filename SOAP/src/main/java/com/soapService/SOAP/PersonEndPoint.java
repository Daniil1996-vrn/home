package com.soapService.SOAP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import xmlPackage.PersonDetailsRequest;
import xmlPackage.PersonDetailsRequestList;
import xmlPackage.PersonDetailsResponse;
import xmlPackage.PersonDetailsResponseList;

@Endpoint
public class PersonEndPoint {

    private static final String NAMESPACE_URI = "https://www.howtodoinjava.com/xml/school";

    private ListPersonForSoap listPersonForSoap;

    @Autowired
    public PersonEndPoint(ListPersonForSoap listPersonForSoap) {
        this.listPersonForSoap = listPersonForSoap;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersonDetailsRequest")
    @ResponsePayload
    public PersonDetailsResponse getStudent(@RequestPayload PersonDetailsRequest request) {
        PersonDetailsResponse response = new PersonDetailsResponse();
        response.setPersonForSoap(listPersonForSoap.findPerson(request.getId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersonDetailsRequestList")
    @ResponsePayload
    public PersonDetailsResponseList getPersonList(@RequestPayload PersonDetailsRequestList requestList) {
        PersonDetailsResponseList response = new PersonDetailsResponseList();


        response.setListPersonForSoap(listPersonForSoap.findListAge(requestList.getAge()));

        return response;
    }



}
