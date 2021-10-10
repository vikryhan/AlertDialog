# AlertDialogOnBackPressed

AlertDialogOnBackPressed Merupakan sebuah fitur tambahan yang berfungsi untuk mengaktifkan sebuah perintah memunculkan alert dialog ketika menekan tombol pada pada home default layout projek android (Activity Main)
 
Screen Shoot:

![WhatsApp Image 2021-10-10 at 10 25 58 PM](https://user-images.githubusercontent.com/12369746/136702424-da210359-6520-48d3-b1e5-13708fd92ff4.jpeg)

Cara Buatnya:
[![Watch the video](https://user-images.githubusercontent.com/12369746/136702560-a5d4e991-d9d2-4662-b470-40b4c52b15a7.png)](
 https://www.youtube.com/watch?v=uX-OeWeFVHs)

1. Tambahkan kode dibawah ini pada res > values > themes.xml (+pada themes.xml (night juga))
```java
    <style name="theme" parent="Theme.AppCompat.Light.Dialog.Alert">
        <!--buttons color-->
        <item name="colorAccent">#f8a545</item>
        <!--title and message color-->
        <item name="android:textColorPrimary">@android:color/black</item>
        <!--dialog background-->
        <item name="android:windowBackground">@drawable/background_alert_dialog</item>
        <item name="buttonBarNegativeButtonStyle">@style/NegativeButtonStyle</item>
        <item name="buttonBarPositiveButtonStyle">@style/PositiveButtonStyle</item>
    </style>

    <style name="NegativeButtonStyle" parent="Widget.AppCompat.Button.ButtonBar.AlertDialog">
        <item name="android:textColor">@color/teal_700</item>
    </style>

    <style name="PositiveButtonStyle" parent="Widget.AppCompat.Button.ButtonBar.AlertDialog">
        <item name="android:textColor">@color/teal_700</item>
    </style>
```

2. Buat file pada drawable dengan nama background_alert_dialog.xml dengan isi seperti di bawah ini
```java
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:insetLeft="5dp"
    android:insetTop="5dp"
    android:insetRight="5dp"
    android:insetBottom="5dp">

    <shape android:shape="rectangle">
        <corners android:radius="25dp" />
        <solid android:color="#FFFFFF" />
        <stroke android:width="5dp" android:color="@color/teal_700" />
    </shape>
</inset>
```
3. Pada Activity Main tambahkan kode berikut:
```java
@Override
    public void onBackPressed() {
        new AlertDialog.Builder(this);
        AlertDialog dialog = new AlertDialog.Builder(this, R.style.theme)
                .setTitle(R.string.app_name)
                .setMessage("apakah ingin keluar dari aplikasi ini?")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
```

4. Selamat mencoba, lebih detailnya dan penjelasan lengkap lihat video ya :)
