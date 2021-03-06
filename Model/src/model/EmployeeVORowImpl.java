package model;

import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 22 13:15:00 EDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeeVORowImpl extends ViewRowImpl {
    public static final int ENTITY_EMPLOYEEEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Address,
        EmployeeId,
        EmployeeName;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeVORowImpl() {
    }

    /**
     * Gets EmployeeEO entity object.
     * @return the EmployeeEO
     */
    public EntityImpl getEmployeeEO() {
        return (EntityImpl) getEntity(ENTITY_EMPLOYEEEO);
    }

    /**
     * Gets the attribute value for ADDRESS using the alias name Address.
     * @return the ADDRESS
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for ADDRESS using the alias name Address.
     * @param value value to set the ADDRESS
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_NAME using the alias name EmployeeName.
     * @return the EMPLOYEE_NAME
     */
    public String getEmployeeName() {
        return (String) getAttributeInternal(EMPLOYEENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_NAME using the alias name EmployeeName.
     * @param value value to set the EMPLOYEE_NAME
     */
    public void setEmployeeName(String value) {
        setAttributeInternal(EMPLOYEENAME, value);
    }
}

