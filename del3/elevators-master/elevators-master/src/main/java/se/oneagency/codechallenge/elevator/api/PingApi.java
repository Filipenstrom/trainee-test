package se.oneagency.codechallenge.elevator.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "ping", description = "the ping API")
public interface PingApi {

    @ApiOperation(value = "Check if the REST API service is alive.", notes = "", response = Void.class, tags={ "administration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    @RequestMapping(value = "/ping",
        produces = { "text/plain" }, 
        method = RequestMethod.GET)
    default ResponseEntity<String> ping() {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
