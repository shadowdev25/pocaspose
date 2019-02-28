package poc.database;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PersistentEntity {

    @Column(name = "CREATION_TIME") private LocalDateTime creationTime;
    @Column(name = "CREATED_BY") private String createdBy;
    @Column(name = "UPDATED_TIME") private LocalDateTime updatedTime;
    @Column(name = "UPDATED_BY") private String updatedBy;


}