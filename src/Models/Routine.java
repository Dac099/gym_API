package Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Routine {
  public int id;
  public LocalDate register;
  public ArrayList<Exercise> exercises;
  public User author;
  public static int counter = 0;

  public Routine(User author, ArrayList<Exercise> exercises){
    this.id = counter;
    this.register = LocalDate.now();
    this.exercises = exercises;
    this.author = author;

    counter += 1;
  }
}
