import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class app {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout  = "templates/layout.vtl";
    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/hello.vtl");
              return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    get("/travels", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/travels.vtl");
              return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

 }
}
