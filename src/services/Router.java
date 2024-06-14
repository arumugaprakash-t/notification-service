package services;

import models.AccountType;
import models.Channel;

import java.util.List;

public interface Router {

    public List<Vendor> getSupportedVendors(AccountType accountType, Channel channel);

}
