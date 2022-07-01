public class On_Route extends State{

    @Override
    public void changeDriver(Truck truck) throws Exception {
throw new Exception("Can't change the route");
    }


    @Override
    public void changeDriver(Driver driver,Truck truck) throws Exception {

    }


    @Override
    public void startDriving(Truck truck) throws Exception {
        throw new Exception("Can't start driving. Truck already route");

    }

    @Override
    public void startRepair(Truck truck) throws Exception {
truck.setStateObj(new On_Repair());
throw new Exception("You changed New Repair");
    }
}
