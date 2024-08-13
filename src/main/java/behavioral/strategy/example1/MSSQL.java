package behavioral.strategy.example1;

@Component
public class MSSQL implements DB {

    @Override
    public void select() {
        System.out.println("\"Select\" command is running on \"MSSQL\"");
    }

    @Override
    public void update() {
        System.out.println("\"Update\" command is running on \"MSSQL\"");
    }

    @Override
    public void delete() {
        System.out.println("\"Delete\" command is running on \"MSSQL\"");
    }

    @Override
    public void insert() {
        System.out.println("\"Insert\" command is running on \"MSSQL\"");
    }
}