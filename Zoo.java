public class Zoo {

    private static Zoo INSTANCE;

    private Zoo () {

    }

    public static Zoo getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Zoo();
        }
        
        return INSTANCE;
    }

}
