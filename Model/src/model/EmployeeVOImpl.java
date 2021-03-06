package model;


import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 22 13:15:01 EDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeeVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeVOImpl() {
    }

    @Override
    public void executeQuery() {
        System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!execute query!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        super.executeQuery();
    }

    @Override
    protected void executeQueryForCollection(Object object, Object[] object2, int i) {
        System.err.println("!!!!!!!!!!!!!!executeQueryForCollection!!!!!!!!!!!!!!!!!!!!!!!!!");
        super.executeQueryForCollection(object, object2, i);
    }

    public void createEmployees(int numberOfEmployee) {
        purgeVO();
        for (int i = 1; i <= numberOfEmployee; i++) {
            EmployeeVORowImpl createRow = (EmployeeVORowImpl) this.createRow();
            createRow.setEmployeeId(new Number(i));
            createRow.setEmployeeName("Name is : " + i);
            createRow.setAddress("Address is : " + i);
            this.insertRow(createRow);
        }
        System.err.println("query  : " + this.getQuery());


    }

    public void purgeVO() {
        RowSetIterator createRowSetIterator = this.createRowSetIterator(null);
        while (createRowSetIterator.hasNext()) {
            Row row = createRowSetIterator.next();
            setCurrentRow(row);
            removeCurrentRow();
        }
    }
}

