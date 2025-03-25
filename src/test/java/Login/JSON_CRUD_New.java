package Login;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSON_CRUD_New {
    static String jsonFilePth = "C:\\Users\\ER\\Desktop\\VIC Store Details.json";

    public static void main(String[] args) throws FileNotFoundException {
        JSONObject jsonObject = new JSONObject(new FileReader(new File(jsonFilePth)));
//        System.out.println("json object is "+jsonObject.toString());
        String data=jsonObject.getJSONObject("Data").getJSONArray("shippingPartners").getJSONObject(0).toString();
        System.out.println(data);
    }
    public void getDataFromJSON(String FilePath, String jsonPath){

    }
}
