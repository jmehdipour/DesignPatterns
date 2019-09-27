package behavioral.strategy;

public class ExportData {
    private ExportStrategy strategy;

    public ExportData(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean save(String data){
        return strategy.save(data);
    }
}
