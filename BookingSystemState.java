package cinema;

/**
 * The BookingSystemState enum represents the various states that the booking system can be in.
 *
 * @version 1.10 31 Aug 2023
 * @author Clayton Mercer
 */
public enum BookingSystemState {

    /**
     * The booking system is not operational.
     */
    OFF,

    /**
     * The booking system is in the menu state, waiting for user input.
     */
    MENU,

    /**
     * The booking system is selecting the row according to user input.
     */
    BUYING_INPUT_ROW,

    /**
     * The booking system is selecting the seat (column) according to user input.
     */
    BUYING_INPUT_SEAT
}
