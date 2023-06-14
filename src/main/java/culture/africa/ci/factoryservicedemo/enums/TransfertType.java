package culture.africa.ci.factoryservicedemo.enums;

import lombok.Getter;

public enum TransfertType {
    METHODE1(TransfertType.METHODE1_NAME),
    METHODE2(TransfertType.METHODE2_NAME);

    public static final String METHODE1_NAME = "methode1";
    public static final String METHODE2_NAME = "methode2";

    @Getter
    public final String transfertServiceName;

    TransfertType(String transfertServiceName){this.transfertServiceName = transfertServiceName;}
}
