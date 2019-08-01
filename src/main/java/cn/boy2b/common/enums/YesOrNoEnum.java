package cn.boy2b.common.enums;

import cn.boy2b.common.BizException;

/**
 *@desc 是否的枚举
 *@author zhouwei
 *@date 2019-7-2 13:38
 */
public enum YesOrNoEnum {

    YES(1, "是"),

    NO(0, "否");

    private int value;
    private String label;
    private YesOrNoEnum(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public static String getLabel(int value) {
        YesOrNoEnum[] array = getList();
        for (YesOrNoEnum yesOrNo : array) {
            if (yesOrNo.getValue() == value) {
                return yesOrNo.getLabel();
            }
        }
        throw new BizException(String.format("YesOrNoEnum中[%d]的值不存在", value));
    }

    public static int getValue(String label) {
        YesOrNoEnum[] array = getList();
        for (YesOrNoEnum yesOrNo : array) {
            if (yesOrNo.getLabel().equalsIgnoreCase(label)) {
                return yesOrNo.getValue();
            }
        }
        throw new BizException(String.format("YesOrNoEnum中[%d]的描述不存在", label));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static YesOrNoEnum[] getList() {
        return new YesOrNoEnum[]{YES, NO};
    }
}
