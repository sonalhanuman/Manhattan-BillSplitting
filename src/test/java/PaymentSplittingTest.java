import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PaymentSplittingTest {
    @Test
    public void onePersonPaySplitAmongTwo() {

        BalanceObj junqinBal = new BalanceObj();
        BalanceObj silingBal = new BalanceObj();
        junqinBal.setCredit(new BigDecimal("10.00"));
        Map<String,BalanceObj> transactionMap = new HashMap<String,BalanceObj>();
        transactionMap.put("Jun Qin", junqinBal);
        transactionMap.put("Siling", silingBal);

        BalanceObj junqinBalVS = new BalanceObj();
        BalanceObj silingBalVS = new BalanceObj();
        junqinBalVS.setCredit(new BigDecimal("10.00"));
        junqinBalVS.setDelta(new BigDecimal("5.00"));
        silingBalVS.setDelta(new BigDecimal("-5.00"));
        Map<String,BalanceObj> transactionMapVS = new HashMap<String,BalanceObj>();
        transactionMapVS.put("Jun Qin", junqinBalVS);
        transactionMapVS.put("Siling", silingBalVS);
        PaymentSplitting paymentSplitting = new PaymentSplitting();

        assertEquals(transactionMapVS.toString(), (paymentSplitting.generateSplit(transactionMap)).toString());
        System.out.println(transactionMapVS.toString());
        System.out.println((paymentSplitting.generateSplit(transactionMap)).toString());
    }

    @Test
    public void onePersonPaySplitAmongThree() {

        BalanceObj junqinBal = new BalanceObj();
        BalanceObj silingBal = new BalanceObj();
        BalanceObj sonalBal = new BalanceObj();
        junqinBal.setCredit(new BigDecimal("12.00"));
        Map<String,BalanceObj> transactionMap = new HashMap<String,BalanceObj>();
        transactionMap.put("Jun Qin", junqinBal);
        transactionMap.put("Siling", silingBal);
        transactionMap.put("Sonal", sonalBal);

        BalanceObj junqinBalVS = new BalanceObj();
        BalanceObj silingBalVS = new BalanceObj();
        BalanceObj sonalBalVS = new BalanceObj();
        junqinBalVS.setCredit(new BigDecimal("12.00"));
        junqinBalVS.setDelta(new BigDecimal("8.00"));
        silingBalVS.setDelta(new BigDecimal("-4.00"));
        sonalBalVS.setDelta(new BigDecimal("-4.00"));
        Map<String,BalanceObj> transactionMapVS = new HashMap<String,BalanceObj>();
        transactionMapVS.put("Jun Qin", junqinBalVS);
        transactionMapVS.put("Siling", silingBalVS);
        transactionMapVS.put("Sonal", sonalBalVS);
        PaymentSplitting paymentSplitting = new PaymentSplitting();

        assertEquals(transactionMapVS.toString(), (paymentSplitting.generateSplit(transactionMap)).toString());
        System.out.println(transactionMapVS.toString());
        System.out.println((paymentSplitting.generateSplit(transactionMap)).toString());
    }

    @Test
    public void AllThreePersonsPaySplitAmongThree() {

        BalanceObj junqinBal = new BalanceObj();
        BalanceObj silingBal = new BalanceObj();
        BalanceObj sonalBal = new BalanceObj();
        junqinBal.setCredit(new BigDecimal("34.40"));
        silingBal.setCredit(new BigDecimal("5.20"));
        sonalBal.setCredit(new BigDecimal("40.40"));
        Map<String,BalanceObj> transactionMap = new HashMap<String,BalanceObj>();
        transactionMap.put("Jun Qin", junqinBal);
        transactionMap.put("Siling", silingBal);
        transactionMap.put("Sonal", sonalBal);

        BalanceObj junqinBalVS = new BalanceObj();
        BalanceObj silingBalVS = new BalanceObj();
        BalanceObj sonalBalVS = new BalanceObj();
        junqinBalVS.setCredit(new BigDecimal("34.40"));
        silingBalVS.setCredit(new BigDecimal("5.20"));
        sonalBalVS.setCredit(new BigDecimal("40.40"));
        junqinBalVS.setDelta(new BigDecimal("7.73"));
        silingBalVS.setDelta(new BigDecimal("-21.47"));
        sonalBalVS.setDelta(new BigDecimal("13.73"));
        Map<String,BalanceObj> transactionMapVS = new HashMap<String,BalanceObj>();
        transactionMapVS.put("Jun Qin", junqinBalVS);
        transactionMapVS.put("Siling", silingBalVS);
        transactionMapVS.put("Sonal", sonalBalVS);
        PaymentSplitting paymentSplitting = new PaymentSplitting();

        assertEquals(transactionMapVS.toString(), (paymentSplitting.generateSplit(transactionMap)).toString());
        System.out.println(transactionMapVS.toString());
        System.out.println((paymentSplitting.generateSplit(transactionMap)).toString());
    }
}
