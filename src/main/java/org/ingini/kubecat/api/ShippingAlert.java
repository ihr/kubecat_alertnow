package org.ingini.kubecat.api;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.annotation.concurrent.Immutable;

@Immutable
public class ShippingAlert extends Alert {


    @JsonCreator
    public ShippingAlert(long transmissionTimeMilli) {
        super(AlertType.SHIPPING, transmissionTimeMilli);
    }

}
