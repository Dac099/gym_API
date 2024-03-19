package Models;

import java.util.ArrayList;

public class Workout {
  public int id;
  public String name;
  public int rating;
  public User author;
  public int totalForks;
  public ArrayList<Exercise> exercises;
  public ArrayList<String> muscles;
  public ArrayList<String> equipments;
  public static int counter = 0;

  public Workout(String name, User author, ArrayList<Exercise> exercises, ArrayList<String> muscles, ArrayList<String> equipments){
    this.id = counter;
    this.name = name;
    this.rating = 0;
    this.author = author;
    this.totalForks = 0;
    this.exercises = exercises;
    this.muscles = muscles;
    this.equipments = equipments;
  }
}
