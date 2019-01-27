package IntroduceNullObject;

public class Label {

    private final String _label;

    public Label(String label) {
        _label = label;
    }

    public void display() {
        System.out.println("display: " + _label);
    }

    public String toString() {
        return "\"" + _label + "\"";
    }

    public boolean isNull() {
        return false;
    }

    // Factory Method
    public static Label newNull() {
        return NullLabel.getInstance();
    }

    // Null Object
    private static class NullLabel extends Label {
        // Singleton
        private static final NullLabel singleton = new NullLabel();

        private static NullLabel getInstance() {
            return singleton;
        }

        private NullLabel() {
            super("(none)");
        }

        @Override
        public void display() {}

        @Override
        public boolean isNull() {
            return true;
        }
    }
}
