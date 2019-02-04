package ReplaceTypeCodeWithStateStrategy;

public class Logger {

    private enum State {
        STATE_STOPPED {
            @Override
            public void start() {
                System.out.println("** START LOGGING **");
            }

            @Override
            public void stop() {
                /* Do nothig */
            }

            @Override
            public void log(String info) {
                System.out.println("Ignoring: " + info);
            }
        },

        STATE_LOGGING {
            @Override
            public void start() {
                /* Do nothig */
            }

            @Override
            public void stop() {
                System.out.println("** STOP LOGGING **");
            }

            @Override
            public void log(String info) {
                System.out.println("Logging: " + info);
            }
        };

        public abstract void start();
        public abstract void stop();
        public abstract void log(String info);
    }

    private State _state;

    public Logger() {
        setState(State.STATE_STOPPED);
    }

    public State getState() {
        return _state;
    }

    public void setState(State state) {
        _state = state;
    }

    public void start() {
        _state.start();
        setState(State.STATE_LOGGING);
    }

    public void stop() {
        _state.stop();
        setState(State.STATE_LOGGING);
    }

    public void log(String info) {
        _state.log(info);
    }
}
