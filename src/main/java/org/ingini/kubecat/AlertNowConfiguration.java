package org.ingini.kubecat;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

public class AlertNowConfiguration extends Configuration {

    @NotEmpty
    private String emailAddress;

    @NotEmpty
    private String defaultName = "John Doe";

    @JsonProperty
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }
    
}
