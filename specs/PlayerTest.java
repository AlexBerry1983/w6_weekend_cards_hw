import static org.junit.Assert.*;
import org.junit.*;
import players.*;

public class PlayerTest {

  Player player;

  @Before
  public void before() {
    player = new Player("Alex");
  }

  @Test
  public void canGetName() {
    assertEquals("Alex", player.getName());
  }
}