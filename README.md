### Genshin Loading(Android)
<img src="./load.png">
```java
    Bitmap bitmap=BitmapFactory.decodeStream(getAssets().open("load.png"));
    int[] colors={Color.parseColor("#FF656565"),Color.parseColor("#FFF5F5F5")};
    final GenshinLoading gl=new GenshinLoading(bitmap,colors);
```
