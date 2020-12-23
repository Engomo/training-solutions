package statemachine.seatheater;

public enum SeatHeaterState {
    OFF {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.THREE;
        }
    },

    ONE {
        SeatHeaterState next() {
            return SeatHeaterState.OFF;
        }
    },

    TWO {
        SeatHeaterState next() {
            return SeatHeaterState.ONE;
        }
    },

    THREE {
        SeatHeaterState next() {
            return SeatHeaterState.TWO;
        }
    };

    abstract SeatHeaterState next();
}
