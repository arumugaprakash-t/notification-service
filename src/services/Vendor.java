package services;

import dto.CommunicationRequest;
import models.AccountType;
import models.Channel;

import java.util.List;

public interface Vendor {
    public boolean sendCommunication(CommunicationRequest request);
    public List<Channel> supportedChannels();
    public List<AccountType> supportedAccountType();
    public boolean healthCheck();
}
