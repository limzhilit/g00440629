package ie.atu.sample.dto;

import ie.atu.sample.model.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private int bookingID;

    @NotBlank
    @Size(min = 2)
    @Size(max = 60)
    private String organiserName;

    @Positive
    private int attendeeCount;

    private int roomID;

    private Status status = Status.ACTIVE;
}
