package fete.bird;
import com.google.cloud.functions.*;
import io.micronaut.gcp.function.GoogleFunctionInitializer;

import io.micronaut.gcp.pubsub.annotation.PubSubListener;
import io.micronaut.gcp.pubsub.annotation.Subscription;
import jakarta.inject.*;
import java.util.*;
public class Function extends GoogleFunctionInitializer
        implements BackgroundFunction<PubSubMessage> {

//    @Inject LoggingService loggingService;

    @Override
    public void accept(PubSubMessage message, Context context) {
        System.out.println("Hello world");
    }
}

class PubSubMessage {
    String data;
    Map<String, String> attributes;
    String messageId;
    String publishTime;
}

@Singleton
class LoggingService {

    void logMessage(PubSubMessage message) {
        // log the message
    }
}
