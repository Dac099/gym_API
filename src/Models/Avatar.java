package Models;

public class Avatar {
  public enum State {
    BEGINNER,
    MID,
    ENJOYED,
    MUSCLE,
    BEAST,
    ANIMAL
  }

  public int id;
  public String mediaUrl;
  public User author;
  public State state;
  public static int counter = 0;

  public Avatar(User author, String state){
    this.id = counter;
    this.state = State.valueOf(state);
    this.mediaUrl = getMediaAvatarURL();
    this.author = author;

    counter += 1;
  }

  private String getMediaAvatarURL(){
    switch(this.state){
      case BEGINNER:
        System.out.println("Fetching for beginner resource");
        break;
      case MID:
        System.out.println("Fetching for mid resource");
        break;
      case ENJOYED:
        System.out.println("Fetching for enjoyed resource");
        break;
      case MUSCLE:
        System.out.println("Fetching for muscle resource");
        break;
      case BEAST:
        System.out.println("Fetching for beast resource");
        break;
      case ANIMAL:
        System.out.println("Fetching for animal resource");
        break;
      default:
        System.out.println("State reference is not recognized");
    }

    return "URL";
  }
}
