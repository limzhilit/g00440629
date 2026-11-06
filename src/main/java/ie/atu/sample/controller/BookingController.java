package ie.atu.sample.controller;

import ie.atu.sample.dto.BookingRequest;
import ie.atu.sample.dto.BookingResponse;
import ie.atu.sample.exception.ExceedRoomCapacityException;
import ie.atu.sample.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("/booking")
    public BookingResponse createBooking(@RequestBody BookingRequest bookingRequest) throws ExceedRoomCapacityException {
        return bookingService.createBooking(bookingRequest);

    }
}