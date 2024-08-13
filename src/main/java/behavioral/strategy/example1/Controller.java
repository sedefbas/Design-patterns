package behavioral.strategy.example1;

@RestController
public class Controller {

    @Autowired
    private DBService dbService;

    @GetMapping("/select")
    public void select() {
        dbService.select();
    }

    @GetMapping("/update")
    public void update() {
        dbService.update();
    }

    @GetMapping("/delete")
    public void delete() {
        dbService.delete();
    }

    @GetMapping("/insert")
    public void insert() {
        dbService.insert();
    }
}