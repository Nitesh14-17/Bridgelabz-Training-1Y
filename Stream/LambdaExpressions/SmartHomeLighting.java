interface LightAction {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Motion trigger");
        LightAction time = () -> System.out.println("Time trigger");
        LightAction voice = () -> System.out.println("Voice trigger");
        motion.activate();
        time.activate();
        voice.activate();
    }
}
