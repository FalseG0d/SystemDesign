package SOLID.OpenClose;
import SOLID.SingleResponsibility.InvoiceDao;

class FileInvoiceDao extends InvoiceDao {
    @Override
    public void saveToDb() {
        // save to file
    }
}