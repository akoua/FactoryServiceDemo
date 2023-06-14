package culture.africa.ci.factoryservicedemo.controllers;

import culture.africa.ci.factoryservicedemo.service.ITransferMoneyFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TransferController {

    private final ITransferMoneyFactory transferMoneyFactory;

    @GetMapping("{type}")
    public void transferMoney(@PathVariable String type){
        transferMoneyFactory.getProcessor(type)
                .sendMoney();
    }
}
