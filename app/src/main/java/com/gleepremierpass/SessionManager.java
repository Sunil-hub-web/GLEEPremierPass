package com.gleepremierpass;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    SharedPreferences sharedprefernce;
    SharedPreferences.Editor editor;
    Context context;
    int PRIVATE_MODE=0;

    private static final String PREF_NAME="sharedcheckLogin";
    private static final String FCMId="FCMId";

    public SessionManager(Context context){

        this.context =  context;
        sharedprefernce = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedprefernce.edit();

       /* sharedprefernceCoupon=context.getSharedPreferences(PREF_NAME2,PRIVATE_MODE);
        editorCoupon=sharedprefernceCoupon.edit();*/

    }

    public void setFCMId(String number){

        editor.putString(FCMId,number);
        editor.commit();
    }

    public String getFCMId(){

        return sharedprefernce.getString(FCMId,"");
    }


}
