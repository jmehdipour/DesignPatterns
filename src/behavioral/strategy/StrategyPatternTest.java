package behavioral.strategy;

public class StrategyPatternTest {

    public static void main(String[] args) {
        String data = "Some Data";

        ExportData exportData = new ExportData(new SaveAsCSV());

        if (exportData.save(data)){
            System.out.println("exporting data was successful");
        }
    }
}
