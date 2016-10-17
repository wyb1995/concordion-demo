package spec;

import main.Demo;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ConcordionFixture {
    Demo demo = new Demo();
    public String getSayHello(){
        return demo.sayHello();
    }
}
