package org.ingini.kubecat.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.concurrent.Immutable;

@Immutable
public class BillingAlert extends Alert {

    @JsonCreator
    public BillingAlert(@JsonProperty(SOURCE_TIMESTAMP)Long sourceTimeMilli) {
        super(AlertType.BILLING, sourceTimeMilli);
    }

}
