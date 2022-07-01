public class On_Base extends State{


    @Override
    public void changeDriver(Truck truck) throws Exception {

    }

    @Override
    public void changeDriver(Driver driver,Truck truck) throws Exception {
        if(driver.getTruckObj()==null){
            driver.setTruckObj(new Truck());
            if(truck.getDriverObj()!=null){
                truck.setDriverObj(new Driver());
                System.out.println("Truck"+driver.getTruckObj() + "is now driven by driver "+truck.getDriverObj());
            }
            System.out.println("Truck"+driver.getTruckObj() + "is now driven by driver "+truck.getDriverObj());
        }
        else throw new Exception("No available drivers");
    }


    @Override
    public void startDriving(Truck truck) throws Exception {
truck.setStateObj(new On_Route());
        System.out.println("status on route");
    }

    @Override
    public void startRepair(Truck truck) throws Exception {
truck.setStateObj(new On_Repair());
        System.out.println("status on repair");
    }


}
