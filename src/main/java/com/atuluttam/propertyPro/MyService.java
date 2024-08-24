package com.atuluttam.propertyPro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:atul.properties")
public class MyService {
    @Value("Hello Students")
    private String message;

    @Value("${myname}")
    private String MyName;

    @Value("${contact}")
    private String mobileno;

    @Value("${cabinno}")
    private Integer cabinno;

    public Integer getCabinno()
    {
        return cabinno;
    }
    public String getMobileno()
    {
        return mobileno;
    }
    public String getMyName()
    {
        return MyName;
    }
    public String getMessage()
    {
        return message;
    }
/*private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
      public String getJavaVersion()
    {
        return environment.getProperty("java.version");
    }


    public String getOsName()
    {

      return environment.getProperty("os.name");
    }

    //To read custom property
    public String readProperty()
    {
        return environment.getProperty("message");
    }*/







}
