package dto.mappers;

import dto.CommunicationRequest;
import dto.PlivoRequest;

public class PlivoMapper {

    public static PlivoRequest convertToPlivoRequest(CommunicationRequest request){

        PlivoRequest plivoRequest = new PlivoRequest();

        plivoRequest.setAdmin(request.getAccountType().toString());
        plivoRequest.setContent(request.getMessage());
        plivoRequest.setReceivers(request.getReceivers());
        plivoRequest.setSender(request.getSender());
        plivoRequest.setType(request.getChannel().toString());
        return plivoRequest;

    }

}
