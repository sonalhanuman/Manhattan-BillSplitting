import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class PaymentSplitting {
    public Map<String,BalanceObj> generateSplit(Map<String,BalanceObj> transactionMap) {
        Map<String,BalanceObj> outputMap = new HashMap<String,BalanceObj>();
        // using for-each loop for iteration over Map.entrySet()
        BigDecimal totalSum = new BigDecimal(0.00);
        for (Map.Entry<String,BalanceObj> entry : transactionMap.entrySet()) {
            String name = entry.getKey();
            BalanceObj balance = entry.getValue();
            totalSum = totalSum.add(balance.getCredit());
        }
        BigDecimal targetPerPerson = totalSum.divide(BigDecimal.valueOf((transactionMap.size())), 2, RoundingMode.HALF_UP);
        for (Map.Entry<String,BalanceObj> entry : transactionMap.entrySet()) {
            String name = entry.getKey();
            BalanceObj balance = entry.getValue();
            balance.setDelta(balance.getCredit().subtract(targetPerPerson));
            outputMap.put(name, balance);
        }
        for (Map.Entry<String,BalanceObj> entry : transactionMap.entrySet()) {
            String nameSelf = entry.getKey();
            BalanceObj balance = entry.getValue();
            if (balance.getDelta().compareTo(new BigDecimal("0.00")) < 0) {
                System.out.println("what the fuck? " + (balance.getDelta().compareTo(new BigDecimal("0.00")) < 0));
                for (Map.Entry<String,BalanceObj> entryDiff : transactionMap.entrySet()) {
                    if (!entryDiff.getKey().equals(nameSelf) && entryDiff.getValue().getDelta().compareTo(new BigDecimal("0.00")) > 0){
                        System.out.println("who to compare to now " + entryDiff.getKey());
                        if (entryDiff.getValue().getDelta().abs().subtract(balance.getDelta().abs()).compareTo(new BigDecimal("0.00")) <= 0) {
                            System.out.println("enter here");
                            balance.getWhoPaywho().put(entryDiff.getKey(), entryDiff.getValue().getDelta().abs());
                        } else {
                            balance.getWhoPaywho().put(entryDiff.getKey(), entryDiff.getValue().getDelta().abs().subtract(balance.getDelta().abs()));
                            System.out.println("holoq there");
                        }
                    }
                }
            }
        }
        return outputMap;
    }
}