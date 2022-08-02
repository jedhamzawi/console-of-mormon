package net.jakehamzawi.game.interaction;

import java.util.HashMap;
import java.util.Map;

public class Prompt {
  private final int ID;
  private final String text;
  private final String[] choices;
  // Defines what choice points to which next prompt
  private final Map<Integer, Integer> choiceMap;

  public Prompt(int id, String text) {
    this.ID = id;
    this.text = text;
    this.choices = new String[0];
    this.choiceMap = new HashMap<>();
    this.choiceMap.put(-1, ID+1);
  }

  public Prompt(int id, String text, int nextPrompt) {
    this.ID = id;
    this.text = text;
    this.choices = new String[0];
    this.choiceMap = new HashMap<>();
    this.choiceMap.put(-1, nextPrompt);
  }

  public Prompt(int id, String text, String[] choices, Map<Integer, Integer> choiceMap) {
    this.ID = id;
    this.text = text;
    this.choices = choices;
    this.choiceMap = choiceMap;
  }

  public String getText() {
    return text;
  }

  public String[] getChoices() {
    return choices;
  }

  public int getNextPromptFromChoice(int key) {
    return this.choiceMap.get(key);
  }
}
