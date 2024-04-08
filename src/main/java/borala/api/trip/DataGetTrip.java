package borala.api.trip;

public record DataGetTrip(
        String day,
        String driver_cpf,
        String hour,
        String departure_city,
        String destination_city,
        String local,
        Float price
) {
    public DataGetTrip(trip trip){
        this(trip.getDay(), trip.getDriver_cpf(),trip.getHour(), trip.getDeparture_city(), trip.getDestination_city(), trip.getLocal(), trip.getPrice());
    }
}
