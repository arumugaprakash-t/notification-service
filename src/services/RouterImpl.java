package services;

import models.AccountType;
import models.Channel;

import java.util.ArrayList;
import java.util.List;

public class RouterImpl implements Router{

    List<Vendor> vendorList;

    public RouterImpl(List<Vendor> vendorList){
        this.vendorList = vendorList;
    }

    @Override
    public List<Vendor> getSupportedVendors(AccountType accountType, Channel channel){

        List<Vendor> supportedVendorList = new ArrayList<>();

        for(Vendor v: vendorList){
            if(v.supportedChannels().contains(channel) && v.supportedAccountType().contains(accountType)){
                supportedVendorList.add(v);
            }
        }

        return supportedVendorList;

    }
}
