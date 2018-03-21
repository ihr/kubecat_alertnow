package org.ingini.kubecat;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.ingini.kubecat.resources.AlertResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlertNowApplication extends Application<AlertNowConfiguration> {

    private final Logger logger = LoggerFactory.getLogger(AlertNowApplication.class);

    public static void main(final String[] args) throws Exception {
        new AlertNowApplication().run(args);

    }

    @Override
    public String getName() {
        return "Alert Now";
    }

    @Override
    public void initialize(final Bootstrap<AlertNowConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final AlertNowConfiguration configuration,
                    final Environment environment) {

        environment.jersey().register(
                new AlertResource()
        );

        logger.info("The email address is: {} ", configuration.getEmailAddress());
    }

}
