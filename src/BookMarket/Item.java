package BookMarket;

public abstract class Item {
    String bookID;
    String name;
    int unitPrice;

    public Item(String bookID, String name, int unitPrice) {
        this.bookID = bookID;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    abstract String getBookID();

    abstract String getName();

    abstract int getUnitPrice();

    abstract void setBookID(String bookID);

    abstract void setName(String name);

    abstract void setUnitPrice(int unitPrice);
}
