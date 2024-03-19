package Models;

public class Exercise {
  public int id;
  public String name;
  public String muscle;
  public String equipment;
  public String urlVideo;
  public User author;
  public Workout workout;
  public boolean isPublic;
  public static int counter = 1;

  public Exercise(User author, String name, String muscle, String equipment, Workout workout, String urlVideo){
    this.id = counter;
    this.name = name;
    this.author = author;
    this.muscle = muscle;
    this.equipment = equipment;
    this.workout = workout;
    this.isPublic = urlVideo != null;
    this.urlVideo = urlVideo;

    counter += 1;
  }
}
