package behavioral.strategy.example1;

@Component
public class DBService {

    @Autowired
    @Qualifier("mySQL")
    private DB db;

    public void select() {
        db.select();
    }

    public void update() {
        db.update();
    }

    public void delete() {
        db.delete();
    }

    public void insert() {
        db.insert();
    }
}