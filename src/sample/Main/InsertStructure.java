package sample.Main;

import java.util.ArrayList;

public class InsertStructure {
    private String table;
    private ArrayList<String> columns;
    private ArrayList<String> values;

    public InsertStructure(String table, ArrayList<String> columns, ArrayList<String> values) {
        this.table = table;
        this.columns = columns;
        this.values = values;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setColumns(ArrayList<String> columns) {
        this.columns = columns;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }

    public String getTable() {
        return table;
    }

    public ArrayList<String> getColumns() {
        return columns;
    }

    public ArrayList<String> getValues() {
        return values;
    }

}