package dto;

import models.AccountType;
import models.Channel;

import java.util.List;

public class CommunicationRequest {
    private AccountType accountType;
    private Channel channel;
    private List<String> receivers;
    private String sender;
    private String message;

    public CommunicationRequest(AccountType accountType,Channel channel, List<String> receivers, String sender,String message){
        this.accountType = accountType;
        this.channel = channel;
        this.receivers = receivers;
        this.sender = sender;
        this.message = message;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public String getSender() {
        return sender;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Channel getChannel() {
        return channel;
    }

    public String getMessage() {
        return message;
    }
}
