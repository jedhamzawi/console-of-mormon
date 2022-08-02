package net.jakehamzawi.game.interaction;

import java.io.IOException;
import java.util.*;

public class PlayerInteractor {
  private static final List<String> CHOICES = new ArrayList<>(
    Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"));
  private static final String INVALID_INPUT = "INVALID";
  private final Printer printer;
  private final Scanner scanner;

  public PlayerInteractor() {
    this.printer = new Printer();
    this.scanner = new Scanner(System.in);
  }

  public int playPrompt(Prompt prompt) throws IOException {
    printer.print(prompt);
    if (prompt.getChoices().length == 0) {
      printer.printProceedMessage();
      getUserInput();
      return -1;
    }

    String userInput = getUserInput();
    while (!validChoice(prompt, userInput)) {
      printer.print(prompt);
      userInput = getUserInput();
    }
    return getChoice(userInput, prompt);
  }

  private boolean validChoice(Prompt prompt, String userInput) {
    if (prompt.getChoices().length == 0) {
      return true;
    }
    return CHOICES.subList(0, prompt.getChoices().length).contains(userInput.toUpperCase(Locale.ROOT)) ||
      CHOICES.subList(0, prompt.getChoices().length).contains(userInput.toLowerCase(Locale.ROOT));
  }

  private int getChoice(String userInput, Prompt prompt) {
    List<String> choiceSublist = CHOICES.subList(0, prompt.getChoices().length);
    for (int i = 0; i < prompt.getChoices().length; i++) {
      if (choiceSublist.get(i).equalsIgnoreCase(userInput)) {
        return i;
      }
    }
    return -1;
  }

  private String getUserInput() {
    String input = scanner.next();
    if (input.length() > 1 ||
      (input.length() == 1 && (!Character.isAlphabetic(input.charAt(0))))) {
      return INVALID_INPUT;
    }
    return input;
  }
}
