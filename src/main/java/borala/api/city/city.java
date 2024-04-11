package borala.api.city;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Table(name="cities")
@Entity(name="city")
@Getter
public class city {
    @Id
    private String id;
    private String name;
}
