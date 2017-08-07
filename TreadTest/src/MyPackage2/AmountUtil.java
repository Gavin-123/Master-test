package MyPackage2;

import java.math.BigDecimal;

public class AmountUtil {
    
    /**
     * 将分为单位的转换为元并返回金额格式的字符串 （除100）
     * 
     * @param amount
     * @return
     */
    public static String changeF2Y(Long amount) {
        if (amount == null) {
            return "0.00";
        }
        
        int flag = 0;
        String amString = amount.toString();
        if (amString.charAt(0) == '-') {
            flag = 1;
            amString = amString.substring(1);
        }
        StringBuffer result = new StringBuffer();
        if (amString.length() == 1) {
            result.append("0.0").append(amString);
        }
        else if (amString.length() == 2) {
            result.append("0.").append(amString);
        }
        else {
            String intString = amString.substring(0, amString.length() - 2);
            for (int i = 1; i <= intString.length(); i++) {
                if ((i - 1) % 3 == 0 && i != 1) {
                    result.append(",");
                }
                result.append(intString.substring(intString.length() - i, intString.length() - i + 1));
            }
            result.reverse().append(".").append(amString.substring(amString.length() - 2));
        }
        if (flag == 1) {
            return "-" + result.toString();
        }
        else {
            return result.toString();
        }
    }
    
    /**
	 * 将元为单位的转换为分 替换小数点，支持以逗号区分的金额
	 * 
	 * @param amount
	 * @return
	 */
	public static long changeY2F(String amount) {
		int index = amount.indexOf(".");
		int length = amount.length();
		Long amLong = 0l;
		if (index == -1) {
			amLong = Long.valueOf(amount + "00");
		} else if (length - index >= 3) {
			amLong = Long.valueOf((amount.substring(0, index + 3)).replace(".", ""));
		} else if (length - index == 2) {
			amLong = Long.valueOf((amount.substring(0, index + 2)).replace(".", "") + 0);
		} else {
			amLong = Long.valueOf((amount.substring(0, index + 1)).replace(".", "") + "00");
		}
		return amLong;
	}
	

    /**
     * 处理金额,分转为元
     *
     * @param amount
     * @return
     */
    public static String handleMoney(long amount) {
        BigDecimal bd = new BigDecimal(amount);

        return bd.setScale(2, BigDecimal.ROUND_HALF_UP).divide(BigDecimal.TEN).divide(BigDecimal.TEN).toString();
    }

}
