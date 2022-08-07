package owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
        "classpath:local.properties"
})
public interface LocalConfig extends Config {
    @DefaultValue("http://localhost:4723/wd/hub")
    String url();

    @DefaultValue("android")
    String platformName();

    @DefaultValue("Pixel 4 API 30")
    String deviceName();

    @DefaultValue("11.0")
    String platformVersion();
}