package culture.africa.ci.factoryservicedemo.service.impl;

import culture.africa.ci.factoryservicedemo.enums.TransfertType;
import culture.africa.ci.factoryservicedemo.service.TransfertMoneyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(TransfertType.METHODE1_NAME)
@Slf4j
public class TransfertMoneyM1 extends TransfertMoneyService {

    @Override
    public boolean sendMoney() {
        log.info("Methode 1");
        return false;
    }
}
