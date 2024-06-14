package services;

import dto.CommunicationRequest;

public interface CommunicationService {
    public boolean sendCommunication(CommunicationRequest request);
}
