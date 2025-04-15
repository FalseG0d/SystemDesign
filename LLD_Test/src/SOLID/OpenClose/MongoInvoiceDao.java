package SOLID.OpenClose;
import SOLID.SingleResponsibility.InvoiceDao;

public class MongoInvoiceDao extends InvoiceDao {
    @Override
    public void saveToDb() {
        // save to mongo db
    }
}
