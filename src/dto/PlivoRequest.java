package dto;

import java.util.List;

public class PlivoRequest {
    private String sender;
    private List<String> receivers;
    private String admin;
    private String content;

    private String type;

    public PlivoRequest(){

    }

    public PlivoRequest(String sender,List<String> receivers,String admin,String message,String type){
        this.sender = sender;
        this.receivers = receivers;
        this.admin = admin;
        this.content = message;
        this.type = type;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public String getAdmin() {
        return admin;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getType() {
        return type;
    }
}
