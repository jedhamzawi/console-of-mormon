package net.jakehamzawi.game.interaction;

import net.jakehamzawi.game.interaction.resources.PromptManager;

import java.io.IOException;

public class Printer {
  private final boolean isWindows;
  public Printer() {
    isWindows = System.getProperty("os.name").startsWith("Windows");
  }

  public void print(Prompt prompt) throws IOException {
    clearConsole();
    System.out.println(prompt.getText());
    System.out.println();
    for (int i = 0; i < prompt.getChoices().length; i++) {
      System.out.println(prompt.getChoices()[i]);
    }
  }

  public void printProceedMessage() {
    System.out.println(PromptManager.PROCEED_STRING);
    System.out.flush();
  }

  private void clearConsole() throws IOException {
    if (isWindows) {
      Runtime.getRuntime().exec("cls");
    }
    else {
      System.out.println("\033[H\033[2J");
    }
  }
}
