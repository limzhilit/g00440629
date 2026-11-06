package ie.atu.sample.exception;

import org.springframework.http.HttpStatus;

public class ExceedRoomCapacityException extends Throwable {
    public ExceedRoomCapacityException(HttpStatus httpStatus, String attandeeCountExceedsRoomCapacity) {
    }
}
