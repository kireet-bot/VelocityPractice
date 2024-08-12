
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;

public class VelocityPractice1 {
    public static void main(String[] args) {
        
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(VelocityEngine.RESOURCE_LOADER, "class");
        velocityEngine.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        velocityEngine.init();

        
        VelocityContext context = new VelocityContext();

        
        StringWriter writer = new StringWriter();
        try {
            velocityEngine.getTemplate("stringPractice.vm").merge(context, writer);
            
            System.out.println(writer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
