ImageView im=findViewById(R.id.load);
try {
	Bitmap bitmap=BitmapFactory.decodeStream(getAssets().open("load.png"));
	int[] colors={Color.parseColor("#FF656565"),Color.parseColor("#FFF5F5F5")};
	GenshinLoading gl=new GenshinLoading(bitmap,colors);
	im.setImageBitmap(gl.programTo(Integer.parseInt(e.getText().toString())));
}catch(Exception err){}