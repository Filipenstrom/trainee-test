package se.oneagency.codechallenge.elevator.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import se.oneagency.codechallenge.elevator.api.PingApi;

@Controller
public class PingApiController implements PingApi {

    Logger log = LoggerFactory.getLogger(PingApiController.class);


    @Override
    public ResponseEntity<String> ping() {
        log.debug("# PING #");
        return new ResponseEntity<String>("pong", HttpStatus.OK);
    }
}
