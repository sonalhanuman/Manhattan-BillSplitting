import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BalanceObj {

    private BigDecimal credit = new BigDecimal(0.00);
    private BigDecimal debit = new BigDecimal(0.00);;
    private BigDecimal delta = new BigDecimal(0.00);;
    private Map<String, BigDecimal> whoPaywho = new HashMap<>();

    public Map<String, BigDecimal> getWhoPaywho() {
        return whoPaywho;
    }

    public void setWhoPaywho(Map<String, BigDecimal> whoPaywho) {
        this.whoPaywho = whoPaywho;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public BigDecimal getDelta() {
        return delta;
    }

    public void setDelta(BigDecimal delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "BalanceObj{" +
                "credit='" + credit + '\'' +
                ", debit='" + debit + '\'' +
                ", delta='" + delta + '\'' +
                ", whoPaywho='" + whoPaywho.toString() + '\'' +
                '}';
    }
}
