package java_advanced_01.day14.homework.P2;

public class CashPayment extends Payment {
    private String cashReceiptNumber;

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }

    @Override
    public void pay() throws PayException {
        if (productPrice <= 0) {
            throw new PayException("가격이 잘못되었습니다.");
        }
        System.out.println("현금이 정상적으로 지불되었습니다.");
    }

    @Override
    public String toString() {
        return "[신용카드 결제 정보]\n" + "상점명 : " + shopName + "\n상품명 : " + productName + "\n상품가격 : " + productPrice + "\n현금영수증번호 : " + cashReceiptNumber;
    }
}
