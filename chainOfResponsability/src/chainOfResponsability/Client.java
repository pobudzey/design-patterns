package chainOfResponsability;

public class Client {

    private static Logger getChainOfLoggers() {

        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO,"This is an information.");
        loggerChain.logMessage(Logger.DEBUG,"This is an debug level information.");
        loggerChain.logMessage(Logger.ERROR,"This is an error information.");
    }

}