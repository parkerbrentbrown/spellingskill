package Spelling;

 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.Response;
 import static com.amazon.ask.request.Predicates.intentName;

 import java.util.Optional;

 public class CancelandStopIntentHandler implements RequestHandler {

     
     public boolean canHandle(HandlerInput input) {
         return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
     }

     
     public Optional<Response> handle(HandlerInput input) {
         return input.getResponseBuilder()
                 .withSpeech("See you later")
                 .withSimpleCard("HelloWorld", "Goodbye")
                 .build();
     }
 }
