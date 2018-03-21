package org.ingini.kubecat.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import javax.annotation.concurrent.Immutable;

@Immutable
@ToString
public class OrderAlert extends Alert {

    private final Integer number;
    private final String priority;

    @JsonCreator
    public OrderAlert(@JsonProperty(SOURCE_TIMESTAMP)long sourceTimeMilli,
                      @JsonProperty("order_number") Integer number,
                      @JsonProperty("priority") String priority) {
        super(AlertType.ORDER, sourceTimeMilli);
        this.number = number;
        this.priority = priority;
    }

    public Integer getNumber() {
        return number;
    }

    public String getPriority() {
        return priority;
    }


}
