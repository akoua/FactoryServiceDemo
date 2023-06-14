package culture.africa.ci.factoryservicedemo.service;

import org.springframework.stereotype.Service;

@Service
public abstract class TransfertMoneyService {

    public Boolean checkMoney(){
        return true;
    }

      public abstract boolean sendMoney();
}
