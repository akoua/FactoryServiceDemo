package culture.africa.ci.factoryservicedemo.service;

public interface ITransferMoneyFactory {
TransfertMoneyService getProcessor(String type);
}
