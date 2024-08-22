package com.scm.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="supplier")   //map as collection
@Data
@NoArgsConstructor
public class Supplier {
	@Id
    private String supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private List<String> manufacturingProcesses;
}
