package poly.ex.pay1;


public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        Pay kakaoPay = new KakaoPay();
        int amount1 = 5000;
        payService.processPay(kakaoPay, amount1);

        //naver 결제
        Pay naverPay = new NaverPay();
        int amount2 = 10000;
        payService.processPay(naverPay, amount2);

        //잘못된 결제 수단 선택
        Pay payOption3 = null;
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

    }

}
