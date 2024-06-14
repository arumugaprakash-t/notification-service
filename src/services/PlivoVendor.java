package services;

import clients.Plivo;
import dto.CommunicationRequest;
import dto.PlivoRequest;
import dto.mappers.PlivoMapper;
import models.AccountType;
import models.Channel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlivoVendor implements Vendor{

    List<Channel> supportedChannels;
    List<AccountType> supportedAccountType;

    private Plivo plivoClinet;

    public PlivoVendor(){
        this.supportedChannels = Arrays.asList(Channel.SMS,Channel.Email,Channel.PushNotification);
        this.supportedAccountType = Arrays.asList(AccountType.Promotional);
        this.plivoClinet = new Plivo();
    }

    @Override
    public boolean healthCheck() {
        return true;
    }

    @Override
    public List<Channel> supportedChannels(){
        return supportedChannels;
    }

    @Override
    public List<AccountType> supportedAccountType(){
        return supportedAccountType;
    }

    @Override
    public boolean sendCommunication(CommunicationRequest request){

        PlivoRequest plivoRequest = PlivoMapper.convertToPlivoRequest(request);
        boolean response = plivoClinet.SendCommnunication(plivoRequest);

        // assume we do response conversion and send

        return response;
    }
}
