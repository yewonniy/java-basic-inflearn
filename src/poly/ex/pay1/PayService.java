package poly.ex.pay1;

public class PayService {

    public void processPay(Pay pay, int amount) {

        boolean result;

        if (pay != null) {
            System.out.println("결제를 시작합니다: option=" + pay.getOption() + ", amount=" + amount);
            result = pay.pay(amount);
        } else {
            System.out.println("결제를 시작합니다: option=bad, amount=" + amount);
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}