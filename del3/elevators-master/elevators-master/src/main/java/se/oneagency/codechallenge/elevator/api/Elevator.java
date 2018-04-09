package se.oneagency.codechallenge.elevator.api;

/**
 * Interface for an elevator object.
 *

 *
 */
public interface Elevator {

    /**
     * Enumeration for describing elevator's direction.
     */
    enum DirectionEnum {
        UP, DOWN, NONE
    }

    /**
     * Tells which direction is the elevator going in.
     *
     * @return DirectionEnum Enumeration value describing the direction.
     */
    DirectionEnum getDirection();

    /**
     * If the elevator is moving. This is the target floor.
     *
     * @return primitive integer number of floor
     */
    int getAddressedFloor();

    /**
     * Get the Id of this elevator.
     *
     * @return primitive integer representing the elevator.
     */
    int getId();

    /**
     * Command to move the elevator to the given floor.
     *
     * @param toFloor
     *            int where to go.
     */
    void moveElevator(int toFloor);

    /**
     * Check if the elevator is occupied at the moment.
     *
     * @return true if busy.
     */
    boolean isBusy();

    /**
     * Reports which floor the elevator is at right now.
     *
     * @return int actual floor at the moment.
     */
    int currentFloor();

}
