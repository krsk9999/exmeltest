package Core;

/**
 * Created by kramirez on 4/9/16.
 */
public class Filter {
    public String columnHeader;
    public int moveTo;
    public String dataFieldName;
    public String value;

    public Filter(String columnHeader, int moveTo, String dataFieldName) {
        this.columnHeader = columnHeader;
        this.moveTo = moveTo;
        this.dataFieldName = dataFieldName;
    }

    public Filter(String columnHeader, int moveTo, String dataFieldName, String value) {
        this.columnHeader = columnHeader;
        this.moveTo = moveTo;
        this.dataFieldName = dataFieldName;
        this.value = value;
    }
}
