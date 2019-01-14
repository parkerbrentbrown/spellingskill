package Spelling;

 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.LaunchRequest;
 import com.amazon.ask.model.Response;
 import com.amazon.ask.request.Predicates;

 import java.util.Optional;

 public class LaunchRequestHandler implements RequestHandler {

      public boolean canHandle(HandlerInput input) {
          return input.matches(Predicates.requestType(LaunchRequest.class));
      }

      public Optional<Response> handle(HandlerInput input) {
          String speechText = "Welcome to SpellTest! I can help you practice spelling words for an upcoming test, or just for fun. You can say (practice) or (create a new list).";
          return input.getResponseBuilder()
                  .withSpeech(speechText)
                  .withSimpleCard("HelloWorld", speechText)
                  .withReprompt(speechText)
                  .build();
      }

 }