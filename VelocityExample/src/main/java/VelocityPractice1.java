
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;

public class VelocityPractice1 {
    public static void main(String[] args) {
        // Initialize Velocity Engine
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(VelocityEngine.RESOURCE_LOADER, "class");
        velocityEngine.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        velocityEngine.init();

        // Create a context and add data
        VelocityContext context = new VelocityContext();

        // Load the template
        StringWriter writer = new StringWriter();
        try {
            velocityEngine.getTemplate("stringPractice.vm").merge(context, writer);
            // Output the result
            System.out.println(writer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
