package org.ingini.kubecat;

import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Environment;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.slf4j.Logger;

import static org.fest.reflect.core.Reflection.field;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class AlertNowApplicationTest {

    private final Environment environment = mock(Environment.class);
    private final JerseyEnvironment jersey = mock(JerseyEnvironment.class);
    private final Logger loggerMock = mock(Logger.class);

    @InjectMocks
    private final AlertNowApplication app = new AlertNowApplication();

    private final static AlertNowConfiguration CONFIG = new AlertNowConfiguration();

    @BeforeAll
    private static void setup() {
        CONFIG.setEmailAddress("test@test.com");
    }

    @DisplayName("Success Test")
    @Test
    void loggingShouldHappen() {
        //GIVEN
        field("logger").ofType(Logger.class).in(app).preDecorateWith(loggerMock);
        when(environment.jersey()).thenReturn(mock(JerseyEnvironment.class));

        //WHEN
        app.run(CONFIG, environment);

        //THEN
        verify(loggerMock, times(1)).info(eq("The email address is: {} "), eq("test@test.com"));

    }


}
