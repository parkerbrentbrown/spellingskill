package Spelling;

 import com.amazon.ask.Skill;
 import com.amazon.ask.Skills;
 import com.amazon.ask.SkillStreamHandler;

 import Spelling.CancelandStopIntentHandler;
 import Spelling.CreateSpellingListIntentHandler;
 import Spelling.HelpIntentHandler;
 import Spelling.SessionEndedRequestHandler;
 import Spelling.LaunchRequestHandler;
 import Spelling.FallbackIntentHandler;

  public class SpellingTestStreamHandler extends SkillStreamHandler {

      private static Skill getSkill() {
          return Skills.standard()
                  .addRequestHandlers(
                         new CancelandStopIntentHandler(),
                         new CreateSpellingListIntentHandler(),
                         new HelpIntentHandler(),
                         new LaunchRequestHandler(),
                         new SessionEndedRequestHandler(),
                         new FallbackIntentHandler())
                  .build();
      }

      public SpellingTestStreamHandler() {
          super(getSkill());
      }

  }