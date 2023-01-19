package com.mongodb.sampleproject.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "persons")
public class PersonDocument {
    private Long id;
    private String firstName;
    private String lastName;
}
