package net.jakehamzawi.game.interaction.resources;

import net.jakehamzawi.game.interaction.Prompt;

import java.util.*;

public final class PromptManager {
  private PromptManager() {}

  public static final String PROCEED_STRING = "Enter anything to continue...";
  private static final List<Prompt> GAME_TEXT = new ArrayList<>(Arrays.asList(
    new Prompt(
      0,
      "  ______    ______    _____  ___    ________   ______    ___       _______     \n" +
        " /\" _  \"\\  /    \" \\  (\\\"   \\|\"  \\  /\"       ) /    \" \\  |\"  |     /\"     \"|    \n" +
        "(: ( \\___)// ____  \\ |.\\\\   \\    |(:   \\___/ // ____  \\ ||  |    (: ______)    \n" +
        " \\/ \\    /  /    ) :)|: \\.   \\\\  | \\___  \\  /  /    ) :)|:  |     \\/    |      \n" +
        " //  \\ _(: (____/ // |.  \\    \\. |  __/  \\\\(: (____/ //  \\  |___  // ___)_     \n" +
        "(:   _) \\\\        /  |    \\    \\ | /\" \\   :)\\        /  ( \\_|:  \\(:      \"|    \n" +
        " \\_______)\\\"_____/    \\___|\\____\\)(_______/  \\\"_____/    \\_______)\\_______)    \n" +
        "                                                                               \n" +
        "    ______    _______                                                          \n" +
        "   /    \" \\  /\"     \"|                                                         \n" +
        "  // ____  \\(: ______)                                                         \n" +
        " /  /    ) :)\\/    |                                                           \n" +
        "(: (____/ // // ___)                                                           \n" +
        " \\        / (:  (                                                              \n" +
        "  \\\"_____/   \\__/                                                              \n" +
        "                                                                               \n" +
        " ___      ___     ______     _______   ___      ___     ______    _____  ___   \n" +
        "|\"  \\    /\"  |   /    \" \\   /\"      \\ |\"  \\    /\"  |   /    \" \\  (\\\"   \\|\"  \\  \n" +
        " \\   \\  //   |  // ____  \\ |:        | \\   \\  //   |  // ____  \\ |.\\\\   \\    | \n" +
        " /\\\\  \\/.    | /  /    ) :)|_____/   ) /\\\\  \\/.    | /  /    ) :)|: \\.   \\\\  | \n" +
        "|: \\.        |(: (____/ //  //      / |: \\.        |(: (____/ // |.  \\    \\. | \n" +
        "|.  \\    /:  | \\        /  |:  __   \\ |.  \\    /:  | \\        /  |    \\    \\ | \n" +
        "|___|\\__/|___|  \\\"_____/   |__|  \\___)|___|\\__/|___|  \\\"_____/    \\___|\\____\\) \n" +
        "                                                                               "),
    new Prompt(1,
      "Welcome to the Book of Mormon, the Choose Your Own Adventure game!"),
    new Prompt(2,
      "Select a character to begin:",
      new String[] {
        "A) Nephi",
        "B) Alma (UNAVAILABLE IN DEMO VERSION)",
        "C) Mormon (UNAVAILABLE IN DEMO VERSION)"
      },
      Map.of(
        0, 3,
        1, 2,
        2, 2)
    ),
    new Prompt(3,
      "It’s just a regular day in Jerusalem under Zedekiah’s reign. The sun beats down\n" +
        "on your face as you carry out your daily chores at home. You’re Nephi, a boy\n" +
        "braver and more mature than your young age would suggest. Sam, your brother,\n" +
        "whistles wistfully as he helps you feed the animals. So many animals to feed makes\n" +
        "for long work, but you think about how lucky you are to have such an amazing house\n" +
        "and possessions in the big city of Jerusalem. Everyday you would wake up and\n" +
        "sigh in relief, realizing that nothing had changed. Life is good."),
    new Prompt(4,
      "The sun begins to set, and you and Sam are just finishing scrubbing the outer walls\n" +
        "of your clay house. “Go ahead inside and rest, Sam,” you offer your brother. “You’ve\n" +
        "earned it. I’ll finish up here.” Sam cheerfully accepts your offer and heads inside."),
    new Prompt(5,
      "A few moments later, you look up to see a sillouhette in the distance staggering\n" +
        "toward the house. You…",
      new String[] {
        "A) Call out to the sillouhette",
        "B) Hide in the bushes and observe",
        "C) Walk towards the sillouhette"
      },
      Map.of(
        0, 6,
        1, 7,
        2, 8
      )
    ),
    new Prompt(6,
      "“Who’s there?” you call in a loud voice. There’s an eerie pause. The figure enters\n" +
        "the light of the lanterns hanging on the house walls and you recognize your father.\n" +
        "His skin is pale like the driven snow, and he had a frightened expression. “It’s just\n" +
        "me, Nephi,” he sighs as he staggers toward you. He looks like he's about\n" +
        "to fall over.",
      9
    ),
    new Prompt(7,
      "You run to the bushes and conceal yourself. Eventually the figure enters the light\n" +
        "of the lanterns hanging on the house walls and you recognize your father.\n" +
        "His skin is pale like the driven snow, and he had a frightened expression.\n" +
        "You give a sigh of relieve and exit the bushes. “Father?” you call quietly, so as\n" +
        "not to startle him.",
      9
    ),
    new Prompt(8,
      "You walk toward the figure and eventually make out the features of your father’s\n" +
        "face in the dim light. “Hello, Father!” you greet happily. It was always great when\n" +
        "Father returned home. But something seems off this time. Lehi took a couple\n" +
        "staggered steps forward like he was about to fall over."),
    new Prompt(9,
      "“What’s wrong? Are you o-,“ suddenly he stumbles to the ground and you catch\n" +
        "him in the knick of time. You carry him into the house and lay him on the bed."),
    new Prompt(10,
      "“Nephi…” he whispers weakly. “What is it, Father?” you reply, kneeling down to\n" +
        "better hear his almost soundless voice. “This city is a city of wickedness. They\n" +
        "are slow of understanding and hard of heart just as the Prophets have foretold.\n" +
        "They do not remember Jehovah as their God. I fear for them, my son. I fear for\n" +
        "thy brothers.” You think about your two older brothers, Laman and Lemuel.\n" +
        "They aren’t as obedient as you and Sam, but you love and respect them\n" +
        "in only the way a younger brother would understand."),
    new Prompt(11,
      "Your father must have seen the glimmer of fear in your eyes. “Leave me, Nephi,”\n" +
        "Lehi says with a smile and two gentle pats on your hands, which at that moment\n" +
        "were tightly clutching your father’s. “I am well enough off.” You…",
      new String[] {
        "A) Obey your father and leave the room.",
        "B) Refuse to leave and sleep on the ground next to his bed."
      },
      Map.of(
        0, 12,
        1, 13
      )
    ),
    new Prompt(12,
      "You nod and leave the room quietly. You lie down in your bed and\n" +
        "think about what you just saw. (Obedience +1) ",
      14
    ),
    new Prompt(13,
      "You shake your head and lie down next to Lehi’s bed. (Charity +1)"
    ),
    new Prompt(14,
      "Soon night falls and you drift into sleep."
    ),
    new Prompt(15,
      "..."
    ),
    new Prompt(16,
      "This is the end of the demo. Would you like to play again?",
      new String[] {
        "A) Yes",
        "B) No"
      },
      Map.of(
        0, 1,
        1, -1
      )
    )
  ));

  public static Prompt getPrompt(int index) {
    return GAME_TEXT.get(index);
  }
}
