package se.oneagency.codechallenge.elevator.resources;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import se.oneagency.codechallenge.elevator.handler.ElevatorApplication;

/**
 * Boiler plate test class to get up and running with a test faster.
 *

 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = ElevatorApplication.class)
public class ElevatorControllerTest {

    @Autowired
    private PingApiController pingApiController;

    @Autowired
    private ElevatorsApiController elevatorsApiController;

    @Test
    public void ping() {
        ResponseEntity<String> ping = pingApiController.ping();

        Assert.assertEquals(200, ping.getStatusCodeValue());
        Assert.assertEquals("pong", ping.getBody());

    }

    @Test
    public void elevators() {
        ResponseEntity<Void> elevators = elevatorsApiController.elevators();

        Assert.assertEquals(200, elevators.getStatusCodeValue());

    }

}
