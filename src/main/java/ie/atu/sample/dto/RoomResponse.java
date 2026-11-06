package ie.atu.sample.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomResponse {
    private Long id;

    private String name;
    private int capacity;


}
