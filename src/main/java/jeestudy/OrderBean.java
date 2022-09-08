package jeestudy;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@SessionScoped
@Named
public class OrderBean implements Serializable {

    private List<ColumnModel> columns = List.of(
            new ColumnModel("オーダー番号", "orderNo"),
            new ColumnModel("プロダクト名", "productName"),
            new ColumnModel("金額", "price"),
            new ColumnModel("数量", "qty")
    );
    private static final Order[]orderList = new Order[]{

            new Order("A0001", "CPU",
                    new BigDecimal("700.00"), 1),
            new Order("A0002", "Harddisk 10TB",
                    new BigDecimal("500.00"), 2),
            new Order("A0003", "Laptop",
                    new BigDecimal("11600.00"), 8),
            new Order("A0004", "LCD",
                    new BigDecimal("5200.00"), 3),
            new Order("A0005", "A4Tech Mouse",
                    new BigDecimal("100.00"), 10),
            new Order("A0006", "LCD6",
                    new BigDecimal("5200.00"), 3),
            new Order("A0007", "LCD7",
                    new BigDecimal("5200.00"), 3),
            new Order("A0008", "LCD8",
                    new BigDecimal("5200.00"), 3),
            new Order("A0009", "LCD9",
                    new BigDecimal("5200.00"), 3),
            new Order("A0010", "LCD10",
                    new BigDecimal("5200.00"), 3),
            new Order("A0011", "LCD11",
                    new BigDecimal("5200.00"), 3),
            new Order("A0012", "LCD12",
                    new BigDecimal("5200.00"), 3),
            new Order("A0013", "LCD13",
                    new BigDecimal("5200.00"), 3),

    };

    public Order[]getOrderList() {

        return orderList;

    }
    public List<ColumnModel> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnModel> columns) {
        this.columns = columns;
    }
    public static class Order{

        String orderNo;
        String productName;
        BigDecimal price;
        int qty;

        public Order(String orderNo, String productName,
                     BigDecimal price, int qty) {

            this.orderNo = orderNo;
            this.productName = productName;
            this.price = price;
            this.qty = qty;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }
    }

    public static class ColumnModel implements Serializable {

        private String header;
        private String property;

        public ColumnModel(String header, String property) {
            this.header = header;
            this.property = property;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }
    }
}
