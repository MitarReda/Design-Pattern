package comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Folder extends Component{

    private List<Component> components =new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        String tab=tab();
        System.out.println(tab+"Folder =>"+name);
        for (Component c:components){
            c.print();
        }
    }

    public Component AddChilds(Component cmp){
        cmp.level=this.level+1;
        this.components.add(cmp);
        return cmp;
    }

    public List<Component> getChildren(){
        return components;
    }

    public Component getChild(String name){

       Optional<Component> component= components.stream().filter(c->c.name == name).findFirst();

        /*for (Component c:components){
            if (Objects.equals(c.name, name)) return c;
        }*/
        if (component.isPresent()) return component.get();
        else return null;
    }
}
