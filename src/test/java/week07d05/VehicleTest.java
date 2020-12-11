package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void carTest(){

        Vehicle car = new Car();

        assertEquals(TransmissionType.AUTOMATIC,car.getTransmissionType());
        assertEquals(5, car.getNumberOfGears());
    }

    @Test
    public void motorTest(){

        Vehicle motor = new Motorcycle();

        assertEquals(TransmissionType.SEQUENTIAL,motor.getTransmissionType());
        assertEquals(5, motor.getNumberOfGears());
    }

    @Test
    public void truckTest(){

        Vehicle car = new Truck();

        assertEquals(TransmissionType.MANUAL,car.getTransmissionType());
        assertEquals(5, car.getNumberOfGears());
    }


    @Test
    public void anotherMotorTest(){
        Vehicle motor = new Motorcycle(6, TransmissionType.MANUAL);

        assertEquals(6,motor.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL,motor.getTransmissionType());
        }

    @Test
    public void anotherTruckTest(){

        Vehicle car = new Truck(8);

        assertEquals(TransmissionType.MANUAL,car.getTransmissionType());
        assertEquals(8, car.getNumberOfGears());
    }
    }

