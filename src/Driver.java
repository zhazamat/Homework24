public class Driver {
   
    private String id;
 
    private String driverName;
     private String truck;
    private  transient  Truck truckObj;

    public Truck getTruckObj() {
        return truckObj;
    }

    public void setTruckObj(Truck truckObj) {
        this.truckObj = truckObj;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName() {
        this.driverName = driverName;
    }

    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    @Override
    public String toString() {






            return String.format("|%6s", id) + String.format("|%13s", driverName) ;

      //  return String.format("|%6s", id) + String.format("|%12s", driverName) + String.format("|%15s", trucks.clone());

}}
