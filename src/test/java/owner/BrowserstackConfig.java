package owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
        "classpath:browserstack.properties"
})
public interface BrowserstackConfig extends Config {
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String url();

    String login();

    String password();

    String app();

    @DefaultValue("Google Pixel 3")
    String device();

    @DefaultValue("9.0")
    String version();
}