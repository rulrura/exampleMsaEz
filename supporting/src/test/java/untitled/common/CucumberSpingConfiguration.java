package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.SupportingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingApplication.class })
public class CucumberSpingConfiguration {}
