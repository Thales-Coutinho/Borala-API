package borala.api.trip;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="trips")
@Entity(name="trip")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String day;
    private String driverCPF;
    private String hour;
    private String departure_city;
    private String destination_city;
    private String local;
    private Float price;

    public trip(DataRegisterTrip data) {
        this.day = data.day();
        this.driverCPF = data.driverCPF();
        this.hour = data.hour();
        this.departure_city = data.departure_city();
        this.destination_city = data.destination_city();
        this.local = data.local();
        this.price = data.price();
    }
}
