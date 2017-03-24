import java.util.List;
import java.util.ArrayList;

public class Team {

  private String mName;
  private static List<Team> instances = new ArrayList<Team>();
  private int mId;

  public Team(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public int getId() {
    return mId;
  }

  public static List<Team> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

}
