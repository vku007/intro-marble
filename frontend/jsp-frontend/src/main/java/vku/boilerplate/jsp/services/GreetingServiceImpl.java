package vku.boilerplate.jsp.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import vku.boilerplate.jsp.services.dto.GreetingResponse;

@Component
public class GreetingServiceImpl implements GreetingService {

    // config!!!

    public String SEARCH_SERVICE_URL = "http://localhost:8091";

    private RestTemplate rest = new RestTemplate();

    private HttpHeaders buildHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        // auth could be added here
        return headers;
    }


    @Override
    public GreetingResponse getGreeting(String name) {
        HttpHeaders headers = buildHeaders();

        try {
            ResponseEntity<GreetingResponse> responseEntity = rest.getForEntity(SEARCH_SERVICE_URL + "/greeting/" + name, GreetingResponse.class, headers);
            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                return responseEntity.getBody();
            } else {
                GreetingResponse error = new GreetingResponse(0, "", null);
                error.setErrorMessage("REST service unavailable. " + responseEntity.getStatusCodeValue());
                return error;
            }
        } catch (Exception e) {
            throw new RemoteServiceException(e.getMessage());
        }

    }
}
