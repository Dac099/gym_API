package Models;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
  public int id;
  public String name;
  public String email;
  public String password;
  public ArrayList<Exercise> exercises;
  public ArrayList<Workout> workouts;
  public Avatar avatar;
  public int daysWorkingOut;
  public int daysRestingOff;
  public LocalDate startingRegister;
  public static int counter = 0;

  public User(String name, String email, String password){
    this.id = counter;
    this.name = name;
    this.email = email;
    this.password = password;
    this.daysRestingOff = 0;
    this.daysWorkingOut = 0;
    this.startingRegister = LocalDate.now();
    this.avatar = new Avatar();
    this.exercises = new ArrayList<Exercise>();
    this.workouts = new ArrayList<Workout>();
  }
}
