
@Controller
@RequestMapping("/home")
public class HomeController {
  @GetMapping
  public String home(Model model){
    return "forward:/index.html";
  }

}