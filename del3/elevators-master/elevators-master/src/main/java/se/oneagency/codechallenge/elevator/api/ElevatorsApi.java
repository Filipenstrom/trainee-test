package se.oneagency.codechallenge.elevator.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "elevators", description = "the pong API")
public interface ElevatorsApi {

    @ApiOperation(value = ".", notes = "", response = Void.class, tags={ "elevators", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    @RequestMapping(value = "/elevators",
        produces = { "text/plain" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> elevators() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
