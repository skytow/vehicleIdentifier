package com.workscape.vehicleidentifier;

import static java.lang.String.format;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.workscape.vehicleidentifier.model.Vehicle;
import com.workscape.vehicleidentifier.model.Vehicles;
import com.workscape.vehicleidentifier.vehicle.VehicleTypeRepo;

public class VehicleIdentifier {

    public static void main(String[] args) throws JAXBException {

        InputStream is = VehicleIdentifier.class.getClassLoader().getResourceAsStream("vehicles.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicles.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Vehicles vehicles = (Vehicles) jaxbUnmarshaller.unmarshal(is);

        for (Vehicle veh : vehicles.getVehicles()) {
            String vehType = VehicleTypeRepo.findType(veh);
            System.out.println(format("id: %s, type: %s", veh.getId(), vehType));
        }

    }
}
