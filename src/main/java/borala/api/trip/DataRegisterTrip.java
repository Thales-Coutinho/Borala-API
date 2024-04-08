package borala.api.trip;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DataRegisterTrip(
        @NotBlank
        String day,
        @NotBlank @Pattern(regexp = "\\d{11}")
        String driver_cpf,
        @NotBlank
        String hour,
        @NotBlank
        String departure_city,
        @NotBlank
        String destination_city,
        String local,
        @NotNull
        Float price
) { }
