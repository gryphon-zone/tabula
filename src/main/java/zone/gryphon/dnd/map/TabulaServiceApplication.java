package zone.gryphon.dnd.map;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TabulaServiceApplication extends Application<TabulaServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TabulaServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "TabulaService";
    }

    @Override
    public void initialize(final Bootstrap<TabulaServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TabulaServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
