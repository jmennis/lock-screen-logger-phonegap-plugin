package com.jmennis.lockscreenloggerplugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Screen extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("init")) {
            System.out.println("PLUGIN: Screen - init");
            // String name = data.getString(0);
            // String message = "Hello, " + name;
            callbackContext.success(message);
            return true;
        } else if (action.equals("getScreenStatus")) {
            System.out.println("PLUGIN: Screen - getScreenStatus");
            callbackContext.success(message);
            return true;
        } else {
            return false;
        }
    }
}
//
// public class ScreenReceiver extends BroadcastReceiver {
//     System.out.println("PLUGIN: ScreenReceiver");
//     private boolean screenOff;
//
//     @Override
//     public void onReceive(Context context, Intent intent) {
//         System.out.println("PLUGIN: onReceive");
//         if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
//             screenOff = true;
//             System.out.println("SCREEN TURNED OFF");
//         } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
//             screenOff = false;
//             System.out.println("SCREEN TURNED ON");
//         }
//         Intent i = new Intent(context, UpdateService.class);
//         i.putExtra("screen_state", screenOff);
//         context.startService(i);
//     }
//
// }
//
// public static class UpdateService extends Service {
//         @Override
//         public void onCreate() {
//             System.out.println("PLUGIN: UpdateService onCreate");
//             super.onCreate();
//             // REGISTER RECEIVER THAT HANDLES SCREEN ON AND SCREEN OFF LOGIC
//             IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
//             filter.addAction(Intent.ACTION_SCREEN_OFF);
//             BroadcastReceiver mReceiver = new ScreenReceiver();
//             registerReceiver(mReceiver, filter);
//         }
//
//         @Override
//         public void onStart(Intent intent, int startId) {
//             boolean screenOn = intent.getBooleanExtra("screen_state", false);
//             if (!screenOn) {
//                 // YOUR CODE
//
//             } else {
//                 // YOUR CODE
//
//             }
//         }
// }
