package com.javatpoint.springboothelloworldexample.Model;

public class RequestBodyFrom {

    public String model,prompt;
    public int temperature,max_tokens;
    public RequestBodyFrom(String model, String prompt, int temperature, int max_tokens){
        this.model=model;
        this.prompt=prompt;
        this.temperature=temperature;
        this.max_tokens=max_tokens;
    }
}
