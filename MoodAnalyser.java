package MoodAnalyser;

public class MoodAnalyser {


    public String analyseMood(String message) throws Exception {
        class MoodAnalyserException extends Exception {
            public MoodAnalyserException(String message) {
                super(message);
            }
        }

        if (message == null || message.isEmpty()) {
            throw new MoodAnalyserException("Submit A name");
        }
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}







