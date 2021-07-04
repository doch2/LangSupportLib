package com.dochsoft.langsupportlib;

import java.util.ArrayList;
import java.util.HashMap;

public class Reference {
    public static String prefix_normal = "§6[LangSupportLib] §r";
    public static String prefix_opMessage = "§b[LangSupportLib-OP메세지] §r";
    public static String prefix_error = "§c§l[LangSupportLib] §7";

    public static String COMMAND_CMD_NOT_PRACTICE_MESSAGE = "버킷창에서는 실행되지 않으니, 게임에서 명령어를 실행해주시기 바랍니다";
    public static String COMMAND_NOTALLOW_NOOP_MESSAGE = "관리자 명령어입니다. 명령어를 이용하실려면 관리자 권한을 취득해주세요";
    public static String COMMAND_NOT_CORRECT = "잘못된 명령어입니다";

    public static final String ConfigFolder = "plugins/LangSupportLib/";



    public static HashMap<String, HashMap<String, String>> langHashMapList = new HashMap();

}
