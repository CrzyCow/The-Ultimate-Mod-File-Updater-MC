import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private List<String> dataList;

    public VersionStorage() {
        // Initialize the data storage
        dataList = new ArrayList<>();
        // Add Minecraft versions
        dataList.add("1.12");
        dataList.add("1.12.1");
        dataList.add("1.12.2");
        dataList.add("1.13");
        dataList.add("1.13.1");
        dataList.add("1.13.2");
        dataList.add("1.14");
        dataList.add("1.14.1");
        dataList.add("1.14.2");
        dataList.add("1.14.3");
        dataList.add("1.14.4");
        dataList.add("1.15");
        dataList.add("1.15.1");
        dataList.add("1.15.2");
        dataList.add("1.16");
        dataList.add("1.16.1");
        dataList.add("1.16.2");
        dataList.add("1.16.3");
        dataList.add("1.16.4");
        dataList.add("1.16.5");
        dataList.add("1.17");
        dataList.add("1.17.1");
        dataList.add("1.18");
        dataList.add("1.18.1");
        dataList.add("1.18.2");
        dataList.add("1.19");
        dataList.add("1.19.1");
        dataList.add("1.19.2");
        dataList.add("1.19.3");
        dataList.add("1.19.4");
        dataList.add("1.20");
        dataList.add("1.20.1");
        dataList.add("1.20.2");
        dataList.add("1.20.3");
        dataList.add("1.20.4");
    }
    

    public void addData(String data) {
        // Add data to the storage
        dataList.add(data);
    }

    public List<String> getAllData() {
        // Retrieve all data from the storage
        return new ArrayList<>(dataList); // Return a copy to prevent direct modification of internal data
    }

    public boolean containsData(String data) {
        // Check if the storage contains the specified data
        return dataList.contains(data);
    }

    public void clearData() {
        // Clear all data from the storage
        dataList.clear();
    }
}
