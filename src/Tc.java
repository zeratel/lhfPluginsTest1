import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * Created by A on 2015/12/28.
 */
public class Tc implements ApplicationComponent {
    public Tc() {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "Tc";
    }

    public void sayHello(){
        Messages.showMessageDialog("hello","lhf",Messages.getInformationIcon());
    }
}
