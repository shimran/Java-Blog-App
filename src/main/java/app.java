import static spark.Spark.*;

public class app {
  public static void main(String[] args) {
     get("/hello", (request, response) -> "Welcome to ShimCity!");
  }
}
