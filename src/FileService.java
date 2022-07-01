import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.sound.midi.Track;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path truck = Paths.get("truck.json");
    private static final Path driver = Paths.get("driver.json");
    public static Truck[] readFile() {
        String json = "";
        try {
            json = Files.readString(truck);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json,Truck[].class);
    }

    public static void writeFile(Truck[] trucks) {
        String json = GSON.toJson(trucks);
        try {
            byte[] arr = json.getBytes();
            Files.write(truck, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Driver[] readFileDriver() {
        String json = "";
        try {
            json = Files.readString(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json,Driver[].class);
    }
    public static void writeFileDriver(Driver[] drivers) {
        String json = GSON.toJson(drivers);
        try {
            byte[] arr = json.getBytes();
            Files.write(driver, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}