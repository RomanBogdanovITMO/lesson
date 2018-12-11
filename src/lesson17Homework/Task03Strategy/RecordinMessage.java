package lesson17Homework.Task03Strategy;

public class RecordinMessage {
    private ILogger iLogger;

    public void setiLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }
    public void recording(String message){
        iLogger.write(message);
    }
}
