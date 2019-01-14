package Spelling;

 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.Response;
 import static com.amazon.ask.request.Predicates.intentName;

 import java.util.Optional;

 public class HelpIntentHandler implements RequestHandler {

     
     public boolean canHandle(HandlerInput input) {
         return input.matches(intentName("AMAZON.HelpIntent"));
     }

     
     public Optional<Response> handle(HandlerInput input) {
         String speechText = "Say - create a new list, practice, or exit!";
         return input.getResponseBuilder()
                 .withSpeech(speechText)
                 .withSimpleCard("HelloWorld", speechText)
                 .withReprompt(speechText)
                 .build();
     }
 }
