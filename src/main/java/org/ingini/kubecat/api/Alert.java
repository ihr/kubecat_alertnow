package org.ingini.kubecat.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import javax.annotation.concurrent.Immutable;
import java.time.Instant;


@Immutable
@ToString
public abstract class Alert {

    public static final String TYPE = "type";
    public static final String SOURCE_TIMESTAMP = "source_timestamp";
    public static final String LOCAL_TIMESTAMP = "local_timestamp";

    private AlertType alertType;

    private long localTimeMilli;
    private long sourceTimeMilli;

    protected Alert(AlertType alertType, long localTimeMilli) {
        this.alertType = alertType;
        this.localTimeMilli = localTimeMilli;
        this.sourceTimeMilli = Instant.now().toEpochMilli();
    }

    @JsonProperty(TYPE)
    public AlertType getAlertType() {
        return alertType;
    }

    @JsonProperty(SOURCE_TIMESTAMP)
    public long getSourceTimeMilli() {
        return sourceTimeMilli;
    }

    @JsonProperty(LOCAL_TIMESTAMP)
    public long getLocalTimeMilli() {
        return localTimeMilli;
    }

}
