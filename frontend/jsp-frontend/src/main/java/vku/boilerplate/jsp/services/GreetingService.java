package vku.boilerplate.jsp.services;


import vku.boilerplate.jsp.services.dto.GreetingResponse;

public interface GreetingService {

    GreetingResponse getGreeting(String name);

}
