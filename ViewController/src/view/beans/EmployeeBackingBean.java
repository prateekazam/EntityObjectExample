package view.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


public class EmployeeBackingBean {
    private RichPanelGroupLayout panelGroupBinding;

    public EmployeeBackingBean() {
        super();
    }

    private int _numberEmployee;

    public void setNumberEmployee(int _numberEmployee) {
        this._numberEmployee = _numberEmployee;
    }

    public int getNumberEmployee() {
        return _numberEmployee;
    }

    public void clickAction(ActionEvent act) {
        System.err.println("inside the this method");
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding binding = bindings.getOperationBinding("getEmployees");
        binding.getParamsMap().put("numberOfEmployee", getNumberEmployee());
        binding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(panelGroupBinding);
    }

    public void setPanelGroupBinding(RichPanelGroupLayout panelGroupBinding) {
        this.panelGroupBinding = panelGroupBinding;
    }

    public RichPanelGroupLayout getPanelGroupBinding() {
        return panelGroupBinding;
    }
}
