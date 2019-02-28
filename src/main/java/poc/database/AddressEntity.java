package poc.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_ADDRESS")
public class AddressEntity extends PersistentEntity {

    @Id private Long id;

    @Column(name = "ADDRESS_LINE_1", nullable = false) private String addressLine1;
    @Column(name = "ADDRESS_LINE_2") private String addressLine2;
    @Column(name = "ADDRESS_LINE_3") private String addressLine3;
    @Column(name = "CITY", nullable = false) private String city;
    @Column(name = "COUNTRY") private String country;
    @Column(name = "ZIP_CODE", nullable = false) private Integer zipCode;


}