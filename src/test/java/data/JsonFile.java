package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonFile {

    public String Name,Phone,SectionFloor,Table,origin;


    public void JsonReader() throws IOException, ParseException
    {
        String filePath = System.getProperty("user.dir")+"/src/test/java/data/testData.json";

        File srcFile = new File(filePath);

        JSONParser parser  = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jarray)
        {
            JSONObject person = (JSONObject) jsonObj ;
            Name = (String) person.get("Name");
            Phone  = (String) person.get("Phone");
            SectionFloor  = (String) person.get("SectionFloor");
            Table  = (String) person.get("Table");
            origin  = (String) person.get("origin");


        }

    }
}
