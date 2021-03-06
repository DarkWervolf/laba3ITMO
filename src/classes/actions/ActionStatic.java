package classes.actions;

import classes.abstracts.Action;
import classes.enums.ActionTypeStatic;

public class ActionStatic extends Action {

    private ActionTypeStatic type;

    public ActionStatic(int value, ActionTypeStatic type) {
        super(value);
        this.type = type;
    }

    public ActionTypeStatic getType(){
        return this.type;
    }

    public String perform(){
        return this.type.outStringAction();
    }
}
