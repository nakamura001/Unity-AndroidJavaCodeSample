import com.unity3d.player.UnityPlayerActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class OverrideExample extends UnityPlayerActivity {
  protected void onCreate(Bundle savedInstanceState) {
    // UnityPlayerActivity.onCreate() を呼び出す
    super.onCreate(savedInstanceState);
    //Log.d("OverrideActivity", "onCreate called!");
    
    // 「Java Code」と記述されたダイアログを表示する
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setMessage("Java code")
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
    builder.show();
  }
  public void onBackPressed()
  {
    // UnityPlayerActivity.onBackPressed() を呼び出す代わりに、Back ボタンイベントを無視する
    // super.onBackPressed();
  }
}
