package com.scm.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.scm.Entity.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier, String> {
    List<Supplier> findByLocation(String location);
    List<Supplier> findByNatureOfBusiness(String natureOfBusiness);
    List<Supplier> findByManufacturingProcessesContaining(String manufacturingProcess); 
    List<Supplier> findByLocationAndNatureOfBusiness(String location, String natureOfBusiness);
    List<Supplier> findByLocationAndManufacturingProcess(String location, String manufacturingProcess);
    List<Supplier> findByNatureOfBusinessAndManufacturingProcess(String natureOfBusiness, String manufacturingProcess);
	List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(String location, String natureOfBusiness, String manufacturingProcess);

}
