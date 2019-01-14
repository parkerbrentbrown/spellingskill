package Spelling;

 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.Response;
 import com.amazon.ask.request.Predicates;

 import java.util.Optional;

 public class CreateSpellingListIntentHandler implements RequestHandler {

      
      public boolean canHandle(HandlerInput input) {
         return input.matches(Predicates.intentName("CreateASpellingListIntent"));
      }

      
      public Optional<Response> handle(HandlerInput input) {
          String speechText = "Lizzy Brown is so great, she is the best!";
          return input.getResponseBuilder()
                  .withSpeech(speechText)
                  .withSimpleCard("HelloWorld", speechText)
                  .build();
      }

 }