package neotericride;

import appenum.VehicleTypeEnum;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        User user1 = new User();
        Driver driver1 = new Driver();

        VehicleTypeEnum  typeEnum = VehicleTypeEnum.Auto;




        Insurance vehicleInsurance =new Insurance();

        vehicleInsurance.insuranceNumber="6780";

        Insurance driverInsurance = new Insurance();
driverInsurance.insuranceNumber ="5680";
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleNumber="45103";
        vehicle1.driver=driver1;
        vehicle1.vehicleInsurance=vehicleInsurance;
        vehicle1.vehicleType=VehicleTypeEnum.Bike;

        driver1.mobilenumber ="12378";
        driver1.name ="anh";
        driver1.vehicle= vehicle1;
        driver1.drivereInsurance=driverInsurance;









        Location fromlocation =new Location();

        fromlocation.lat = "12.134";
        fromlocation.lgt = "89.76";




        Location tolocation = new Location();

        tolocation.lgt="56.78";
        tolocation.lat="45.89";



        user1.name ="sahitya";
        user1.mobilenumber ="123";
        user1.userid = "N123";

        Task task1 =new Task();
        task1.userid=user1;
        task1.fromLocation=fromlocation;
        task1.toLocation=tolocation;



        JobTaskMapping jobtask1  = new JobTaskMapping();
        jobtask1.task=task1;
        jobtask1.vehicle=vehicle1;
        jobtask1.startTime=new Date();
        jobtask1.endTime=new Date();

        System.out.println(jobtask1.task.userid.name);
        System.out.println(jobtask1.vehicle.driver.name);
    }
}
