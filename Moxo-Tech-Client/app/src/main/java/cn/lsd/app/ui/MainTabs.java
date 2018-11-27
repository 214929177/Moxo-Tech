package cn.lsd.app.ui;


import cn.lsd.app.R;
import cn.lsd.app.ui.CourseTable.fragment.CourseTableFragment;
import cn.lsd.app.ui.setting.fragment.SettingFragment;
import cn.lsd.app.ui.groupclass.fragment.BKFragment;


public enum MainTabs {

    TAB_WX(0, R.string.main_tab_meizhi1, R.drawable.tab_icon_active, BKFragment.class),
    TAB_GAN(1, R.string.main_tab_meizhi2, R.drawable.tab_icon_gan, CourseTableFragment.class),
    TAB_SETTING(2, R.string.main_tab_meizhi3, R.drawable.tab_icon_user, SettingFragment.class);

    private int index;
    private int nameRes;
    private int iconRes;
    private Class<?> clazz;

    MainTabs(int index, int nameRes, int iconRes, Class<?> clazz) {
        this.index = index;
        this.nameRes = nameRes;
        this.iconRes = iconRes;
        this.clazz = clazz;
    }


    public int getIndex() {
        return index;
    }

    public int getNameRes() {
        return nameRes;
    }

    public int getIconRes() {
        return iconRes;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
