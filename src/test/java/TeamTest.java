import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Team TOT");
    assertTrue(testTeam instanceof Team);
  }

  @Test
  public void getName_getsTeamName_Team_TOT() {
    Team testTeam = new Team("Team TOT");
    assertEquals("Team TOT", testTeam.getName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team testTeam1 = new Team("Team TOT");
    Team testTeam2 = new Team("DaDa");
    assertTrue(testTeam1.all().contains(testTeam1));
    assertTrue(testTeam2.all().contains(testTeam2));
  }

  @Test
  public void clear_emptiesAllTeamssFromList_0() {
    Team testTeam = new Team("Team TOT");
    Team.clear();
    assertEquals(0, Team.all().size());
  }

}