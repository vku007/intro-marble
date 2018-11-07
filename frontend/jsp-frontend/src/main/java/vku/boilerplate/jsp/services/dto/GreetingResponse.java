package vku.boilerplate.jsp.services.dto;


public class GreetingResponse {

    private long id;
    private String content;
    private String errorMessage;

    public GreetingResponse() {

    }

    public GreetingResponse(long id, String content, String errorMessage) {
        this.id = id;
        this.content = content;
        this.errorMessage = errorMessage;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
