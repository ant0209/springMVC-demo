package cn.boy2b.module.sys.enums;

import cn.boy2b.common.BizException;

/**
 *@desc 功能类型
 *@author zhouwei
 *@date 2019/8/1 10:03
 */
public enum FunctionTypeEnum {

    MENU(1, "菜单"),

    BUTTON(0, "按钮");

    private int value;
    private String label;
    private FunctionTypeEnum(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public static String getLabel(int value) {
        FunctionTypeEnum[] array = getList();
        for (FunctionTypeEnum yesOrNo : array) {
            if (yesOrNo.getValue() == value) {
                return yesOrNo.getLabel();
            }
        }
        throw new BizException(String.format("FunctionTypeEnum[%d]的值不存在", value));
    }

    public static int getValue(String label) {
        FunctionTypeEnum[] array = getList();
        for (FunctionTypeEnum yesOrNo : array) {
            if (yesOrNo.getLabel().equalsIgnoreCase(label)) {
                return yesOrNo.getValue();
            }
        }
        throw new BizException(String.format("FunctionTypeEnum[%d]的描述不存在", label));
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

    public static FunctionTypeEnum[] getList() {
        return new FunctionTypeEnum[]{MENU, BUTTON};
    }
}
