package services;

import dto.CommunicationRequest;

import java.util.List;

public class CommunicationServiceImpl implements CommunicationService{

    public Router router;

    public CommunicationServiceImpl(Router router){
        this.router = router;
    }

    @Override
    public boolean sendCommunication(CommunicationRequest communicationRequest){
        // Get Vendors from router
        List<Vendor> vendorList = router.getSupportedVendors(communicationRequest.getAccountType(),communicationRequest.getChannel());
        for(Vendor v:vendorList){
            if(v.healthCheck()){
                return v.sendCommunication(communicationRequest);
            }
        }
        System.out.println("Failed to send communication");
        return false;
    }

}
