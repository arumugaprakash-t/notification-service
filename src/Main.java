import dto.CommunicationRequest;
import models.AccountType;
import models.Channel;
import services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        CommunicationRequest request = new CommunicationRequest(AccountType.Promotional, Channel.SMS, Arrays.asList("test@gmail","test1@gmail.com"),"test@prakash.com","Hello Testing 123");

        Vendor vendor = new PlivoVendor();
        List<Vendor> vendorList = new ArrayList<>();
        vendorList.add(vendor);

        Router router = new RouterImpl(vendorList);

        CommunicationService communicationService = new CommunicationServiceImpl(router);
        System.out.println(communicationService.sendCommunication(request));
        System.out.println("Hello world!");
    }
}