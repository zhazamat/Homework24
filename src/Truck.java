public class Truck {
    private  Integer id;
    private String name;
    private String driver;
    private String state;
    private transient State stateObj;
    private transient Driver driverObj;

    public Driver getDriverObj() {
        return driverObj;
    }

    public void setDriverObj(Driver driverObj) {
        this.driverObj = driverObj;
    }

    public Integer getId() {
        return id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public State getStateObj() {
        return stateObj;
    }

    public void setStateObj(State stateObj) {
        this.stateObj = stateObj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return String.format("|%3s", id)+String.format("|%20s",name)+String.format("|%10s",driver)+String.format("|%10s",state);
    }


}
