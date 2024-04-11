package borala.api.city;

public record DataGetCity(
        String id,
        String name

) {
    public DataGetCity(city city){
        this(city.getId(), city.getName());
    }
}
