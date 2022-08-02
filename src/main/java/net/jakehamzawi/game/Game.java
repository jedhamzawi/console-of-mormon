package net.jakehamzawi.game;

import net.jakehamzawi.game.interaction.PlayerInteractor;
import net.jakehamzawi.game.interaction.Prompt;
import net.jakehamzawi.game.interaction.resources.PromptManager;

import java.io.IOException;

public class Game {
  PlayerInteractor playerInteractor;

  public Game() {
    playerInteractor = new PlayerInteractor();
  }

  public void play() throws IOException {
    int nextPromptIndex = 0;
    while (nextPromptIndex != -1) {
      Prompt nextPrompt = PromptManager.getPrompt(nextPromptIndex);
      int playerChoice = playerInteractor.playPrompt(nextPrompt);
      nextPromptIndex = calculateNextPrompt(playerChoice, nextPrompt);
    }
  }

  private int calculateNextPrompt(int playerChoice, Prompt prompt) {
    return prompt.getNextPromptFromChoice(playerChoice);
  }
}
