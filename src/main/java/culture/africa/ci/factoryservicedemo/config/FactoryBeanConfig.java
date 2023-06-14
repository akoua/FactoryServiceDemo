package culture.africa.ci.factoryservicedemo.config;

import culture.africa.ci.factoryservicedemo.service.ITransferMoneyFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

@Configuration
public class FactoryBeanConfig {

    @Bean(name = "transferMoneyMethodeFactory")
    public FactoryBean<?> createTransferMoneyMethode(){
        return createFactoryBean(ITransferMoneyFactory.class);
    }

    @NonNull
    private <T>ServiceLocatorFactoryBean createFactoryBean(Class<T> interfaceType){
       var factoryBean =  new ServiceLocatorFactoryBean();
       factoryBean.setServiceLocatorInterface(interfaceType);

       return factoryBean;
    }
}
