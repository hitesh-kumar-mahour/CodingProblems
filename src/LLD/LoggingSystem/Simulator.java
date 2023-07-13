package LLD.LoggingSystem;

public class Simulator {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"yo");
        logProcessor.log(LogProcessor.DEBUG,"yoyo");
        logProcessor.log(LogProcessor.ERROR,"yoyoyo");
    }
}
