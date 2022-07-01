import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.sound.midi.Track;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    static void Run() throws Exception {
        System.out.println("Ex1");
        System.out.println("---------------------------------------------------------------------");
        System.out.print(String.format("|%3s", "id"));
        System.out.print(String.format("|%20s", "name"));
        System.out.print(String.format("|%10s", "driver"));
        System.out.println(String.format("|%10s |", "state"));
        System.out.println("+---+--------------------+----------+-----------+");
        Truck[] trucks = FileService.readFile();
        Driver[] driver = FileService.readFileDriver();
        for (var truck : trucks) {

            System.out.println(truck);
            //      truck.getStateObj().changeDriver(driver[0]);


        }

        FileService.writeFile(trucks);
        System.out.println("-------------------------------------------------");
        System.out.println(" Ex2");
        System.out.println("-------------------------------------------------");
        System.out.print(String.format("|%6s", "id"));
        System.out.print(String.format("|%13s", "Driver name"));
        System.out.println(String.format("|%15s|", "Truck"));
        System.out.println("+------+-------------+---------------+");
        Driver[] drivers = FileService.readFileDriver();
        Truck[] truck = FileService.readFile();
        for (var driver1 : drivers) {
            if (driver1 == drivers[0])
                System.out.println(drivers[0] + String.format("|%15s|", truck[0].getName()));
            if (driver1 == drivers[1])
                System.out.println(drivers[1] + String.format("|%15s|", truck[2].getName()));
            if (driver1 == drivers[2])
                System.out.println(drivers[2] + String.format("|%15s|", truck[1].getName()));

            //System.out.println(driver);
        }
        FileService.writeFileDriver(drivers);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Ex3");
        System.out.println("------------------------------------------------------------------------------------------");
        for (var t : trucks) {

        for (var dr : drivers) {
            if (dr.getTruck() != null&t.getState().equals("on_base") ) {
                throw new Exception("No available drivers");
            } else {
            dr.setTruck(t.getName());
            if ( t.getDriver()!= "" ) {
                t.setDriver(dr.getDriverName());
                System.out.println("Truck " + dr.getTruck() + "is now driven by " + t.getDriver());
            }
            else System.out.println("Truck " + dr.getTruck() +" has driver or on_route");}

        }
        }

    }





    public static void main(String[] args) throws Exception {
     Run();
         }

    }

