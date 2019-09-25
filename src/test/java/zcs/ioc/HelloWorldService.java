package zcs.ioc;

public class HelloWorldService {
    private String text;

    private OutputService outputService;

    public OutputService getOutputService() {
        return outputService;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void helloWorld(){
        System.out.println(text);
    }
}
