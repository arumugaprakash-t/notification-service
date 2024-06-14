package clients;

import dto.PlivoRequest;

//Test clients
public class Plivo {

   public boolean SendCommnunication(PlivoRequest request){
       System.out.printf("Communication send from Plivo - Type %s: ",request.getType());
       return true;
   }

}
