package ie.atu.sample.client;


import ie.atu.sample.dto.RoomResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient (
        name = "RoomService",
        url = "localhost:8082"
)
public interface RoomClient {

    @GetMapping("/api/rooms/{id}")
    RoomResponse getRoomById(@PathVariable Long roomID);
}
